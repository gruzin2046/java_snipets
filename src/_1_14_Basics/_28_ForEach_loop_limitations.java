package _1_14_Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _28_ForEach_loop_limitations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int[] arr = new int[] {1,2,3,4,5,7};
        int target = 5;

        // Limitations of for-each loop

        // 1.For-each loops are not appropriate when you want to modify the array:
        for (int num : numbers) {
            // only changes num, not the array element. Array will stay the same.
            num = num*2;
        }

        //2. For-each loops do not keep track of index.
        //   So we can not get array index using For-Each loop:
        for (int num : numbers) {
            if (num == target) {
                //return ???;   // do not know the index of num
            }
        }

        // 3.  For-each only iterates forward over the array in single steps
        // this cannot be converted to a for-each loop
        for (int i = numbers.size() - 1; i > 0; i--) {
            System.out.println(numbers.get(i));
        }

        // 4. For-each cannot process two decision making statements at once
        // this cannot be easily converted to a for-each loop
        for (int i = 0; i<numbers.size(); i++) {
            if (numbers.get(i) == arr[i]) {
                //...
            }
        }

        // 5. For-each also has some performance overhead over simple iteration


    }
}
