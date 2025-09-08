public class BinarySearch {
    public static void  main(String[] args){
        int[] arr = {3,4,5,6,15,16,26};
        int k=26;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(k==arr[mid]){
                System.out.println("found at index "+mid);
                break;
            }else if(k<arr[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        
    }
}
