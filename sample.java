public class Test0{
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.cj.jbdc.Driver");
            String connectionURL = "jbdc:mysql://localhost/booksdb";
            connection conn = DriverManager.getConnection(connectionURL,"root","<veerendra4567789");
            

            int bid = 102;
            String bookTitles = "Sql Essentials";
            String author = "Jerry rig";
            int price = 295;

            String insertQuery = String.format("insert into books values(%d,'%s','%s',%d)",bid,bookTitle,author,price);
            System.out.println(insertQuery);
            //String insertQuery = "insert into values(101,'jdk by wrox', 'ivor horton',750)";

            Statement stmt = conn.createStatement();
            stmt.execute(insertQuery);
            stmt.close();

            System.out.println("connceted to server Succesfully!!");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}

// code 2
public class Test2{
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.cj.jbdc.Driver");
            String connectionURL = "jbdc:mysql://localhost/booksdb";
            connection conn = DriverManager.getConnection(connectionURL,"root","<nijuik88o90");
            

            
            Statement stmt = conn.createStatement();
            String selectQuery = "select * from books";

            ResultSet result = stmt.executeQuery(selectQuery)
            while(result.next()) {
                System.out.println(result.getString(1)+" "+result.getString(2));
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}