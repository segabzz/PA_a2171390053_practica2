/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import pa_a2171390053_practica2.Practica01_a;
import java.awt.EventQueue;

public class Principal {
    
    Practica01_a ventana;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                try{
                    Practica01_a ventana = new Practica01_a();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
    });
    }
    
}
