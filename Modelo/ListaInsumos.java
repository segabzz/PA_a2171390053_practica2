/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author sheco
 */
public class ListaInsumos {
    
    public ArrayList<Insumo> insumos;

    public ListaInsumos () {
        this.insumos = new ArrayList<>();
    }
    public boolean agregarInsumo (Insumo insumo) {
        boolean inserto =true;
        if (buscarInsumoPorId (insumo.getIdProducto()) == null)
        insumos.add (insumo) ;
        else inserto=false;
        return inserto;
    }
    
    public boolean eliminarInsumoPorId (String id) {
        boolean elimino=true;
        Insumo insumo = buscarInsumoPorId(id);
        if (insumo != null)
        insumos.remove (insumo) ;
        else
        elimino=false;
        return elimino;
    }
        
    public String toString() {
        String resultado = "";
        for (Insumo insumo : insumos) {
        resultado += insumo.toString () + "\n";
        }
        return resultado;
    }

    public Insumo buscarInsumoPorId (String id) {
        for (Insumo insumo : insumos) {
        if (insumo.getIdProducto().equals(id)) {
        return insumo;
            }
        }
        return null;
    }
    
    public String buscarInsumo (String id) {
        for (Insumo insumo : insumos)
        if (insumo.getIdProducto ().equals (id))
        return insumo.getProducto();
        return null;
    }

    public String[] idinsumos ()
        { int pos =- 1;
            String[] datos = new String[this.insumos.size ()];
            for (Insumo nodo:this. insumos)
        { pos++;
            datos [pos]=nodo.getIdProducto();
        }
        return datos;
        }
    
    public String toArchivo(){
        String resultado = "";
        for (Insumo insumo : insumos){
            resultado += insumo.toLinea() + "\n";
        }
        return resultado;
    }
    
    public void cargarInsumo(ArrayList<String[]> insumosString){
        for (String[] categoriaString : insumosString){
            String id = categoriaString[0];
            String insumo = categoriaString[1];
            String idCategoria = categoriaString[2];
            Insumo nodo = new Insumo (id, insumo, idCategoria);
            this.agregarInsumo(nodo);
        }
    }
}
