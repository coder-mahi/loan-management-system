package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import bo.CustomerBO;

public class LoanDAO {
private static final String insert_query = 
    "INSERT INTO CUSTOMER_LOANINFO(customer_number, customer_name, principal_amount, interest_amount) VALUES(?,?,?,?)";    
    
    private DataSource ds;
    
    // Correct setter method name to match XML property name "ds"
    public void setDs(DataSource ds) {
        this.ds = ds;
    }

    public int insert(CustomerBO cbo) {
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        try {
            con = ds.getConnection();
            ps = con.prepareStatement(insert_query);
            ps.setInt(1, cbo.getCno());
            ps.setString(2, cbo.getCname());
            ps.setFloat(3, cbo.getPamt());
            ps.setFloat(4, cbo.getIntramt());
            // Assuming you need to set the 5th parameter?
            // ps.setXXX(5, cbo.getXXX());

            result = ps.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ps != null) ps.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
            try {
                if(con != null) con.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return result; // Return actual result instead of 0
    }
}