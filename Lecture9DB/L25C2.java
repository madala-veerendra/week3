public class L25C2 {
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.cj.jbdc.Driver");
            String connectionURL = "jbdc:mysql://localhost/booksdb";
            Connection conn = DriverManager.getConnection(connectionURL,"root","Ha!@2003");
            

            
            Statement stmt = conn.createStatement();
            String selectQuery = "select * from books";

            ResultSet result = stmt.executeQuery(selectQuery);
            while(result.next()) {
                System.out.println(result.getString(1)+" "+result.getString(2));
            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
