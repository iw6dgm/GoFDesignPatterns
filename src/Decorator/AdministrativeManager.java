/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
public class AdministrativeManager extends ResponsibleWorker {

    public AdministrativeManager(Employee empl) {
        super(empl);
    }

    @Override
    public void whoIs() {
        sayIamBoss();
        super.whoIs();
    }

    private void sayIamBoss() {
        System.out.print("I am a boss. ");
    }
}
