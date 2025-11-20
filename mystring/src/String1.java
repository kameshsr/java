import java.util.*;
import java.util.stream.Collectors;

public class String1 {
    public static void main(String[] args){
//        List<String> names = Arrays.asList("kallU", "ram", "ka", "pa");
//        Map<Integer, Long> res= names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        System.out.println(res);
        System.out.println(missingNumber(new int[]{3,0,1}));
    }
    public static int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.println(Arrays.asList(nums).contains(i));
            if(Arrays.asList(nums).contains(i)){
                System.out.println("inside if");
                return i;
            }
        }
        return 0;
    }
}

