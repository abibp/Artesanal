package presentacion.utileria;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Adaptador para establecer como modelo personalizado a cualquier componente JTable.
 * @author Felix Diaz ®
 */
public class ModeloPersonalizadoTabla extends AbstractTableModel {

    /**
     * Los tipos de dato que corresponden al contenido de cada celda son tipo Object.
     * Cada fila y columna son representadas con Objetos ArrayList.
     */
    
    private final String[] cabecera;
    private final ArrayList<ArrayList<Object>> datos; 

/**
 * Constructor del adaptador, simplemente recibe el nombre de las columnas
 * @param cabecera 
 */
    public ModeloPersonalizadoTabla(String[] cabecera) {
        this.cabecera = cabecera;
        datos = new ArrayList<>();
    }

    /**
     * Este regresa un ArrayList(a) de ArrayList(b) donde cada ArrayList(b) contiene los valores de una fila
     * @return 
     */
    public ArrayList obtenerTabla(){
        return this.datos;
    }

    /**
     * Recibe un arrayList con datos previamente cargados, el cual añade a modo de fila a la tabla y la actualiza
     * con fireTableChanged... 
     * @param fila 
     */
    public void agregarFila(ArrayList fila){
        datos.add(fila);
        fireTableDataChanged();
    }
    
    /**
     * Quita una fila por indice
     * @param indiceFila 
     */
    public void eliminarFila(int indiceFila){
        datos.remove(indiceFila);
        fireTableDataChanged();
    }
    
    public void reiniciarTabla(){
        datos.clear();
        fireTableDataChanged();
    }
    
    public boolean estaVacia(){
        return datos.isEmpty();
    }
    
    public ArrayList<Object> obtenerFila(int indiceFila){
        return datos.get(indiceFila);
    }
    
    public void filtrarContenido(String porBuscar){
        
        ArrayList<ArrayList<Object>> resultado = new ArrayList<>();
        
        for (int i = 0; i < getRowCount(); i++) {
            ArrayList<Object> filaActual = obtenerFila(i);
            
            for (int j = 0; j < filaActual.size(); j++) {
                String contenidoCelda = String.valueOf(filaActual.get(j));
                if(contenidoCelda.contains(porBuscar)){
                    System.out.println(filaActual.get(j).toString() + "Entre");
                    resultado.add(filaActual);
                    break;
                }
            }
        }
        
        cargarContenidoFiltrado(resultado);

    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return cabecera[columnIndex];
    }

    /**
     * Metodo para que las celdas no sean editables
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datos.get(rowIndex).get(columnIndex);
    }

    @Override
    public void setValueAt(Object newValue, int rowIndex, int columnIndex) {
        datos.get(rowIndex).set(columnIndex, newValue);
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    private void cargarContenidoFiltrado(ArrayList<ArrayList<Object>> lista){
        reiniciarTabla();
        
        for (ArrayList<Object> fila : lista) {
            agregarFila(fila);
        }
    }
}
