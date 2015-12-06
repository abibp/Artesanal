/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.gestion;

import java.util.ArrayList;

/**
 *
 * @author MiguelAngel
 */
public interface Gestor<Entidad> {
    
    
    public void agregar(Entidad objeto);
    
    public void eliminar(String id);
    
    public void editarInformacion(String id, Entidad objeto);
    
    public void inicializarLista(ArrayList<Entidad> elementos);
    
    public Object obtener(String id);
}
