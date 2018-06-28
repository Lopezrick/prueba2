/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamos;
import java.sql.ResultSet;

public class Prestamos {
     Conexion cn = new Conexion();

    public void insertarPrestamo(int cod, String carnet, int idArticulo, int cantidad,String fecha) {
        
        cn.UID("INSERT INTO detalleprestamo(codPrestamo,carnet,idArticulo,cantidad,fechaPedido) VALUES('" + cod + "','" + carnet + "','" + idArticulo + "','" + cantidad + "','" + fecha + "')");
        
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
      public void agregarArticulo(int id, String descripcion) {
        cn.UID("INSERT INTO articulos(idArticulo,descripcion) VALUES('" + id + "','" + descripcion + "')");
        
    }
}
