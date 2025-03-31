package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import bo.CustomerBO;

public class LoanDAO {
    private static final String insert_query = "INSERT INTO CUSTOMER_LOANINFO VALUES(?,?,?,?,?)";
    private DataSource ds;
    public void setDS(DataSource ds){
        this.ds = ds;
    }

    public int insert(CustomerBO cbo){
        Connection con = null;
        PreparedStatement ps = null;
        int result = 0;
        try{
            con = ds.getConnection();
            ps = con.prepareStatement(insert_query);
            ps.setInt(1,cbo.getCno());
            ps.setString(2,cbo.getCname());
            ps.setFloat(3,cbo.getPamt());
            ps.setFloat(4,cbo.getIntramt());

            result = ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                if(ps!=null){
                    ps.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }

            try{
                if(con!=null){
                    con.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return 0;
    }
}
