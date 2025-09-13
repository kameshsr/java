import java.util.*;
import java.util.stream.*;
public class StreamPracticeIntArray {
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
//        System.out.println(filterOddNumbers(Arrays.asList(1,2,3)));
//        System.out.println(convertEachElementToSquare(Arrays.asList(1,2,3)));
//        System.out.println(findFirstElementInList(Arrays.asList(1,2,3)));
//        System.out.println(findLastElementInList(Arrays.asList(1,2,3)));
//        System.out.println(checkIfAllElementIsEven(Arrays.asList(1,2,3)));
//        System.out.println(checkIfAnyElementIsEven(Arrays.asList(1,2,3)));
//        System.out.println(removeDuplicates(Arrays.asList(1,2,3,3)));
//        System.out.println(sortElements(Arrays.asList(4,2,3,3)));
//        System.out.println(sumOfDigit(434));
//        System.out.println(factorial(4));
//        System.out.println(secondLargestElementInList(Arrays.asList(4,2,3,3)));
        System.out.println(mergeList(Arrays.asList(4,2,3,3),Arrays.asList(5)));
    }

    public static Map<Boolean, List<Integer>> partitionByEven(List<Integer> list){
        return list.stream().collect(Collectors.partitioningBy(n->n%2==0));
    }
    
    public static List<Integer> mergeList(List<Integer> list1, List<Integer> list2){
        return Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
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
    
    public static List<Integer> convertEachElementToSquare(List<Integer> list){
//     return list.stream().map(num->num*num).collect(Collectors.toList());   
        return list.stream().mapToInt(n->n*n).boxed().toList();
    }
    
    public static int findFirstElementInList(List<Integer> list){
        return list.stream().findFirst().orElse(0);
    }
    public static int findLastElementInList(List<Integer> list){
        return list.stream().reduce((a,b)->b).orElse(0);
    }
    
    public static boolean checkIfAllElementIsEven(List<Integer> list){
        return list.stream().allMatch(n->n%2==0);
    }
    
    public static boolean checkIfAnyElementIsEven(List<Integer> list){
        return list.stream().anyMatch(n->n%2==0);
    }
    
    public static List<Integer> removeDuplicates(List<Integer> list){
        return list.stream().distinct().toList();
    }
    
    public static List<Integer> sortElements(List<Integer> list){
//        return list.stream().sorted(Comparator.reverseOrder()).toList();
        return list.stream().sorted(Comparator.naturalOrder()).toList();
    }
    
    public static int sumOfDigit(int num){
//        return String.valueOf(num).chars().mapToObj(c->(char)c).map(Character::getNumericValue).reduce(0,(a,b)->a+b);
//        return String.valueOf(num).chars().map(Character::getNumericValue).reduce(0, Integer::sum);
//        return String.valueOf(num).chars().map(Character::getNumericValue).sum();
        return String.valueOf(num).chars().map(Character::getNumericValue).sum();
    }
    public static int factorial(int num){
        return IntStream.rangeClosed(1, num).reduce(1, (a,b)->a*b);
    }
    
    public static int secondLargestElementInList(List<Integer> list){
        return list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
    }
    
    public static int secondSmallest(List<Integer> list){
        return list.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().orElse(0);
    }
}
