public class SubStringCons{
    public static void main(String args[]){
        byte[] ascii = {65,66,67,68};
        String s = new String(ascii);
        System.out.println(s);
        String s1=new String(ascii,1,2);
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("mallu");
        System.out.println("buffer before "+sb);
        System.out.println("charAt(1) before "+sb.charAt(1));

        sb.setCharAt(1,'k');
        sb.setLength(2);
        System.out.println("buffer after "+sb);
        System.out.println("charAt(1) after "+sb.charAt(1));

        StringBuffer sb1 = new StringBuffer(40);
        int i=40;
        String s2= sb1.append("a! ").append(i).toString();
        System.out.println(s2);
    }
}