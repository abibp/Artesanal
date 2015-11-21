package datos;

import negocio.entidades.ElementoNota;

public class GestorBDVenta extends GestorBaseDatos {

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

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);


    }

}
