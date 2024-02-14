public class L19C3 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("D:\\documents_copy\\CSE 4TH YEAR 2ND SEM\\WINTER PEP - JAVA FULLSTACK\\pokemon.csv");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        ArrayList<String> pokemons = new ArrayList<String>();
        br.readLine();
        while((line=br.readLine())!=null){
            //System.out.println(line);
            pokemons.add(line);
        }
        Scanner sc = new Scanner(System.in);
        String Type1 = sc.next();
        HashSet ptypes = new LinkedHashSet();
        if (!ptypes.contains(Type1)){
            System.out.println("Invalid Pokemon type");
            return;
        }
        for(String pok : pokemons){
            String ptype = pok.split(",")[1];
            if(ptype.equals(Type1)){
                System.out.println(pok);
            }
        }
    }
}
