public class CountingBitsOptimized {
    public static void main(String[] args) {
        int n = 6;
    int[] result = new int[n+1];
    for(int i = 1 ;i<=n;i++){
        result[i] = result[i>>1] + (i & 1);
    }
    for(int i : result){
        System.out.println(i);
    }
    }
}
