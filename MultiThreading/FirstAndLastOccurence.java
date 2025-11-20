import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args){
//        Input: 'arr' = [0,1,1,5] , 'k' = 1 Output: 1 2
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,1,5));
        int[] res= new int[2];
                res[0]=firstPosition(list,4,1);
                System.out.println(res[0]);
    }
    public static int firstPosition(ArrayList<Integer> arr, int n, int k) {
        int s=0,e=n-1;
        int mid=s+(e-s/2);
        int ans=-1;
        while(s<=e){
            if(arr.get(mid)==k){
                ans=mid;
                e=mid-1;
            } else if(k<arr.get(mid)){
                e=mid-1;
            }else{
                s=mid+1;
            }
            mid=s+(e-s/2);
        }
        return ans;
    }
}
