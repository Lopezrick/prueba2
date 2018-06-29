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
        return (cn.getValores("SELECT detalleprestamo.codPrestamo, alumnos.carnet, articulos.descripcion, detalleprestamo.cantidad, detalleprestamo.fechaPedido, detalleprestamo.fechaDevolucion FROM articulos INNER JOIN (alumnos INNER JOIN detalleprestamo ON alumnos.carnet =  detalleprestamo.carnet) ON articulos.idArticulo = detalleprestamo.idArticulo WHERE (((alumnos.carnet)='"+carnet+"'));"));
    }
}
