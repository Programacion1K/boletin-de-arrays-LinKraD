import javax.swing.*;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        String entrada=JOptionPane.showInputDialog("¿Tamaño del primer array?");
            int cantNumeros=0;
            if (entrada.equals(null)){
                System.out.println("Entrada inválida");
            } else {
                cantNumeros = Integer.parseInt(entrada);
            }
            int[] numero=new int[cantNumeros];
            for (int i = 0; i < cantNumeros; i++) {
                numero[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero en la posición "+i+" del primer array"));
            }
            System.out.println(Arrays.toString(numero));

            int[] invertido=new int[numero.length];
            int iDato=invertido.length-1;
            int nDato=0;
            for (int i:
                    numero) {
                invertido[iDato--]=numero[nDato++];
            }
            System.out.println(Arrays.toString(invertido));
            if (numero==invertido){
                System.out.println("Es capicúa");
            } else {
                System.out.println("No es capicúa");
            }
        }
    }


}
