import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeArrays {
    public static String[] mergeAndRemoveDuplicates(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        
        // Tambahkan semua elemen dari array1 ke hasil
        result.addAll(Arrays.asList(array1));
        
        // Iterasi array2, hanya tambahkan elemen yang tidak ada di hasil
        for (String name : array2) {
            if (!result.contains(name)) {
                result.add(name);
            }
        }
        
        // Konversi hasil ke array
        String[] mergedArray = result.toArray(new String[result.size()]);
        
        return mergedArray;
    }

    public static void main(String[] args) {
        String[] input1 = {"kazuya", "jin", "lee"};
        String[] input2 = {"kazuya", "feng"};
        String[] output1 = mergeAndRemoveDuplicates(input1, input2);
        System.out.println(Arrays.toString(output1));

        String[] input3 = {"lee", "jin"};
        String[] input4 = {"kazuya", "panda"};
        String[] output2 = mergeAndRemoveDuplicates(input3, input4);
        System.out.println(Arrays.toString(output2));
    }
}
