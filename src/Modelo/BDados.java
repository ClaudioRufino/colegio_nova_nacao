package Modelo;
import java.sql.*;
public class BDados {
    private String senha = "";
    private String usuario = "root";
    private String caminho = "jdbc:mysql://localhost:3306/sistemaescolar";
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public Statement st;
    
    public void ligar(){
        try{
            con = DriverManager.getConnection(caminho, usuario, senha);
        }
        catch(SQLException e){
            System.out.println("Erro ao conectar com o banco de dados!");
        }
    }
    
    public void desligar(){
        try{
            con.close();
        }catch(SQLException e){
            System.out.println("Erro ao desligar o banco!");
        }
    }
}
