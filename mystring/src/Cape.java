import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Cape {

    public static void main(String[] args) {
        String str = "34ddd3";

        System.out.println(firstNonRepChar(str));
    }

    public static String firstNonRepChar(String str){
        for(char ch:str.toCharArray()){
            if(str.indexOf(ch)==str.lastIndexOf(ch)){

                return String.valueOf(ch);
            }
        }
        return null;
    }

    public static String uniquejava8(String str){
        return str.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
    }

    public static String unique(String str){
        Set<Character> set = new HashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        return set.toString();
    }
    

    public static StringBuilder getNum(String str) {
        StringBuilder num = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            }
        }
        return num;
    }
    public static String getNumJava8(String str){
        return str.chars().filter(Character::isDigit).mapToObj(c-> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}