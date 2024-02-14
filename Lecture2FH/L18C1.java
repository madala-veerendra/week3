
public class L18C1 {
    public static void main(String[] args){
        File f = new File("d:\\testfile.txt");
        //for creating file we call createnew file() method
        try{
            f.createNewFile();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("file created successfully");
    }
}
