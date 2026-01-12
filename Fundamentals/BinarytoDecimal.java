public class BinarytoDecimal {

    public int toDecimal(int binary){
        int result =0;
        int index =0;
        while (binary != 0) {
            int lastDigit = binary % 10;
            if (lastDigit == 1) {
                result = result + (int)Math.pow(2, index);
            }
            index++;
            binary= binary / 10;
        }
        return result;
    }
   public static void main(String[] args) {
     BinarytoDecimal converter = new BinarytoDecimal();
     System.out.println(converter.toDecimal(1011));
   }
}
