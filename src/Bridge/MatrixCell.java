/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Bridge;

/**
 *
 * @author joshua
 */
public class MatrixCell {

    public int row, col, value;

    public MatrixCell(int r, int c) {
        row = r;
        col = c;
        value = 0;
    }
}
