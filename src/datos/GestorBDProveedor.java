package datos;

import negocio.excepcion.ExcepcionProveedorNoEncontrado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.entidades.Proveedor;


public class GestorBDProveedor extends GestorBaseDatos {

    public void agregarProveedor(Proveedor nuevoProveedor) {
        
        final String INSTRUCCION_INSERTAR
            = "INSERT INTO proveedor VALUES(\"%s\",\"%s\",\"%s\")";
        
        String instruccionFinalInsertar = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        nuevoProveedor.obtenerNombre(),
                        nuevoProveedor.obtenerTelefono(),
                        nuevoProveedor.obtenerDireccion()
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);
        
    }

    public void eliminarProveedor(int IDProveedor) {
        final String INSTRUCCION_ELIMINAR
            = "DELETE FROM proveedor WHERE ID = %d";
        
        String instruccionFinalEliminar = 
                String.format(
                        INSTRUCCION_ELIMINAR,
                        IDProveedor
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalEliminar);
    }

    public void editarInformacionProveedor(int IDProveedor, Proveedor nuevoProveedor) {
    
         final String INSTRUCCION_MODIFICAR
            = "UPDATE proveedor SET nombre = \"%s\", telefono = \"%s\", direccion = \"%s\" WHERE ID = %d";
        
        String instruccionFinalModificar
                = String.format(
                        INSTRUCCION_MODIFICAR,
                        nuevoProveedor.obtenerNombre(),
                        nuevoProveedor.obtenerTelefono(),
                        nuevoProveedor.obtenerDireccion(),
                        IDProveedor
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalModificar);
    
    }

    public Proveedor obtenerProveedor(int IDProveedorAObtener) throws ExcepcionProveedorNoEncontrado{
        
        final String INSTRUCCION_OBTENER_UNO
                = "SELECT * FROM proveedor WHERE ID = %d";
        
        String instruccionFinalObtener = 
                String.format(
                        INSTRUCCION_OBTENER_UNO,
                        IDProveedorAObtener
                );

        ResultSet resultadoConsulta
                = obtenerGestorInstrucciones().ejecutarConsulta(instruccionFinalObtener);

        return extraerProductoDeResultado(resultadoConsulta);
    }

    private Proveedor extraerProductoDeResultado(ResultSet resultadoConsulta) 
            throws ExcepcionProveedorNoEncontrado{
        
        try {

            if (resultadoConsulta.next()) {
                int id = resultadoConsulta.getInt("ID");
                String nombre = resultadoConsulta.getString("nombre");
                String telefono = resultadoConsulta.getString("telefono");
                String direccion = resultadoConsulta.getString("direccion");
                

                Proveedor proveedor = new Proveedor(id, nombre, telefono, direccion);
                return proveedor;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new ExcepcionProveedorNoEncontrado();
    }
}
