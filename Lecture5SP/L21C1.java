public class L21C1 {
    public static void main(String[] args){
        ArrayList<String> lang = new ArrayList<String>();
        lang.add("java");
        lang.add("c++");
        lang.add("python");
        
        lang.forEach(System.out::println);
    }
}
