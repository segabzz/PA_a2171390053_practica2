/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa_a2171390053_practica2;

import Librerias.ArchivoTXT;
import Modelo.Categoria;
import Modelo.ListaCategorias;
import Modelo.ListaInsumos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ControladorP01a implements ActionListener{
    
    Practica01_a ventana;
    
    ListaInsumos listainsumos;
    ListaCategorias listacategorias;
    ArchivoTXT archivo;
    
    Categoria categoria;
    
    private DefaultListModel<Categoria>modelocategoria;
    
    public ControladorP01a(){
        
        ventana = new Practica01_a();
        ventana.setVisible(true);
        
        modelocategoria = new DefaultListModel<Categoria>();
         
        ModificacionesPractica();
        InicializarCategorias();
        Volveralinicio();
    }
    
    public void ModificacionesPractica(){
        this.ventana.ListaCategorias = new JList();
        this.ventana.ListaCategorias.setModel(this.modelocategoria);
        this.ventana.ListaCategorias.setEnabled(true);
        
    }
    
    public void InicializarCategorias(){
        archivo = new ArchivoTXT("Categoria");
        this.listacategorias = new ListaCategorias();
        if (this.archivo.existe())
            this.listacategorias.cargarCategorias(this.archivo.cargar());
        modelocategoria = new DefaultListModel<Categoria>();
        modelocategoria= this.listacategorias.generarModeloCategorias();
    }
    
    public Boolean esdatoscompletos(){
        boolean enc=false;
        String id, insumo, idcategoria;
        id="";
        insumo="";
        idcategoria="";
            id=this.ventana.Tid.getText().trim();
            insumo=this.ventana.Tinsumo.getText().trim();
            if (this.ventana.ListaCategorias.getSelectedIndex()>=0)
                idcategoria=this.modelocategoria.get(this.ventana.ListaCategorias.getSelectedIndex()).getIdcategoria();
            if ((!id.isEmpty())&&(!insumo.isEmpty())&&(!idcategoria.isEmpty()))
                enc=true;
            System.out.println(id+" "+insumo+" "+idcategoria);
            return enc;    
    }

    public void Volveralinicio(){
        this.ventana.Bagregar.setText("Agregar");
        this.ventana.Bsalir.setText("Salir");
        this.ventana.Beliminar.setEnabled(true);
        this.ventana.Tid.setEditable(false);
        this.ventana.Tinsumo.setEditable(false);
        this.ventana.ListaCategorias.setEnabled(false);
        this.ventana.Tid.setText("");
        this.ventana.Tinsumo.setText("");
        this.ventana.ListaCategorias.setSelectedIndex(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public static void main(String[] args) {
        new ControladorP01a();
    }
    
}
