/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
