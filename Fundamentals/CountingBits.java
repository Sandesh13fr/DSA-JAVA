public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int[] result = new int[n + 1];
        while (n != 0) {
        int count = 0;
            int num = n;
            while (num != 0) {
                int lastBit = num & 1;
                if (lastBit == 1) {
                    count++;
                }
                num = num >> 1;
            }
            result[n]=count;
            n--;
        }
        for(int i : result){
            System.out.println(i);
        }
    }

}
