public class L19C1 {
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("D:\\testfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);
    }
}
