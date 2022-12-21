
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 5, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        return array[indexOfSmallest(array)];
    }
    
    public static int indexOfSmallest(int[] array) {
        return indexOfSmallestFrom(array, 0);
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexSmall = startIndex;
        int small = array[startIndex];
        for(int i = startIndex; i < array.length; i++) {
            if (array[i] < small) {
                indexSmall = i;
                small = array[indexSmall];
            }
        }
        return indexSmall;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        //
        System.out.println(Arrays.toString(array));
        for (int from = 0; from < array.length; from++) {
            swap(array, from, indexOfSmallestFrom(array, from));
            System.out.println(Arrays.toString(array));
        }
    }

}
