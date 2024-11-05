public class BinaryConverter {

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Check if the string is a valid binary string
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }

        // Convert the binary string to decimal
        int decimal = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            decimal = decimal * 2 + (binaryString.charAt(i) - '0');
        }
        return decimal;
    }
}
