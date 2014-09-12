/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;


/**
 *
 * @author stissera
 */
public abstract class ListaPersonas {
    
    private static Persona[] personas = new Persona[0];
    
    public static void addPersonas(Persona persona){
        Persona[] listaAux = new Persona[personas.length+1];
        for (int i=0; i<personas.length;i++){
            

            listaAux[i] = personas[i];
            
            
        } 
        listaAux[listaAux.length-1]=persona;

        personas=listaAux;
        
        }
    public static void borrarPersonas(int h){
        Persona[] aux = new Persona[ListaPersonas.getListaPersonas().length -1];
            
            //si la posicion que le ingresé no es null, ahora si lo va a ser
            if (ListaPersonas.getListaPersonas()[h] != null) {
                ListaPersonas.getListaPersonas()[h] = null;
            }
            //reacomodo la lista
            for (int i = 0; i < ListaPersonas.getListaPersonas().length; i++ ) {
                if (ListaPersonas.getListaPersonas()[i] !=null) {
                    for (int j = 0; j < aux.length; j++) {
                        if (aux[j] == null) {
                            aux[j] = ListaPersonas.getListaPersonas()[i];
                            
                            break;
                            
                        }
                    }
                }
            
            }
        personas=aux;
    }
    
        
    public static Persona[] getListaPersonas(){
        return personas;
        
    }
   
    
    
}


    
    
