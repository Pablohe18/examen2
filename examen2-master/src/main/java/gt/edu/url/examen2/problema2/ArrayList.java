/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

import java.util.Iterator;

/**
 *
 * @author Pablo Herrera
 */
public class ArrayList implements List{
    /**
     * Clase de implementacion para una lista
     * Cantidad de elementos que va a tener la Lista
     * Cantidad inicial con la cual sera inicializada la lista
     * Se crea un arreglo para guardar los elementos
     */
     public int cantElementos = 0;
     private int CantInicial = 1;
     public Object[] ArrayList = new Object[CantInicial];
 
;/**
 * Constructores de la clase arraylist
 * @return 
 */
    @Override
    public int size() {
        return cantElementos;
    }

    @Override
    public boolean isEmpty() {
        if (ArrayList.length == 0) {
            return false;
        } 
        else{
           return true;    
        }
    }

    @Override
    public Object get(int i) {
        if(i >= cantElementos|| i < 0) {
       throw new IndexOutOfBoundsException("Índice incorrecto: " + i); 
        }
        return ArrayList[i];
    }

    @Override
    public Object set(int i, Object e) {
       ArrayList[i] = e;
         return ArrayList[i];
    }
/**
 * Se agregan los valores en las posiciones que se indican, se hacen varias validaciones antes de agregarme 
 * 
 * @param i
 * @param e 
 */
    @Override
    public void add(int i, Object e) {
        if (cantElementos + 1 == ArrayList.length) {
            Object[] ArrayNuevo = new Object[ArrayList.length * 2];
            System.arraycopy(ArrayList, 0, ArrayNuevo, 0, ArrayList.length);
            ArrayList = ArrayNuevo;
        }
        if (i > cantElementos || i < cantElementos ) {
            throw new IndexOutOfBoundsException( "el elemento " + e +"lo desea ingresar en un indice incorrecto: " + i);
        }
        if (i < cantElementos) {
            System.arraycopy(ArrayList, i, ArrayList, i+1, cantElementos-i);
        }
        ArrayList[i] = e; 
        cantElementos++;
    }

    @Override
    public Object remove(int i) throws IndexOutOfBoundsException{
         if
         (i >= cantElementos || i < 0) 
         {
             throw new IndexOutOfBoundsException("El Indice "+ i + "es Incorrecto");
         }
         Object e= ArrayList[i]; 
         System.arraycopy(ArrayList, i +1, ArrayList , i , cantElementos - i +1);
         ArrayList[cantElementos-1] = null;
         cantElementos--;
         return e;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
