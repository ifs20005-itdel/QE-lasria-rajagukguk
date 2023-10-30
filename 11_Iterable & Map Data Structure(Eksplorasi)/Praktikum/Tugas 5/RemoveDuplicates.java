public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Inisialisasi dengan 1 karena elemen pertama pasti unik

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] input1 = {2, 3, 3, 3, 6, 9, 9};
        int length1 = removeDuplicates(input1);
        System.out.println(length1); // Output: 4

        int[] input2 = {2, 2, 2, 11};
        int length2 = removeDuplicates(input2);
        System.out.println(length2); // Output: 2
    }
}
