/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Decorator;

/**
 *
 * @author joshua
 */
abstract class ResponsibleWorker implements Employee {

    protected Employee responsible;

    public ResponsibleWorker(Employee employee) {
        responsible = employee;
    }

    @Override
    public String getName() {
        return responsible.getName();
    }

    @Override
    public String getOffice() {
        return responsible.getOffice();
    }

    @Override
    public void whoIs() {
        responsible.whoIs();
    }
}
