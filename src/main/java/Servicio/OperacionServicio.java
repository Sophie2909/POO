/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Servicio;

import Objeto.Operacion;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class OperacionServicio {
    
    public void CrearOperacion (Operacion inicio){
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println ("Ingrese dos números: ");

    inicio.setNumero1(leer.nextInt());
    inicio.setNumero2(leer.nextInt());
    }
    
    public void Adicion (Operacion suma){
        System.out.println("La suma de los números es: "+ (suma.getNumero1()+suma.getNumero2()));
}
    
     public void Sustraccion (Operacion resta){
        System.out.println("La resta de los números es: "+ (resta.getNumero1()-resta.getNumero2()));
}
     
     public void Multiplicacion (Operacion multiplicacion){
         if (multiplicacion.getNumero1()==0 || multiplicacion.getNumero2()==0 ){
             System.out.println("ERROR!!! El resultado es igual a 0");
         }else{
             System.out.println("La multiplicacion de los números es: "+ (multiplicacion.getNumero1()*multiplicacion.getNumero2()));
         }
        
}
     public void Division (Operacion division){
         if (division.getNumero1()==0 || division.getNumero2()==0 ){
             System.out.println("ERROR!!! El resultado es igual a 0");
         }else{
             System.out.println("La division de los números es: "+ (division.getNumero1()/division.getNumero2()));
         }
}}