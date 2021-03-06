/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.administracion;

import java.util.List;
import negocio.excepciones.ExcepcionElementoNoEncontrado;
import negocio.excepciones.ExcepcionElementoYaExistente;
import negocio.excepciones.ExcepcionListaVacia;


/**
 *
 * @author MiguelAngel
 */
public interface Gestor<Entidad> {
    
    public void agregar(Entidad objeto) throws ExcepcionElementoYaExistente;
    
    public void eliminar(String id) throws ExcepcionElementoNoEncontrado;
    
    public void editarInformacion(Entidad objeto) throws ExcepcionElementoNoEncontrado;
    
    public Entidad obtener(String id) throws ExcepcionElementoNoEncontrado;
    
    public List<Entidad> obtenerLista() throws ExcepcionListaVacia;
    
}
