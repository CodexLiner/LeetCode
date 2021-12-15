import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        } s.close();
        int len = arr.length - 1;
        int Strength = 0;
        Arrays.sort(arr);
        while (m > 0){
            if (arr[len] == 0){
                break;
            }
            Strength+= arr[len];
            arr[len] --;
            Arrays.sort(arr);
            m--;
        }
        System.out.println(Strength);
    }
}
