import javax.swing.*;
import java.util.Arrays;

public class Ejercicio1 {
        public static final String NULO="0";

        public static void main(String[] args) {
            String entrada1=JOptionPane.showInputDialog("¿Tamaño del primer array?");
            if (entrada1.equals(null)){
                entrada1=NULO;
            }
            int numeroV1=Integer.parseInt(entrada1);
            int[] v1=new int[numeroV1];
            for (int i = 0; i < numeroV1; i++) {
                v1[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero en la posición "+i+" del primer array"));
            }
            String entrada2=JOptionPane.showInputDialog("¿Tamaño del segundo array?");
            if (entrada2.equals(null)){
                entrada2=NULO;
            }
            int numeroV2=Integer.parseInt(entrada2);
            int[] v2=new int[numeroV2];
            for (int i = 0; i < numeroV2; i++) {
                v1[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero en la posición "+i+"del segundo array"));
            }
            int[] vSalida=concatenar(v1,v2);


            System.out.println(Arrays.toString(v1));
            System.out.println(Arrays.toString(v2));
            System.out.println(Arrays.toString(vSalida));
        }

        private static int[] concatenar(int[] v1, int[] v2) {
            int[] salida=new int[v1.length+v2.length];
            int posicion=0;
            for (int v:
                    v1) {
                salida[posicion++]=v;
            }
            for (int v:
                    v2) {
                salida[posicion++]=v;
            }
            return salida;
        }
}