/*
 * 
 */
package conexionjdbc;

import java.sql. *; //Permite acceder a las clases y metodos para realizar la conexion a cualquier tipo de BD.
import java.util.Properties;


public class ConexionJDBC {
    
    //String url = "jdbc:mysql://localhost:3306/jrstudios";
//    Properties propiedades = new Properties();
//    propiedades.setProperty("user", "root");
//    propiedades.setProperty("password", "JR141287");
//    propiedades.setProperty("useSSL", "false");

    public ConexionJDBC(){
        //Para poder instanciar un objeto de esta clase, y poder acceder al metodo connection
    
    }
    
    public Connection getConnection(){
    Connection con = null;
        
    
    //Paraa trabajar con base de datos es necesario trabajar con el manejo de expciones a traves del bloque try catch
    try{
     /*Instanciar el driver de la BD*/   
     Class.forName("com.mysql.jdbc.Driver").newInstance();
    } catch (Exception e){
       // Realizar la conexion a la BD.
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jrstudios", "root", "");
    
    }
    
    return con;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
