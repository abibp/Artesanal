/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author MiguelAngel
 */
public class AlmacenadorDeArchivos {
    
    private FileOutputStream archivo;
    
    public void establecerArchivo(String directorio, String nombre) throws FileNotFoundException{
        
        final String SEPARADOR = "\\";
        this.archivo = new FileOutputStream(directorio + SEPARADOR + nombre);
        
    }
    
    public FileOutputStream obtenerArchivo(){
        return archivo;
    }
    
}
