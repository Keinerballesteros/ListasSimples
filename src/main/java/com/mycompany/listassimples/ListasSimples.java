/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listassimples;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-17
 */
public class ListasSimples {

    Nodo inicio;
    ListasSimples(){
        inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            
            inicio = nuevo;
        }
        else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }   
    }
    
    public void consultar(){
        
        Nodo temporal = inicio;
        
        if(inicio == null){
           JOptionPane.showMessageDialog(null, "La lista está vacía");
           
        }
        else{
            do{
                JOptionPane.showMessageDialog(null, "Nombre: "+temporal.getNombre() + "Edad: "+ temporal.getEdad() + "Promedio: "+temporal.getPromedio());
            }while(temporal.getEnlace() != null);
            
        
        }
    }
    
    
    }
