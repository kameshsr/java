import java.util.*;
import java.util.function.*;
import java.util.stream.*;
class Solution {
    
    public static String longestCommonPrefix1(String[] str){
        if(str.length==0){
            return "";
        }
        String prefix = str[0];
        for(int i=0;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    
    public static void main(String[] args) {
        
//        Solution sol = new Solution();
       String[] strs = {"flower","flow","floght"};
//       strs[0].c
       System.out.println(longestCommonPrefix1(strs));
//        System.out.println(sol.longestCommonPrefix(strs)); // Output: "fl"

//        String input = "aabbccc";
//        
//        Map<Character, Long> map = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
//                Function.identity(),Collectors.counting()));
//        Map.Entry<Character, Long> res =map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
//        if (res.getValue() % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//        System.out.println(map);
//        System.out.println(res);
    }
    
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}