/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicio;

import Objeto.Movil;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class MovilServicio {
  Scanner leer = (new Scanner(System.in)).useDelimiter("\n");
  
  public Movil cargarCelular() {
    Movil celular = new Movil();
    System.out.println("Ingrese la marca: ");
    celular.setMarca(this.leer.next());
    System.out.println("Ingrese el precio: ");
    celular.setPrecio(this.leer.nextDouble());
    System.out.println("Ingrese el modelo: ");
    celular.setModelo(this.leer.next());
    System.out.println("Ingrese la capacidad de memoria RAM en GB: ");
    celular.setMemoriaRam(this.leer.nextInt());
    System.out.println("Ingrese la capacidad de almacenamiento en GB: ");
    celular.setAlmacenamiento(this.leer.nextInt());
    System.out.println("Ingresar codigo de 7 digitos: ");
    celular.setCodigo(ingresarCodigo(celular));
    System.out.println(celular.toString());
    return celular;
  }
  
  public int[] ingresarCodigo(Movil celular) {
    int[] codigo = new int[(celular.getCodigo()).length];
    String codigo1 = this.leer.next();
    while (codigo1.length() != 7) {
      System.out.println("ERROR. El codigo debe ser de 7 digitos. Ingreselo nuevamente: ");
      codigo1 = this.leer.next();
    } 
    for (int i = 0; i < (celular.getCodigo()).length; i++)
      codigo[i] = Integer.parseInt(codigo1.substring(i, i + 1)); 
    return codigo;
  }
}