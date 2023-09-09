import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // Membuat HashMap untuk melacak angka-angka yang telah dilihat
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Cek apakah angka penyeimbang sudah ada dalam HashMap
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }

            // Tambahkan angka saat ini ke dalam HashMap
            numToIndex.put(nums[i], i);
        }

        // Jika tidak ada pasangan yang sesuai, kembalikan null atau array kosong
        return new int[0];
    }

    public static void main(String[] args) {
        int[] input1 = { 1, 2, 3, 4, 6 };
        int target1 = 6;
        int[] output1 = findTwoSum(input1, target1);
        System.out.println(java.util.Arrays.toString(output1)); // Output: [1, 3]

        int[] input2 = { 2, 5, 9, 11 };
        int target2 = 11;
        int[] output2 = findTwoSum(input2, target2);
        System.out.println(java.util.Arrays.toString(output2)); // Output: [0, 2]
    }
}
