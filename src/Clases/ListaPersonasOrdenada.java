/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author stissera
 */
public abstract class ListaPersonasOrdenada {
    

    private static List <Persona> personasOrd = new ArrayList<>();//creo un ArrayList que va a ser igual a la lista de personas
//------------------------------------------------------------------------------------------------------------------------
/*creo el comparador para que el sort me ordene
alfabéticamente las personas según el atributo que yo quiero (nombre)*/
    private static Comparator<Persona> comparador = new Comparator <Persona>() {
        public  int compare( Persona a, Persona b ) {
            //acá le digo cual es el atributo
            int resultado = a.getNombre().compareTo(b.getNombre());
            
            return resultado;     
        }
    };

    public static void ordenarLista (ArrayList personas){ 
        //ordena automáticamente según el comparador que cree anteriormente
        Collections.sort(personas, comparador);
        personasOrd=personas;
    }    

    public static ArrayList getListaPersonasOrd(){

        return (ArrayList) personasOrd;
    }

    
}
