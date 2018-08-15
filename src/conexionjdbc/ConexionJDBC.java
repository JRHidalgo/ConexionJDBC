/*
 * 
 */
package conexionjdbc;

import java.sql. *; //Permite acceder a las clases y metodos para realizar la conexion a cualquier tipo de BD.


public class ConexionJDBC {

    public ConexionJDBC(){
        //Para poder instanciar un objeto de esta clase, y poder acceder al metodo connection
    
    }
    
    public Connection getConnection(){
    Connection con = null;
    
    //Paraa trabajar con base de datos es necesario trabajar con el manejo de expciones a traves del bloque try catch
    try{
     /*Instanciar el driver de la BD*/   
     Class.forName("com.mysql.jdbc.driver").newInstance();
    } catch (Exception e){
       // Realizar la conexion a la BD
    
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
