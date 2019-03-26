/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql_jdbcutil;
import java.sql.*;

public class AlunoDAO {
    private Connection conn;
    public AlunoDAO(Connection c)
    {
        this.conn = c;
    }
    public void insere (String nome) throws SQLException
    {
        try {
        String sql= "insert into insertupdate (nome) values ('"+nome+"');";
        PreparedStatement ps = this.conn.prepareStatement(sql);
        
        ps.executeUpdate();
        ps.close();
        }catch(Exception ex){System.out.println(ex);}
    }
    
    public void update (String atual, String antigo) throws Exception
    {
        try
        {
            String sql = "update insertupdate set nome='"+atual+"' where nome='"+antigo+"' ";
            java.sql.PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception ex){System.out.println(ex);}
    }
}
