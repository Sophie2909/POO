/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicio;

import Objeto.Secreto;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class SecretoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void adivinarMes(Secreto secreto){
        
        String mes, adivinarMes = secreto.getSecreto();        
        System.out.println("VAMOS A ADVIVINAR EL MES SECRETO:");
        System.out.println("Ingresa un mes: ");
        mes = leer.next().toLowerCase();
        
        while(!mes.equalsIgnoreCase(adivinarMes)){
            System.out.println("Has fallado! :( Ingresa un mes nuevamente: ");
            mes = leer.next().toLowerCase();
        }
        System.out.println("Felicitaciones! Has acertado! :)");
        
    }
}