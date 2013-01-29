/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Builder;

/**
 *
 * @author joshua
 */
public class NotOrientedERBuilder extends ModelBuilder {

    private ERModel model;

    public NotOrientedERBuilder() {
        model = new ERModel();
    }

    @Override
    public void addEntity(String name) {
        model.addEntity(name);
    }

    @Override
    public void addRelationship(String fromEntity,
            String toEntity,
            String relation) {
        model.addRelationship(fromEntity, toEntity, relation);
    }

    @Override
    public void addCardMin(String entity, String relation,
            String value) {
        model.addCardMin(entity, relation, value);
    }

    @Override
    public void addCardMax(String entity, String relation,
            String value) {
        model.addCardMax(entity, relation, value);
    }

    @Override
    public Object getModel() {
        return model;
    }
}
