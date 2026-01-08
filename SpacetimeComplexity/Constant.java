class Constant{
    public static void main(String[] args) {
        //BigO(1)
        int[] arr = new int[]{1, 2, 3, 4, 5}; //This line won't be considered to calculate Space complexity as it is the original input for the Program.

        //Operation : Adding 10 to the first element of the Array
        arr[0] = arr[0] + 10; // Time Complexity === O(1)
        int num = arr[arr.length - 1]; //e.g.~Space Complexity O(4bytes) O(4) 
        System.out.println(arr[0]); // Time Complexity === O(1)

        // O(1) + O(1) = O(2) // Constant Time Complexity
        // O(4bytes) = O(1) // Constant Space Complexity

        /* The time taken to execute the program is constant
        i.e. if there are over a million items in an array (input size)
        & we are always operating on the first element then
        the time taken to execute the code will always be constant
        and hence making the Time complexity as O(1) */ 

        /* However, it is very hard to acheive Constant time complexity
        & it is not possible to have a constant time complexity at production. */
    }
}