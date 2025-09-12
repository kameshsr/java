import java.util.*;
import java.util.stream.*;
public class StreamPractice {
    //https://medium.com/@bhangalekunal2631996/100-java-streams-interview-questions-with-solutions-and-outputs-2afb0713ceec
    
    public static void main(String[] args){
        //1. Find the Sum of All Elements in a List
//        System.out.println(sumOfAllElements(Arrays.asList(1,2,3)));
//        System.out.println(productOfAllElements(Arrays.asList(1,2,3)));
//        System.out.println(averageOfAllElements(Arrays.asList(1,2,3)));
//        System.out.println(maxOfAllElements(Arrays.asList(1,2,3)));
//        System.out.println(minOfAllElements(Arrays.asList(1,2,3)));
      //  System.out.println(countOfAllElements(Arrays.asList(1,2,3)));
//        System.out.println(findElement(3,Arrays.asList(1,2,3)));
//        System.out.println(filterEvenNumber(Arrays.asList(1,2,3)));
        System.out.println(filterOddNumbers(Arrays.asList(1,2,3)));
    }
    
    
    public static int sumOfAllElements(List<Integer> arr){
//        return arr.stream().reduce(0,(a,b)->a+b);
        //for max
//        return arr.stream().reduce(0, Integer::max);
        return arr.stream().reduce(0, Integer::min);
    }
    public static int productOfAllElements(List<Integer> arr){
        return arr.stream().reduce(1, (a,b)->a*b);
    }

//    Find the Average of All Elements in a List
    public static double averageOfAllElements(List<Integer> arr){
        return arr.stream().collect(Collectors.averagingInt(a->a));
//        return arr.stream().collect(Collectors.averagingInt(Integer::intValue));
//        return arr.stream().mapToInt(a->a).average().orElse(0.0);
    }
    
    public static int maxOfAllElements(List<Integer> arr){
        return arr.stream().max(Integer::compareTo).orElse(0);
//        return arr.stream().collect(Collectors.maxBy(Integer::compareTo)).orElse(0);
//        return arr.stream().mapToInt(Integer::intValue).max().orElse(0);
//        return arr.stream().mapToInt(a->a).max().orElse(0);
    }
    public static int minOfAllElements(List<Integer> arr){
        return arr.stream().min(Integer::compareTo).orElse(0);
    }
    public static long  countOfAllElements(List<Integer> arr){
        return arr.stream().count();
    }
    public static boolean findElement(int num, List<Integer> list){
        return list.stream().anyMatch(n->n==num);
//        return list.stream().filter(n->n==num).findAny().isPresent();
        
    }
    public static List<Integer> filterEvenNumber(List<Integer> list){
        List<Integer> temp= new ArrayList<>(list);
//        return list.stream().filter(n->n%2==0).collect(Collectors.toList());
        temp.removeIf(n->n%2!=0);
        return temp;
    }
    public static List<Integer> filterOddNumbers(List<Integer> list){
        return list.stream().filter(n->n%2!=0).collect(Collectors.toList());
    }
}
