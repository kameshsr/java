public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] input = new String[]{"flower", "flow", "flew"};
        String prefix = input[0];
        System.out.println(input[1].indexOf(prefix));
    }
}
