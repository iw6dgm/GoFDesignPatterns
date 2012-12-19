/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import java.util.Collection;

/**
 *
 * @author joshua
 */
public class CompleteMatrix extends Matrix {

    public CompleteMatrix(int rows, int cols, Collection collection) {
        super(rows, cols, collection);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                createPosition(i, j);
            }
        }
    }

    @Override
    public void put(int row, int col, int value)
            throws MatrixIndexOutOfBoundsException {
        MatrixCell cell = getPosition(row, col);
        cell.value = value;
    }

    @Override
    public int get(int row, int col)
            throws MatrixIndexOutOfBoundsException {
        MatrixCell cell = getPosition(row, col);
        return cell.value;
    }
}
