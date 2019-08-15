import java.util.Arrays;

public class LC04MedianTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double Ans = 0.0;
        int[] doubleArray = new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            doubleArray[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            doubleArray[i+nums1.length] = nums2[i];
        }
        Arrays.sort(doubleArray);

        if(doubleArray.length % 2 != 0){
            int s =((doubleArray.length+1) / 2) - 1;
            Ans = doubleArray[s];
        }else{
            int s =(doubleArray.length / 2) - 1;
            Ans = ((double)doubleArray[s] + (double)doubleArray[s+1])/2;
        }

        return Ans;
    }
}
