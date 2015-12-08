/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import negocio.excepciones.ExcepcionElementoNoEncontrado;


/**
 *
 * @author MiguelAngel
 */
public interface Gestor<Entidad> {
    
    public void agregar(Entidad objeto);
    
    public void eliminar(String id) throws ExcepcionElementoNoEncontrado;
    
    public void editarInformacion(String id, Entidad objeto) throws ExcepcionElementoNoEncontrado;
    
    public Object obtener(String id) throws ExcepcionElementoNoEncontrado;
}
