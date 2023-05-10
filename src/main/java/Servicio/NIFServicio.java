/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. 
 */
package Servicio;

import Objeto.NIF;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in);

    /*   
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.    
     */
    public NIF crearNIF() {
        
        Scanner leer = new Scanner(System.in);
        
        NIF letra = new NIF();
        System.out.println("Ingresa tu DNI:");
        letra.setDNI(leer.nextLong());
        letra.setLetra(CalcularLetra(letra.getDNI()));

        return letra;
    }

    /*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
     */
    public String CalcularLetra(long DNI) {

        int resto = (int) DNI % 23;
        String[] letra = new String[23];
        String palabra = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < letra.length; i++) {
            letra[i] = palabra.substring(i, i + 1);
        }
        
        return letra[resto];
    }


/*
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
*/
public void Mostrar(NIF letra){
System.out.println(letra.getDNI()+"-"+letra.getLetra());

}
}
