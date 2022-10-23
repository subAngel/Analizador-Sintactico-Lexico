
package codigo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author whoan
 */
public class TestOptionPane {
    public static void main(String[] args) {
        String saludo = "hola mi nombre es lorem ipsum";
        for (int i = 0; i < 10; i++) {
            saludo += i +"\n";
        }
        JOptionPane.showMessageDialog(null, saludo, "Tabla de simbolos", -1);
        
        Tabla tabla = new Tabla();
        tabla.setVisible(true);
    }
    static class Tabla extends JFrame {
        private JTable tabla = null;
        DefaultTableModel modelo = null;
        JScrollPane desplazamiento = null;
        
        public Tabla () {
            String [] titulos = {"Nombre", "Valor", "Tipo"};
            tabla = new JTable();
            modelo = new DefaultTableModel();
            // parametros de la ventana
            this.setTitle("Tabla de simbolos");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setLayout(new BorderLayout());
             
            // modelo de la tabla
            modelo.setColumnIdentifiers(titulos);
            
            desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            
            // propiedades de la tabla
            tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tabla.setFillsViewportHeight(true);
            
            tabla.setModel(modelo);
            this.getContentPane().add(desplazamiento, BorderLayout.NORTH);
            this.pack();
        }
        private void agregarDatos(){
            modelo.setRowCount(0);
            /// fila de los datos
            Object[] datosFila = {"n1", "2", "INTEGER"};
            modelo.addRow(datosFila);
            
        }
       
    }
}
