package forms.com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
    private Connection conn;

    private static final String url = "jdbc:postgresql://localhost:5432/exercicio2";
    private static final String usuario = "postgres";
    private static final String senha = "admin";

    public DbConnection(){
        try {
            Class.forName("org.postgresql.Driver");

            this.conn = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Desconnect(){
        try{
            if(this.conn!= null){
                this.conn.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void executeWithOutReturn(String comando){
        ResultSet resultSet = null;

        try{
            PreparedStatement stm = this.conn.prepareStatement(comando);
            stm.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ResultSet executeWithReturn(String comando){
        ResultSet resultSet = null;

        try{
            PreparedStatement stm = this.conn.prepareStatement(comando);

            resultSet = stm.executeQuery();
        } catch (Exception e){
            e.printStackTrace();
        }

        return resultSet;
    }
}