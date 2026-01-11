class EvenOddUsingBitwiseOps{

    public static void main(String[] args) {
        int target = 7;
        var st = System.nanoTime();
        if (target % 2==0) {
            System.out.println(target+" is even");
        } else {
            System.out.println(target +" is odd");
        }  
        var en = System.nanoTime();
        System.out.println(st-en);

         st = System.nanoTime();
        if ((target & 1 )== 0) {
            System.out.println(target+" is even");
        } else {
            System.out.println(target +" is odd");
        }
          en = System.nanoTime();
        System.out.println(st-en);
    }
}
