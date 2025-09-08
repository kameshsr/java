import java.util.Arrays;

public class merge_sort_arr {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int m = 0,  n = 1;
        int[] nums2 = new int[]{1};
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left;
        int right;
        if(m==0) {
            left = m;
            right = n;
        }
        else {
            left = m - 1;
            right = m+n-1;
        }
        
        int i = 0;
        while (left < right) {
            if(nums2[i]<nums1[left]){
                nums1[left+1]=nums1[left];
                nums1[left]=nums2[i];
                
            }else {
                nums1[left+1] = nums2[i];
            }
            left++;
            i++;
        }
    }
}