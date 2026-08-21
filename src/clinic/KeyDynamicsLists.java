/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author mr117
 */
public interface KeyDynamicsLists<T,K> extends DynamicLists<T>{
    public T get(K id);
    public boolean remove (K id);
}