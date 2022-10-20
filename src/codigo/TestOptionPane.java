
package codigo;

import javax.swing.JOptionPane;

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
    }
}
