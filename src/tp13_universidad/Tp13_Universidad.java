
package tp13_universidad;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Tp13_Universidad {

    
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
          
            
            String URL="jdbc:mariadb://localhost:3306/universidad";
            String usuario="root";
            String password="";
            Connection con= DriverManager.getConnection(URL,usuario,password);
            
            
            
//      INGRESAR UN NUEVO ALUMNO  

//            String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                    +"values(22548754,'Lopez','Juan','2000-02-14',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}

//    INGRESO SEGUNDO ALUMNO

//            String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                    +"values(22456879,'Guitierrez','Roberto','1860-08-24',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//            int filas= ps.executeUpdate();
//          if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}


//
//                 String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                   +"values(56988421,'Fonseca','Andrea','1863-12-05',true)";
//          PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}
//           

//     OBTENER LOS DATOS DE LOS ALUMNOS ACTIVOS

//        String sql="select * from alumno where estado=true";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ResultSet rs=ps.executeQuery();
//        while(rs.next()){
//        int id=rs.getInt("idAlumno");
//        int dni=rs.getInt("dni");
//        String apellido=rs.getString("apellido");
//        String nombre= rs.getString("nombre");
//        LocalDate fechN=rs.getDate("fechaDeNacimiento").toLocalDate();
//        boolean estado=rs.getBoolean("estado");
//            System.out.println("-----------------------");
//            System.out.println("Dni"+dni);
//            System.out.println("apellido"+apellido);
//            System.out.println("fecha"+fechN.toString());
//        
//        
//        }
        


      
                   
           
       
                    
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar el Driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexion");
            ex.printStackTrace();
        }
       
    }
    
}
