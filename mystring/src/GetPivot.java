import java.util.ArrayList;

public class GetPivot {
    public static void main(String[] args){
        int[] arr = {12, 15, 18, 2, 4};
        System.out.println("Pivot is " + getPivot(arr, 5));
    }

    private static int getPivot(int[] arr, int i) {
        int s=0;
        int e=i-1;
        int mid=s+(e-s)/2;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return s;
    }
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        return 0;
    }
    public int binarySearch(int[] arr, int s, int e, int key){
        return 6;
    }
}
