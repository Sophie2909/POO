/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Objeto.Cadena;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class CadenaServicio {
  Scanner leer = new Scanner(System.in);
  
  public void mostrarVocales(Cadena cadena) {
    int cantidadVocales = 0;
    for (int i = 0; i < cadena.getLongitud(); i++) {
      char letra = cadena.getCadena().charAt(i);
      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
        cantidadVocales++; 
    } 
    System.out.println("La cantidad de vocales es: " + cantidadVocales);
  }
  
  public void invertirFrase(Cadena cadena) {
    for (int i = cadena.getLongitud(); i > 0; i--)
      System.out.print(cadena.getCadena().substring(i - 1, i)); 
    System.out.println("");
  }
  
  public void vecesRepetido(Cadena cadena) {
    int cant = 0;
    System.out.println("Ingrese la letra a buscar: ");
    char letra = this.leer.next().charAt(0);
    int posicion = cadena.getCadena().indexOf(letra);
    while (posicion != -1) {
      cant++;
      posicion = cadena.getCadena().indexOf(letra, posicion + 1);
    } 
    System.out.println("Se encontro " + cant + " de veces el caracter " + letra + ".");
  }
  
  public void compararLongitud(Cadena cadena) {
    System.out.println("Ingrese una nueva frase: ");
    String frase2 = this.leer.next();
    if (frase2.length() > cadena.getLongitud()) {
      System.out.println("La frase " + frase2 + " es mlarga.");
    } else if (frase2.length() < cadena.getLongitud()) {
      System.out.println("La frase " + cadena.getCadena() + " es mlarga.");
    } else {
      System.out.println("Las frases contienen la misma longitud.");
    } 
  }
  
  public void unirFrases(Cadena cadena) {
    System.out.println("Ingrese una nueva frase: ");
    String frase2 = this.leer.next();
    System.out.println(cadena.getCadena().concat(frase2));
  }
  
  public void reemplazar(Cadena cadena) {
    System.out.println("Ingrese un caracter para reemplazar la letra a.");
    char letra = this.leer.next().charAt(0);
    String frase = cadena.getCadena();
    int posicion = cadena.getCadena().indexOf("a");
    while (posicion != -1) {
      frase = frase.replace(frase.charAt(posicion), letra);
      posicion = cadena.getCadena().indexOf("a", posicion + 1);
    } 
    System.out.println("La frase nueva es: " + frase);
  }
  
  public void contiene(Cadena cadena) {
    System.out.println("Ingrese una letra a buscar dentro de la frase: ");
    char letra = this.leer.next().charAt(0);
    if (cadena.getCadena().contains(Character.toString(letra))) {
      System.out.println("La frase si contiene la letra " + letra + ".");
    } else {
      System.out.println("La frase no contiene la letra que busca.");
    } 
  }
}