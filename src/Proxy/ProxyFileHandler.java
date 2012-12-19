/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author joshua
 */
public class ProxyFileHandler extends FileHandler {

    private RealFileHandler realHandler;
    private int lineNumber;
    private String lineText;

    public ProxyFileHandler(String fName) {
        super(fName);
        System.out.println("(creating a proxy cache)");
    }

    @Override
    public String getContent() {
        if (realHandler == null) {
            realHandler = new RealFileHandler(fileName);
        }
        return realHandler.getContent();
    }

    @Override
    public String getLine(int requestedLine) {
        if (requestedLine == lineNumber) {
            System.out.println("(accessing from proxy cache)");
            return lineText;
        } else {
            if (realHandler == null) {
                realHandler = new RealFileHandler(fileName);
            }
            lineText = realHandler.getLine(requestedLine);
            lineNumber = requestedLine;
        }
        return lineText;
    }
}
