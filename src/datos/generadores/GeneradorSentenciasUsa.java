/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.generadores;

import negocio.entidades.ProductoCompuesto;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionListaVacia;

/**
 *
 * @author MiguelAngel
 */
public class GeneradorSentenciasUsa {
    
    private final String nombreTabla;
    private final String VARIABLE_TEXTO = "\"%s\"";

    public GeneradorSentenciasUsa(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String[] generarSentenciaInsertarUso(ProductoCompuesto producto) throws ExcepcionListaVacia {
        final String INSTRUCCION_INSERTAR = 
                "INSERT INTO " + nombreTabla + 
                " VALUES (\"%s\", %d, %d)";
        
        String[] sentenciasInsertarGeneradas = new String[producto.obtenerReceta().size()];
        for (int i = 0; i < sentenciasInsertarGeneradas.length; i++) {
            sentenciasInsertarGeneradas[i]
                    = String.format(
                            INSTRUCCION_INSERTAR,
                            producto.obtenerID(),
                            producto.obtenerReceta().get(i).obtenerID(),
                            producto.obtenerReceta().get(i).obtenerCantidad()
                    );
        }
        return sentenciasInsertarGeneradas;
    }

    public String generarSentenciaEliminarUso(String idInsumo) {
        final String INSTRUCCION_ELIMINAR = 
                "DELETE FROM " + nombreTabla + 
                " WHERE fi_id_insumo = \"%s\"";
        
        String sentenciaEliminarGenerada =
                String.format(INSTRUCCION_ELIMINAR, idInsumo);
     
        return sentenciaEliminarGenerada;
    }

    public String generarSentenciaActualizarUso(ProductoCompuesto producto, String idInsumo) throws ExcepcionElementoNoEncontrado {
        final String INSTRUCCION_ACTUALIZAR = 
                "UPDATE " + nombreTabla + 
                " SET nombre = " + VARIABLE_TEXTO + ", 	existencia = %d, fi_id_insumo = \"%s\"" +
                " WHERE id_insumo = \"%s\" ";
        
        String sentenciaActualizarGenerada =
                String.format(
                        INSTRUCCION_ACTUALIZAR, 
                        producto.obtenerIngrediente(idInsumo).obtenerCantidad(),
                        idInsumo,
                        producto.obtenerID()
                );
        
        return sentenciaActualizarGenerada;
    }

    public String generarSentenciaObtenerUsos(){
        final String INSTRUCCION_OBTENER = "SELECT * FROM " + nombreTabla;
        
        String sentenciaObtenerInsumosGenerada = INSTRUCCION_OBTENER;
        
        return sentenciaObtenerInsumosGenerada;
    }
    
    public String generarSentenciaObtenerUsaPorId(String idProducto) throws ExcepcionListaVacia{

        final String INSTRUCCION_OBTENER_POR_ID = 
                "SELECT * FROM " + nombreTabla + " WHERE fp_id_producto = \"%s\" ";
         
            String sentenciasObtenerUsaPorIdGeneradas =
                    String.format(INSTRUCCION_OBTENER_POR_ID, idProducto);
                   
        return sentenciasObtenerUsaPorIdGeneradas;
        
    }
    
}
