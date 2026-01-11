public class NumberOf1bits {
    public static void main(String[] args) {
        int result= 0;
        int n = 7;
        while (n!= 0) {
            int lastBit = n & 1;
            if (lastBit == 1) {
                result++;
            }
            n = n>>1;
        }
        System.out.println(result);
    }
}
