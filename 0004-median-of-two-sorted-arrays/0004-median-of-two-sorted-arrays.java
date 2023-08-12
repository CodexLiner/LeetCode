class Solution {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] A = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                A[k++] = nums1[i++];
            } else A[k++] = nums2[j++];
        }
        if (i < nums1.length) {
            while (i < nums1.length) {
                A[k++] = nums1[i++];
            }
        }
        if (j < nums2.length) {
            while (j < nums2.length) {
                A[k++] = nums2[j++];
            }
        }
        System.out.println(Arrays.toString(A));

        if (A.length % 2 != 0) {
            return A[A.length / 2];
        } else {
                        return (double) (A[A.length / 2] + A[A.length / 2 - 1]) / 2;
        }

    }
}