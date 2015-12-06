package datos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PIX
 */
public class GestorBDInventario extends GestorBaseDatos{
    
    public void agregarProductosInventario(String IDProducto, double cantidad){
        
        final String INSTRUCCION_INSERTAR
            = "INSERT INTO inventario VALUES(\"%s\",%f)";
        
        String instruccionFinalInsertar = 
                String.format(
                        INSTRUCCION_INSERTAR,
                        IDProducto,
                        cantidad
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);
        
    }
    
    public void editarCantidadProductosInventario(String IDProducto, double nuevaCantidad){
    
        final String INSTRUCCION_MODIFICAR
            = "UPDATE inventario SET cantidad = %f WHERE producto_ID = \"%s\"";
        
        String instruccionFinalModificar
                = String.format(
                        INSTRUCCION_MODIFICAR,
                        nuevaCantidad,
                        IDProducto
                );

        obtenerEjecutorInstrucciones().ejecutarModificacion(instruccionFinalModificar);
    
    }
    
    public ArrayList<Object[]> obtenerInformacionProductosInventario(){
        
        final String INSTRUCCION_OBTENER_TODOS =
                "SELECT ID, nombre, cantidad FROM inventario " + 
                "JOIN producto ON inventario.producto_ID = producto.ID";
        
        ResultSet resultadoConsulta
                = obtenerEjecutorInstrucciones().ejecutarConsulta(INSTRUCCION_OBTENER_TODOS);

        return extraerListaDeResultado(resultadoConsulta);
    }

    private ArrayList<Object[]> extraerListaDeResultado(ResultSet resultadoConsulta) {
        
        final int COLUMNA_ID = 0;
        final int COLUMNA_NOMBRE = 1;
        final int COLUMNA_CANTIDAD = 2;
        
        ArrayList<Object[]> tablaResultados = new ArrayList();
        
        try {

            while (resultadoConsulta.next()) {
                String id = resultadoConsulta.getString("ID");
                String nombre = resultadoConsulta.getString("nombre");
                double cantidad = resultadoConsulta.getDouble("cantidad");

                Object[] fila = new Object[3];
                fila[COLUMNA_ID] = id;
                fila[COLUMNA_NOMBRE] = nombre;
                fila[COLUMNA_CANTIDAD] = cantidad;
                
                tablaResultados.add(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GestorBDProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tablaResultados;
    }

}
