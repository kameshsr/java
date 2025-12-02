import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day1TwoSum {
    public static void main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        //System.out.println(Arrays.toString(twoSum(nums, target)));
        List<Integer> list = Arrays.asList(5,6,3,6,9);
        list.stream().max(Integer::compare);
        list.stream().filter(num->num%2==0).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{target-nums[i],i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0};
    }
}
//Write a SQL query to select all columns from a table named 'employees' where the department is 'Engineering'".

//SELECT * FROM employees WHERE department = 'Engineering';