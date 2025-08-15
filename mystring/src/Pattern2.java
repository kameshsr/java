/*
ABC
DEF
GHI
 */

public class Pattern2 {
    public static void main(String[] args){
        int i=0,j=0;
        char ch='A';
        for(;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(ch);
                ch++;
            }
            
            System.out.println();
        }
    }
}
