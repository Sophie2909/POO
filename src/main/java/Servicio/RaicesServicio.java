/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Servicio;

import Objeto.Raices;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    public Raices CrearCoeficientes() {
        Raices raices1 = new Raices();

        System.out.println("Ingrese el coeficiente A:");
        raices1.setA(leer.nextInt());
        System.out.println("Ingrese el coeficiente B:");
        raices1.setB(leer.nextInt());
        System.out.println("Ingrese el coeficiente C:");
        raices1.setC(leer.nextInt());

        return raices1;

    }

    /*
Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices raices1) {

        return (Math.pow(raices1.getB(), 2)) - (4 * raices1.getA() * raices1.getC());

    }

    /*
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices raices1) {

        return getDiscriminante(raices1) >= 0;

    }

    /*
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.    
     */
    public boolean tieneRaiz(Raices raices1) {

        return getDiscriminante(raices1) == 0;

    }

    /*
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
     */

    public void obtenerRaices(Raices raices1) {

        if (tieneRaices(raices1)) {
            double raizPositiva = (-raices1.getB() + Math.sqrt(getDiscriminante(raices1))) / (2 * raices1.getA());
            System.out.println("La raíz positiva de la ecuación es : " + raizPositiva);
            double raizNegativa = (-raices1.getB() - Math.sqrt(getDiscriminante(raices1))) / (2 * raices1.getA());
            System.out.println("La raíz negativa de la ecuación es : " + raizNegativa);
        }

    }

    /*
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.        
     */
    public void obtenerRaiz(Raices raices1) {

        if (tieneRaiz(raices1)) {
            double unicaRaiz = (-raices1.getB()) / (2 * raices1.getA()); //-b/2a 
            System.out.println("La raíz de la ecuación es: " + unicaRaiz);
        }
    }

    /*
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
     */
    public void calcular(Raices raices1) {

        if (tieneRaiz(raices1)) {
            obtenerRaiz(raices1);
        }else if (tieneRaices(raices1)) {
            obtenerRaices(raices1);
        } else {
            System.out.println("No existe una solución :(");
        }

    }
}
