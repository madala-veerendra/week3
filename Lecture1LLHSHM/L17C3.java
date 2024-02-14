
public class L17C3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList myll = new ArrayList();
        for (int i=1;i<=3;i++){
            String item = sc.next();
            
            if (myll.contains(item)){
                continue;
            }
            myll.add(item);
        }
        System.out.println(myll);
    }
}
