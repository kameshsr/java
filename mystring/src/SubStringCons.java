public class SubStringCons{
    public static void main(String args[]){
        byte[] ascii = {65,66,67,68};
        String s = new String(ascii);
        System.out.println(s);
        String s1=new String(ascii,1,2);
        System.out.println(s1);
    }
}