package datos.gestores;

import negocio.entidades.ElementoNota;

public class GestorBDVenta extends GestorBaseDatos {

    public static Object obtenerInstancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void agregarVenta(ElementoNota nuevaVenta) {

        final String INSTRUCCION_INSERTAR
                = "INSERT INTO venta VALUES(NOW(),\"%s\",%f,%f)";

        String instruccionFinalInsertar
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerProductoVendido().obtenerID(),
                        nuevaVenta.obtenerCantidadDeProducto(),
                        nuevaVenta.obtenerImporte()
                );

        obtenerEjecutorInstrucciones().
                ejecutarModificacion(instruccionFinalInsertar);


    }

}
