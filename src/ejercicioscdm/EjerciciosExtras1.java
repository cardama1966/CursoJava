/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicioscdm;

import java.util.Scanner;

/**
 *
 * @author DaniMaidana<Dani.Maidana at Kenya.org>
 */
public class EjerciciosExtras1 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a calcular");
        int nuevo=leer.nextInt();
        int dias;
        int horas;
        int minu;
        minu=nuevo%60;
        horas=(nuevo-minu)/60;
        int hora1=horas%24;
        dias=(horas-hora1)/24;
        System.out.println("Son "+ dias + " dias, "+ hora1 +" horas y " + minu + " minutos");
        
            

    }
    
}
