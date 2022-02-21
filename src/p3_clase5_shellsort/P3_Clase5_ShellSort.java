package p3_clase5_shellsort;

/**
 *
 * @author StormTK
 */
public class P3_Clase5_ShellSort {

    public static void main(String[] args) {
        int[] intArray = {50, 2, 5, 10, 9, 11, 1, 25, 19};
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }
        for (int c = 0; c < intArray.length; c++) {
            System.out.println(intArray[c]);
        }
    }

}
