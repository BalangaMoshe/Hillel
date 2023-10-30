package HomeWokr.Less16;

public class ArrayOperations {
    //    public static int getIndexElement(int[] array, int element) {
//        if (array == null) {
//            return -3;
//        }
//        if (array.length == 0) {
//            return -2;
//        }
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i]==element){
//                return i;
//            }
//
//        }
//        return -1;
//    }
//}
    public static double getIndexElement(int[] array) {
        if (array == null) {
            return -3;
        }
        if (array.length == 0) {
            return -2;
        }
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    public static double matrix(int[][] matrix) {
        if (matrix == null) {
            return -3;
        }
        if (matrix.length == 0) {
            return -2;
        }
        int arrs = matrix.length;
        for (int[] arr : matrix) {
            if (arr.length != arrs) {
                return -1;
            }
        }
        return 1;
    }
}