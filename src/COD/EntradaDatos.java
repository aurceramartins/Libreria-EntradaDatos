package COD;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDatos {

    int numero;
    int devuelve;
   
    
/**
 * describir Introducir 0 para sacar por consola y 1 para sacar por ventana
 * @param numero tipo de peticion consola 0 ventana 1
 * @return data introducido por el usuario
 */
    public int meterDatos(int numero) {
        this.numero = numero;
        if (numero == 0) {

            Scanner dato = new Scanner(System.in);
            devuelve = dato.nextInt();

        } else if (numero == 1) {
            devuelve = Integer.parseInt(JOptionPane.showInputDialog("Que quieres poner?"));

        } else {
            System.out.println("Escriba 0 o 1");
            System.exit(0);

        }
        return devuelve;
    }
}
