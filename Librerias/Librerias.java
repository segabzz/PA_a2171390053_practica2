/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librerias;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import pa_a2171390053_practica2.Practica01_a;

public class Librerias {

    Practica01_a vista;
    
    public Icon EtiquetaImagen (String archivoimagen, int x, int y){
        String ruta=archivoimagen;
        ImageIcon imagen = new ImageIcon(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        return icono;
    }
    
}
