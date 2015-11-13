package datos;

import negocio.entidades.ElementoVenta;

public class GestorBDVenta extends GestorBaseDatos {

    public void agregarVenta(ElementoVenta nuevaVenta) {

        final String INSTRUCCION_INSERTAR
                = "INSERT INTO venta VALUES(NOW(),\"%s\",%f,%f)";

        String instruccionFinalInsertar
                = String.format(
                        INSTRUCCION_INSERTAR,
                        nuevaVenta.obtenerProductoVendido().obtenerID(),
                        nuevaVenta.obtenerCantidadDeProducto(),
                        nuevaVenta.obtenerMonto()
                );

        obtenerGestorInstrucciones().ejecutarModificacion(instruccionFinalInsertar);

    }

}
