/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicio;

import Objeto.Cuenta;
import java.util.Scanner;

/**
 *
 * @author sacevedo
 */
public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        Cuenta cuenta1 = new Cuenta();
        
        System.out.println("BIENVENIDO A TU CUENTA BANCARIA");
        
        System.out.println("\nIngresa tu número de cuenta: ");
        cuenta1.setNumCuenta(leer.nextInt());
        
        System.out.println("\nIngresa tu DNI: ");
        cuenta1.setDNI(leer.nextLong());
        
        System.out.println("\nIngresa tu saldo actual: ");
        cuenta1.setSaldoActual(leer.nextInt());
        
        return cuenta1;
    }
    
    //Método ingresar
    
    public void Ingreso (Cuenta cuenta1) {
        System.out.println("Digite la cantidad de dinero que quiere ingresar: ");
        cuenta1.setSaldoActual(cuenta1.getSaldoActual()+(int)leer.nextDouble());
        System.out.println("La cantidad de dinero que ha ingresado es: ");
        
        }
    //Método retirar
    
    public void Retiro (Cuenta cuenta1) {
        System.out.println("Digite la cantidad de dinero que quiere retirar: ");
        double retiro = leer.nextDouble();
        if (cuenta1.getSaldoActual() < retiro ){
            cuenta1.setSaldoActual(0);
                 System.out.println("Fondos insuficientes :(");
        }else{
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-(int)retiro);
             System.out.println("La cantidad de dinero que ha retirado es: "+retiro);
        }
       
    }
    
    //Método extracción rápida
    
    public void ExtraccionRapida (Cuenta cuenta1){
        System.out.println("Ingrese la cantidad de dinero que desesa extraer (máximo el 20%):");
        double extraccionRapida = leer.nextDouble();
        if (extraccionRapida <= (cuenta1.getSaldoActual()*0.20) ){
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-(int)extraccionRapida);
            System.out.println("La cantidad de dinero que has retirado es: "+extraccionRapida);
        }else{
            System.out.println("La cantidad de dinero que quieres retirar supera el 20% :(");
        }
    }
    
    //Método consultar saldo
    
    public void ConsultarSaldo (Cuenta cuenta1){
        System.out.println("Su saldo actual es: "+cuenta1.getSaldoActual());
        
        
    }
    
    //Método consultar datos
    
    public void ConsultarDatos (Cuenta cuenta1){
        System.out.println(cuenta1.toString());
    }
}
