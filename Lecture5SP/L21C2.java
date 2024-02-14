class Program{
    static void Converter(int arg){
        System.out.println(Math.abs(arg));
    }
    void doAction(){
        List<Integer> numbers = Arrays.asList(5,-3,6,7,2,4);
        numbers.forEach(Program::Converter);
    }
}
public class L21C2 {
    public static void main(String[] args){
        Program obj = new Program();
        obj.doAction();
    }
}
