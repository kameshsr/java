class Data {
    private int data;
    
    public int  getData(){
        return data;
    }
    
    public void setData(int data){
        this.data=data;
    }
}
public class Day2Encap{
    public static void main(String[] args){
        Data d= new Data();
        d.setData(3);
        System.out.println(d.getData());
    }
}

