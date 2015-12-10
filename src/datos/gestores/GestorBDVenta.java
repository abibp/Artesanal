package datos.gestores;

import negocio.entidades.ElementoNota;

public class GestorBDVenta extends GestorBaseDatos {

    

    public void agregarVenta(ElementoNota nuevaVenta) {

        final String INSTRUCCION_INSERTAR
                = "INSERT INTO venta VALUES(NOW(),\"%s\",%d,%f)";

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
