public class L21C5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, -44, 19, 20, 77);
        List<Integer> result = numbers.stream().filter(e-> e<0).collect(Collectors.toList());
        System.out.println(result);
        
        Object obj = 10;
        System.out.println(obj.getClass().getSimpleName());
        
        List<Object> list = Arrays.asList(true,100,"hello",200,true);
        List<Object> res = list.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
        System.out.println(res);
        
        list.forEach(m->{
            System.out.println(m+" -> "+m.getClass().getSimpleName());
        });
        
        int totalIntegers =(int) list.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).count();
        System.out.println("Total Integers"+totalIntegers);
        
        List<String> colors=Arrays.asList("red","green","orange");
        List<String> res1 = colors.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(res1);
    }
}
