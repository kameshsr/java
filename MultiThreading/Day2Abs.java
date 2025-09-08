public class Day2Abs extends kallu{
    public static void main(String[] args){
        Day2Abs day2Abs = new Day2Abs();
        day2Abs.getKallu();
        day2Abs.kaal();
    }
    
    @Override
    public void getKallu(){
        System.out.println("kalua");
    }
}
abstract class kallu{
    public abstract void getKallu();
    public void kaal(){
        System.out.println("kal");
    }
}