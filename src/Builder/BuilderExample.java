/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author joshua
 */
public class BuilderExample {

    public static void main(String[] arg) {
        String swIngCourseModel = (String) ERHardCodedDirector.getModel(new OrientedERBuilder());
        System.out.println(swIngCourseModel);
        ERModel dbCourseModel = (ERModel) ERHardCodedDirector.getModel(new NotOrientedERBuilder());
        dbCourseModel.showStructure();
        /**
         * Bad code
        swIngCourseModel = (String) ERHardCodedDirector.getModel(new NotOrientedERBuilder());
        System.out.println(swIngCourseModel);
        dbCourseModel = (ERModel) ERHardCodedDirector.getModel(new OrientedERBuilder());
        dbCourseModel.showStructure();
         */
    }
}
