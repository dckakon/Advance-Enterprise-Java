import com.mysql.cj.protocol.Resultset;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/studentdb","root","");

        Statement st = con.createStatement();
        String query ="select * from student";

        ResultSet rs= st.executeQuery(query);
        //rs.next();
        //System.out.print(rs.getString("StudentName"));

        while(rs.next())
        {
            String id= rs.getString("StudentID");
            String name= rs.getString("StudentName");
            System.out.println(id+" - "+name);
        }

        String insertQuery= "INSERT INTO student VALUES (?, ?)";

        PreparedStatement ps= con.prepareStatement(insertQuery);
        //int id= TEXT BOX; Scanner class (System.in)
        ps.setInt(1, 6);
        ps.setString(2, "Hagrid");

        int row = ps.executeUpdate();  // executeQuery - Read, executeUpdate() - Create/insert,update,delete
        System.out.println(row+ "- row inserted");


        st.close();
        con.close();

    }
}



// InsertData(), UpdateData(), ReadData()
// Switch Case - case "1": InsertData()-> Scanner