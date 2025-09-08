import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args){
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(1,6));
        List<Integer> flat=list.stream().flatMap(list1-> list1.stream()).collect(Collectors.toList());
        System.out.println(flat);
    }
    
}
