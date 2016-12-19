/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class LoVivido {

 public static  int ano, mes, dia, hora;
    
public static void main(String[] args) {



String n = nombre();
 String e = edad();
 


ano = Integer.parseInt (e);

mes = (ano*12);
dia = (ano*365);
hora = (dia*24);
 
        Visualizar(mes, nome, dia, hora);

   System.exit (0);

}

    public static String edad() throws HeadlessException {
        String edad;
        edad = JOptionPane.showInputDialog ("Escriba su edad: ");
        return edad;
    }

    public static String nombre() throws HeadlessException {
        String nome;
        nome = JOptionPane.showInputDialog ("Escriba su nombre: ");
        return nome;
    }

    public static void Visualizar(int mes, String nome, int dia, int hora) throws HeadlessException {
        JOptionPane.showMessageDialog(null,  "Meses: "  +mes,"Numero de meses vividos de " +nome,JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, "Días: " +dia,"Numero de días vividos de "+nome,JOptionPane.INFORMATION_MESSAGE);
        
        
        JOptionPane.showMessageDialog(null, "Horas: " +hora,"Numero de horas vividos de "+nome,JOptionPane.INFORMATION_MESSAGE);
    }
   

}
