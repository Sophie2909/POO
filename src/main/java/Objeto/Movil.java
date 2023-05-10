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
package Objeto;

/**
 *
 * @author sacevedo
 */
public class Movil {
  private String marca;
  
  private double precio;
  
  private String modelo;
  
  private int memoriaRam;
  
  private int almacenamiento;
  
  private int[] codigo = new int[7];
  
  public Movil() {}
  
  public Movil(String marca, double precio, String modelo, int memoriaRam, int almacenamiento) {
    this.marca = marca;
    this.precio = precio;
    this.modelo = modelo;
    this.memoriaRam = memoriaRam;
    this.almacenamiento = almacenamiento;
  }
  
  public String getMarca() {
    return this.marca;
  }
  
  public void setMarca(String marca) {
    this.marca = marca;
  }
  
  public double getPrecio() {
    return this.precio;
  }
  
  public void setPrecio(double precio) {
    this.precio = precio;
  }
  
  public String getModelo() {
    return this.modelo;
  }
  
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  
  public int getMemoriaRam() {
    return this.memoriaRam;
  }
  
  public void setMemoriaRam(int memoriaRam) {
    this.memoriaRam = memoriaRam;
  }
  
  public int getAlmacenamiento() {
    return this.almacenamiento;
  }
  
  public void setAlmacenamiento(int almacenamiento) {
    this.almacenamiento = almacenamiento;
  }
  
  public int[] getCodigo() {
    return this.codigo;
  }
  
  public void setCodigo(int[] codigo) {
    this.codigo = codigo;
  }
  
  public String toString() {
    return "Movil[Marca = " + this.marca + "]-[Precio = " + this.precio + "]-[Modelo = " + this.modelo + "]-[Memoria Ram = " + this.memoriaRam + "]-[Almacenamiento = " + this.almacenamiento + "]-[Codigo = " + this.codigo + "]";
  }
}