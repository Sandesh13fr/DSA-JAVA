public class Quadratic {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 10, 6, 2, 9, 10, 12, 8};
        //Task: Find the pair of numbers which sum of to target
        int target = 7;
        var startTime = System.nanoTime();
        for(int i= 0;i<arr.length;i++){ //T. C. === O(n)
            for(int j=i+1;j<arr.length;j++){ //T. C. === O(n) === O(n^2) //Cause the n is looped everytime for this n
                if ((arr[i] + arr[j]) == target) {
                    System.out.println("Pair found: "+arr[i] + " "+arr[j]);
                }
            }
        }
        var endTime = System.nanoTime();
        System.out.println("Time taken....."+ (startTime - endTime));
    }
}
