/*
 * Based on http://eii.ucv.cl/pers/guidi/documentos/Guidi-GoFDesignPatternsInJava.pdf
 */
package Bridge;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author joshua
 */
public abstract class Matrix {

    int rows, cols;
    Collection data;

    protected Matrix(int rows, int cols, Collection collection) {
        this.rows = rows;
        this.cols = cols;
        data = collection;
    }

    protected MatrixCell createPosition(int row, int col)
            throws MatrixIndexOutOfBoundsException {
        MatrixCell mc = getPosition(row, col);
        if (mc == null) {
            mc = new MatrixCell(row, col);
        }
        data.add(mc);
        return mc;
    }

    protected void deletePosition(MatrixCell toDelete)
            throws MatrixIndexOutOfBoundsException {
        data.remove(toDelete);
    }

    protected MatrixCell getPosition(int row, int col)
            throws MatrixIndexOutOfBoundsException {
        if (row < 0 || row >= this.rows || col < 0 || col >= this.cols) {
            throw new MatrixIndexOutOfBoundsException();
        }
        Iterator it = data.iterator();
        while (it.hasNext()) {
            MatrixCell mc = (MatrixCell) it.next();
            if (mc.row == row && mc.col == col) {
                return mc;
            }
        }
        return null;
    }
    public abstract void put(int row, int col, int value)
            throws MatrixIndexOutOfBoundsException;

    public abstract int get(int row, int col)
            throws MatrixIndexOutOfBoundsException;

}
