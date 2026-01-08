public class Linear {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        //Task: Add 10 to the first element
        arr[0] = arr[0] + 10; // Time Complexity === O(1) & Space Complexity === O(0) = O(1)

        //Task: Print the elements of the array
        for(int i = 0; i < arr.length;i++){ //Time Complexity === O(n) & Space Complexity === O(0) = O(1)
            System.out.println(arr[i]);
        }

        System.out.println(arr[0]); //Time Complexity === O(1) & Space Complexity === O(0) = O(1)


        //Task: Copy the elemnts of one array to another
        int[] newArr = new int[arr.length];//Time Complexity === O(1) & Space Complexity === O(n)


        for (int i = 0; i < arr.length; i++) {//Time Complexity === O(n) & Space Complexity === O(0) = O(1)
            newArr[i] = arr[i];
        }

        for(int num : newArr){ //Time Complexity === O(n) & Space Complexity === O(0) = O(1)
            System.out.println(num);
        }
        //Total Time Complexity === O(1) + O(1) + O(n) = O(2+n) = O(n) // Cause we can always ignore constant


        //Old Overall
        //Time Complexity O(n)
        //Space Complexity O(1) //Cause no variable in being declared for it to consume additional space.

        //S.C. === O(1) + O(1) + O(1) + O(1) + O(1) + O(n) = O(5 + n) == O(n)
        //T.C. === O(1) + O(1) + O(1) + O(n) + O(n) + O(n) = O(3 + 3n) == O(3n) == O(3 * n) == O(n)
    }
}
