public class L18C2 {
    public static void main(String[] args){
        File f = new File("D:\\testfile.txt");
        if (f.exists()){
            System.out.println("Printing file details");
            System.out.println("------");
            System.out.println("file name:"+f.getName());
            System.out.println("file size:"+f.length());
            System.out.println("file path:"+f.getAbsolutePath());
            System.out.println("fie readable ?"+f.canRead());
            System.out.println("fie writable ?"+f.canWrite());
        }
        File f1 = new File("\"D:\\Pictures_copy\\Screenshots\\Ace.jpg\"");
        f1.mkdir();
    }
}
