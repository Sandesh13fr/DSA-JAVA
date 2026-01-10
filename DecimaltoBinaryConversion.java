public class DecimaltoBinaryConversion{
    public static void main(String[] args) {
        int target =7 ;
        String binaryOutput = " ";
        while (target > 0) {
          int rem = target % 2;
          target = target / 2;
          binaryOutput = rem + binaryOutput;
        }
            System.out.println(binaryOutput);
    }
}