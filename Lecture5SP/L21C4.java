interface mathX{
    void add(int n1,int n2);
}

public class L21C4 {
    public static void main(String[] args){
         mathX obj = (int x, int y)->{
            System.out.println(x+y);
        };
        obj.add(10,20);
    }
}
