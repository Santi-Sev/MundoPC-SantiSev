/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundoPC_propiedades;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 10;
    
    public Orden(){
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadoras = new Computadora[maxComputadoras];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.maxComputadoras) {
            
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else{System.out.println("Error, te has superado el limite de computadoras");}
    }
    
    public void mostrarOrden(){
        System.out.println("orden: # " + this.idOrden );
        System.out.println("*************************");
        System.out.println("Computadoras de la orden #" + this.idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
        
    
    
    }
  
}
