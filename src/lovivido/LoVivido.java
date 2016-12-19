/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class LoVivido {

public static void main(String[] args) {



int m;
int d;
int h;
int a;
String n = nombre();
 String e = edad();

a = Integer.parseInt (e);
 
m = (a*12);
d = (a*365);
h = (d*24);
 
        Visualizar(m, n, d, h);

   System.exit (0);

}

    public static String edad() throws HeadlessException {
        String e;
        e = JOptionPane.showInputDialog ("Escriba su edad: ");
        return e;
    }

    public static String nombre() throws HeadlessException {
        String n;
        n = JOptionPane.showInputDialog ("Escriba su nombre: ");
        return n;
    }

    public static void Visualizar(int m, String n, int d, int h) throws HeadlessException {
        JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);
    }
   

}
