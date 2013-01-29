/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Composite;

/**
 *
 * @author joshua
 */
public class SinglePart extends Component {

    public SinglePart(String aName) {
        super(aName);
    }

    @Override
    public void add(Component c) throws SinglePartException {
        throw new SinglePartException();
    }

    @Override
    public void remove(Component c) throws SinglePartException {
        throw new SinglePartException();
    }

    @Override
    public Component getChild(int n) {
        return null;
    }

    @Override
    public void describe() {
        System.out.println("Component: " + name);
    }
}
