/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prestamos {
     Conexion cn = new Conexion();

    public void insertarPrestamo(int cod, String carnet, int idArticulo, int cantidad,String fecha) {
        
        cn.UID("INSERT INTO detalleprestamo(codPrestamo,carnet,idArticulo,cantidad,fechaPedido) VALUES('" + cod + "','" + carnet + "','" + idArticulo + "','" + cantidad + "','" + fecha + "')");
        
    }
    public void agregarUsuario(String usuario, String password) {
        
        cn.UID("INSERT INTO usuarios(usuario,password) VALUES('" + usuario + "','" + password + "')");
        
    }
    public boolean verificarUsuario(String usuario,String password){
      ResultSet rs=null;
      boolean acceso=false;  
      rs=cn.getValores("SELECT*FROM usuarios where usuario='" + usuario + "'");  
        try {
                while(rs.next()){
                    if(rs.getString(1).equals(usuario)&&rs.getString(2).equals(password)){
                        acceso=true;
                    }
                        
                    
                }
            
      }  catch (SQLException ex) {
             Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
         }
         return acceso;
        
        
    }
    public void agregarAlumno(String carnet, String nombres, String apellidos) {
        cn.UID("INSERT INTO alumnos(carnet,nombres,apellidos) VALUES('" + carnet + "','" + nombres + "','" + apellidos + "')");
        
    }
     public ResultSet Carnets() {
        return cn.getValores("SELECT*FROM alumnos");
    }
      public ResultSet Articulos() {
        return cn.getValores("SELECT*FROM articulos");
    }
       public ResultSet codigosPrestamo() {
        return cn.getValores("SELECT*FROM detalleprestamo ");
    }
      public void agregarArticulo(int id, String descripcion) {
        cn.UID("INSERT INTO articulos(idArticulo,descripcion) VALUES('" + id + "','" + descripcion + "')");
        
    }
      public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codPrestamo) FROM detalleprestamo"));
    }
      public void AgregarDevolucion(String codigo, String fecha) {
        cn.UID("UPDATE detalleprestamo SET fechaDevolucion='" + fecha + "'  WHERE codPrestamo='" + codigo + "'");
    }
      public ResultSet mostrarTodos() {
        return (cn.getValores("SELECT detalleprestamo.codPrestamo, alumnos.carnet, alumnos.nombres, alumnos.apellidos, articulos.descripcion, detalleprestamo.cantidad, detalleprestamo.fechaPedido, detalleprestamo.fechaDevolucion FROM articulos INNER JOIN (alumnos INNER JOIN detalleprestamo ON alumnos.carnet = detalleprestamo.carnet) ON articulos.idArticulo = detalleprestamo.idArticulo "));
    }
      public ResultSet buscarporCarnet(String carnet) {
        return (cn.getValores("SELECT detalleprestamo.codPrestamo, alumnos.carnet, alumnos.nombres, alumnos.apellidos, articulos.descripcion, detalleprestamo.cantidad, detalleprestamo.fechaPedido, detalleprestamo.fechaDevolucion FROM articulos INNER JOIN (alumnos INNER JOIN detalleprestamo ON alumnos.carnet = detalleprestamo.carnet) ON articulos.idArticulo = detalleprestamo.idArticulo WHERE (((alumnos.carnet)='"+carnet+"'));"));
    }
      public ResultSet buscarporCodigo(int codigo) {
        return (cn.getValores("SELECT detalleprestamo.codPrestamo, alumnos.carnet, alumnos.nombres, alumnos.apellidos, articulos.descripcion, detalleprestamo.cantidad, detalleprestamo.fechaPedido, detalleprestamo.fechaDevolucion FROM articulos INNER JOIN (alumnos INNER JOIN detalleprestamo ON alumnos.carnet = detalleprestamo.carnet) ON articulos.idArticulo = detalleprestamo.idArticulo WHERE (((detalleprestamo.codPrestamo)='"+codigo+"'));"));
    }
      public String siguienteCod(){
          ResultSet rs=null;
          rs=codigosPrestamo();
          String cod="";
          try {
                while(rs.next()){
                    cod="";
                    cod=rs.getString(1);
                    
                }
            
      }  catch (SQLException ex) {
             Logger.getLogger(Prestamos.class.getName()).log(Level.SEVERE, null, ex);
         }
          int l=cod.length()-1;
          String ceros=cod.substring(0, l);
          int n= Integer.parseInt(cod)+1;
          cod=ceros+n;
          return cod; 
    }
      public void Devolver(String codigo,String fecha){
           cn.UID("UPDATE detalleprestamo SET fechaDevolucion='" + fecha + "' where codPrestamo='" + codigo + "'");

      }
}
