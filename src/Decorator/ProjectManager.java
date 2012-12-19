/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author joshua
 */
public class ProjectManager extends ResponsibleWorker {

    private String project;

    public ProjectManager(Employee empl, String proj) {
        super(empl);
        project = proj;
    }

    @Override
    public void whoIs() {
        super.whoIs();
        System.out.println("I am the Manager of the Project:" + project);
    }
}
