/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Insumo {
    
    public String idProducto;
    public String producto;
    public String idCategoria;


    public Insumo (String idProducto, String producto, String idCategoria) {

        this.idProducto = idProducto;

        this.producto = producto;

        this.idCategoria = idCategoria;
    }

    public String getIdProducto () {
        return idProducto;
    }

    public void setIdProducto (String idProducto) {
        this.idProducto = idProducto;
    }
    public String getProducto () {
        return producto;
    }
    public void setProducto (String producto) {
        this.producto = producto;
    }
    public String getIdCategoria () {
        return idCategoria;
    }
    public void setIdCategoria (String idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String toLinea(){
        return idProducto + "," + producto + "," + idCategoria;
    }
    @Override
    public String toString () {
        return idProducto + "\t\t" + producto + "\t\t" + idCategoria;
    }
}
