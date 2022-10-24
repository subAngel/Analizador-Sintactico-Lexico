
package codigo;

import java.util.Vector;
import codigo.objeto;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

public class TablaSimbolos {

    private static Vector tabla = new Vector();

    public TablaSimbolos() {
    }

    public static void crearEntrada(String nombre, String tipo) {
        String subStr;
        objeto e = TablaSimbolos.busca(nombre);
        if (e == null) {
            e = new objeto(nombre, tipo);
            tabla.add(e);
        } else {
            System.out.println("El objeto ya existe");
        }
    }

    public static String getTipo(String nombre) {
        objeto e = TablaSimbolos.busca(nombre);
        if (e == null) {

        }
        return e.getTipo();
    }

    public static String getValor(String nombre) {
        objeto e = TablaSimbolos.busca(nombre);
        if (e == null) {
            
        }
        return e.getValor();
    }

    public static objeto busca(String nombre) {
        objeto e = null;
        int i = 0;
        while (i < tabla.size()) {
            e = (objeto) tabla.elementAt(i);
            if (e.getNombre().equals(nombre)) {
                break;
            }
            e = null;
            i++;
        }
        return e;
    }
    public static Object[][] devolverElementos(){
        Object [][] arreglo = new Object [3][3];
        for (int i = 0; i < tabla.size(); i++) {
                objeto obj = (objeto) tabla.elementAt(i);
                arreglo[i][0] = obj.getNombre();
                arreglo[i][1] = obj.getValor();
                arreglo[i][2] = obj.getTipo();
        }
        return arreglo;
    }

    public static Vector getTabla() {
        return tabla;
    }

    public static void Imprimir() {
//        String salida = "";
//        for (int i = 0; i < tabla.size(); i++) {
//            salida += tabla.elementAt(i).toString() + "\n";
//            System.out.println(tabla.elementAt(i).toString());
//        }
//        JOptionPane.showMessageDialog(null, salida, "Tabla de simbolos", -1);
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println(tabla.elementAt(i).toString());
        }
    }

    public static void setValor(String pnombre, String pval) {
        objeto e = null;
        int i = 0;
        while (i < tabla.size()) {
            e = (objeto) tabla.elementAt(i);
            if (e.getNombre().equals(pnombre)) {
                e.setValor(pval);
                tabla.set(i, e);
                break;
            }
            e = null;
            i++;
        }
    }
}
