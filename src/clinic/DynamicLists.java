/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clinic;

import java.util.Iterator;

/**
 *
 * @author Dylan
 * La T (tipo) es una especie de parametro que nos cambia la interfaz a una interfaz generica
 * (no se debe llamar estrictamente T)
 * lo que le permite trabajar con cualquier tipo de datos, int, string. patient, etc.
 */
public interface DynamicLists <T> { 
    
    public boolean add(T item);
    public Iterator getAll();
    public int size();
    public boolean isEmpty();
    
}
