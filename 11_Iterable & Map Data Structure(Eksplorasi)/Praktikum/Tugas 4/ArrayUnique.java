import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUnique {
    public static int[] findUnique(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int num : array1) {
            boolean found = false;
            for (int num2 : array2) {
                if (num == num2) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(num);
            }
        }
        
        // Konversi hasil ke array
        int[] uniqueArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            uniqueArray[i] = result.get(i);
        }
        
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {1, 3, 5, 10, 16};
        int[] output1 = findUnique(input1, input2);
        System.out.println(Arrays.toString(output1)); // Output: [2, 4]

        int[] input3 = {3, 8};
        int[] input4 = {2, 8};
        int[] output2 = findUnique(input3, input4);
        System.out.println(Arrays.toString(output2)); // Output: [3]
    }
}

