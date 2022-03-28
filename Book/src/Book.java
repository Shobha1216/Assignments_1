

import java.sql.*;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/abc", "postgres", "root");
            Class.forName("org.postgresql.Driver");
            switch(s){
                case "insert":
                    int book_id=sc.nextInt();
                    sc.nextLine();
                    String book_name=sc.nextLine();
                    String book_auth=sc.nextLine();

                    int book_year=sc.nextInt();
                    PreparedStatement preparedStatement=connection.prepareStatement("insert into Book values(?,?,?,?)");
                    preparedStatement.setInt(1,book_id);
                    preparedStatement.setString(2,book_name);
                    preparedStatement.setString(3,book_auth);
                    preparedStatement.setInt(4,book_year);

                    preparedStatement.executeUpdate();

                    statement = connection.createStatement();

                    System.out.println("row values inserted");
                    break;


                case "delete":
                    book_id=sc.nextInt();
                    PreparedStatement deletestatement=connection.prepareStatement("delete from Book where book_id=?");
                    deletestatement.setInt(1,book_id);
                    deletestatement.executeUpdate();
                    System.out.print("deleted one row");
                    break;

                case "search":
                    book_id=sc.nextInt();

                    ResultSet resultSet= statement.executeQuery("select * from Book where book_id="+book_id);
                    while (resultSet.next()) {
                        int b_id = resultSet.getInt("book_id");
                        String b_name = resultSet.getString("book_name");
                        String b_author = resultSet.getString("book_auth");
                        int  b_year = resultSet.getInt("book_year");
                        System.out.println(b_id + " " + b_name + " " + b_author + " " + b_year);

                    }
                    break;

                case "list":
                    PreparedStatement searchstatement1=connection.prepareStatement("select * from  Book");
                    ResultSet resultSet1=searchstatement1.executeQuery();
                    while (resultSet1.next()) {
                        System.out.print("Book_id:" + resultSet1.getInt(1));
                        System.out.print("Book_name:" + resultSet1.getString(2));
                        System.out.print("Book_auth:" + resultSet1.getString(3));
                        System.out.println("Book_year:" + resultSet1.getString(4));
                    }
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }
}
