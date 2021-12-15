import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class oneplus {
    public static int[] plusOne(int[] digits) {
        if (digits.length == 1 && digits[0] < 9){
            digits[0]++;
            return digits;
        }
        int i = digits.length - 1;
        while (i >= 0){
            if (digits[i] < 9){
                digits[i]++;
             //   System.out.println(digits[i] +" d");
                return digits;
            }else {
                digits[i] = 0;
            }
            i--;
        }
        int [] arr = new int[digits.length + 1];
        arr[0] = 1;
        for (int j = 1; j < arr.length; j++) {
            arr[j] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
