/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mundopc_main;
import mundoPC_propiedades.*;

public class MundoPC_Main {
    public static void main(String[] args) {
        
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        
        Monitor monitorAPPLE = new Monitor("APPLE", 13);
        Teclado tecladoAPPLE = new Teclado("bluetooth", "APPLE");
        Raton ratonAPPLE = new Raton("bluetooth", "APPLE");
        
        Computadora computadoraAPPLE = new Computadora("Mac Book", monitorAPPLE, tecladoAPPLE, ratonAPPLE);
        
        Orden ordenComputadoras = new Orden();
        ordenComputadoras.agregarComputadora(computadoraHP);
        ordenComputadoras.agregarComputadora(computadoraAPPLE);
        
        ordenComputadoras.mostrarOrden();
    }
}
