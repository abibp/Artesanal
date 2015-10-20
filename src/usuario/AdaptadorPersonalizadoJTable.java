package usuario;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * Adaptador para establecer como modelo personalizado a cualquier componente JTable.
 * @author Felix Diaz ®
 */
public class AdaptadorPersonalizadoJTable extends AbstractTableModel {

    /**
     * Los tipos de dato que corresponden al contenido de cada celda son tipo Object.
     * Cada fila y columna son representadas con Objetos ArrayList.
     */
    
    private final String[] nombreColumnas;
    private final ArrayList<ArrayList<Object>> datos; 

/**
 * Constructor del adaptador, simplemente recibe el nombre de las columnas
 * @param nombreColumnas 
 */
    public AdaptadorPersonalizadoJTable(String[] nombreColumnas) {
        this.nombreColumnas = nombreColumnas;
        datos = new ArrayList<>();
    }

    /**
     * Este regresa un ArrayList(a) de ArrayList(b) donde cada ArrayList(b) contiene los valores de una fila
     * @return 
     */
    public ArrayList obtenerArray(){
        return this.datos;
    }

    /**
     * Recibe un arrayList con datos previamente cargados, el cual añade a modo de fila a la tabla y la actualiza
     * con fireTa... 
     * @param row 
     */
    public void añadirFila(ArrayList row){
        datos.add(row);
        fireTableDataChanged();
    }
    
    /**
     * Quita una fila por indice
     * @param index 
     */
    public void eliminarFila(int index){
        datos.remove(index);
        fireTableDataChanged();
    }
    
    @Override
    public String getColumnName(int col) {
        return nombreColumnas[col];
    }

    /**
     * Metodo para que las celdas no sean editables
     * @param row
     * @param col
     * @return 
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datos.get(rowIndex).get(columnIndex);
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
        datos.get(row).set(col, value);
        fireTableCellUpdated(row, col);
    }

}
