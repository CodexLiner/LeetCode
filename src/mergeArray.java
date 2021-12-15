import java.util.Arrays;

public class mergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0 || nums1.length == 0){
            return;
        }
        int ix = m ;
        for (int i = 0; i < n; i++) {
            nums1[ix]= nums2[i];
            ix++;
        }
        Arrays.sort(nums1);


    }

    public static void main(String[] args) {
            int [] a = {1,2,3,0,0,0};
            int [] nums2 = {2,5,6};
            merge(a , 3 ,nums2 , 3 );
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
