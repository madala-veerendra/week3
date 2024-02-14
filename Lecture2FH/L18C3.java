public class L18C3 {
    public static void main(String[] args)throws IOException{
        FileWriter fw = new FileWriter("D:\\testfile.txt");
        
            fw.write("I am veerendra");
            fw.write("I Love Water");
            fw.write("And Trees");
            fw.flush();
            fw.close();
            System.out.println("file prepared!");
    }
}    
    

