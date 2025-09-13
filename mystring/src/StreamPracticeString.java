import java.util.*;
import java.util.stream.*;
class Person{
    int age;
    String name;
    Person (int age, String name){
        this.age = age;
        this.name = name;
    }
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
}
public class StreamPracticeString {
    public static void main(String[] args){
        Person p = new Person(23,"kamesh");
        Person p2 = new Person(23,"kamesh4");
        Person p1 = new Person(34,"rekha");
        System.out.println(groupByObject(List.of(p,p1,p2)));
//        System.out.println(sortAlphabeticalOrder(Arrays.asList("kallu", "alua","mallu")));
//        System.out.println(sortByStringLength(Arrays.asList("kallu", "alua","mallu")));
        //System.out.println(groupByLength(Arrays.asList("kallu", "alua","mallu")));
//        System.out.println(convertListOfStringToUpperCase(Arrays.asList("kallu", "kalua","mallu")));
    }
    
    
    public static Map<Integer, List<Person>> groupByObject(List<Person> list){
        return list.stream().collect(Collectors.groupingBy(Person::getAge));
    }
    
    public static Map<Integer, Long> groupByLength(List<String> list){
        return list.stream().collect(
        Collectors.groupingBy(String::length,Collectors.counting()));
    }
    
    public static String shortestString(List<String> list){
        return list.stream().min(Comparator.comparingInt(String::length)).orElse("");
    }
    public static List<String> convertListOfStringToUpperCase(List<String> list){
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
    public static List<String> sortAlphabeticalOrder(List<String> list){
        return list.stream().sorted(Comparator.naturalOrder()).toList();
    }
    
    public static List<String> sortByStringLength(List<String> list){
        return list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }
    
    public static String longestString(List<String> list){
        return list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }
}
