/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joshua
 */
class TVSetChannelCommand implements Command {

    private TV theTV;

    public TVSetChannelCommand(TV someTV) {
        theTV = someTV;
    }

    @Override
    public void execute() {
        int currentChannel = acceptNumber();
        theTV.setChannel(currentChannel);
    }

    private int acceptNumber() {
        int chInput = 0;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println("Enter the channel number:");
            chInput = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Error");
        }
        return chInput;
    }
}