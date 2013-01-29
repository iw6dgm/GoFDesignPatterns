/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
public class Engineer implements Employee {

    private String name, office;

    public Engineer(String nam, String off) {
        name = nam;
        office = off;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public void whoIs() {
        System.out.println("I am " + getName() + ", and I am with the "
                + getOffice() + ".");
    }
;
}
