/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql_jdbcutil;


public class SQL_JdbcUtil {

    
    public static void main(String[] args) throws Exception {
        System.out.println(JdbcUtil.getConnection());
        AlunoDAO al=new AlunoDAO(JdbcUtil.getConnection());
        al.insere("Professor");
        al.update("Pablo","Professor");
        
        
    }
    
}
