import java.util.ArrayList;
import java.util.List;

public class DigitUnik {
    public static List<Integer> findUniqueDigits(String input) {
        List<Integer> uniqueDigits = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int digit = Character.getNumericValue(currentChar);
            
            // Cek apakah digit ini hanya muncul satu kali dalam string
            if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                uniqueDigits.add(digit);
            }
        }
        
        return uniqueDigits;
    }

    public static void main(String[] args) {
        String input1 = "76523752";
        List<Integer> output1 = findUniqueDigits(input1);
        System.out.println(output1);

        String input2 = "1122";
        List<Integer> output2 = findUniqueDigits(input2);
        System.out.println(output2);
    }
}

