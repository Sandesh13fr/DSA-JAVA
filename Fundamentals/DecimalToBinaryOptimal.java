public class DecimalToBinaryOptimal {
    public String Converter(int decimal) {
        String result = "";
        while (decimal != 0) {
            int lastBit = decimal & 1;
            result = lastBit + result;
            decimal = decimal >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        DecimalToBinaryOptimal convert = new DecimalToBinaryOptimal();
        System.out.println(convert.Converter(10));
    }
}
