class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        
        int i = 0, j = 0, k = 0;
        while (j < nums1.length && k < nums2.length) {
            if (nums1[j] < nums2[k]) {
                nums3[i++] = nums1[j++];
            } else {
                nums3[i++] = nums2[k++];
            }
        }

        while (j < nums1.length) {
            nums3[i++] = nums1[j++];
        }

        while (k < nums2.length) {
            nums3[i++] = nums2[k++];
        }

        int n = nums3.length;
        if (n % 2 == 0) {
            return (nums3[n / 2 - 1] + nums3[n / 2]) / 2.0;
        } else {
            return nums3[n / 2];
        }
    }
}