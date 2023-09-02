public class Eksplorasi1 {
    public static String encrypt(String plaintext) {
        int shift = 10; // Jumlah pergeseran

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);

            if (Character.isUpperCase(c)) {
                char encryptedChar = (char) ('A' + (c - 'A' + shift) % 26);
                encryptedText.append(encryptedChar);
            } else if (Character.isLowerCase(c)) {
                char encryptedChar = (char) ('a' + (c - 'a' + shift) % 26);
                encryptedText.append(encryptedChar);
            } else {
                // Jika karakter bukan huruf, biarkan tidak terenkripsi
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        String plaintext = "SEPULSA OKE";
        String encryptedText = encrypt(plaintext);
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
