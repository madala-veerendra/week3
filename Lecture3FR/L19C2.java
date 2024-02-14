public class L19C2 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("D:\\documents_copy\\CSE 4TH YEAR 2ND SEM\\WINTER PEP - JAVA FULLSTACK\\pokemon.csv");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        ArrayList<String> pokemons = new ArrayList<String>();
        br.readLine();
        while((line=br.readLine())!=null){
            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Total pokemons"+ pokemons.size());
        ArrayList<String> pokemonTitles = new ArrayList<String>();
        for(String pok : pokemons){
            String title = pok.split(",")[0];
            pokemonTitles.add(title);
        }
        System.out.println(pokemonTitles);
        br.close();
        fr.close();
    }
}
