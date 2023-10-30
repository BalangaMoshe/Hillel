package ua.hillel.Kovalets.Less16.Arithmetik;

import HomeWokr.Less16.ArrayOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AritchmetikArray {
    @Test
    void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        double average = ArrayOperations.getIndexElement(array);
        Assertions.assertEquals(3.0, average, 0.001);
    }

    @Test
    void testIsSquareMatrix() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};

        Assertions.assertEquals(1, ArrayOperations.matrix(matrix1));
        Assertions.assertEquals(-1, ArrayOperations.matrix(matrix2));
    }
}






