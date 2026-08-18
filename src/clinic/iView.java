/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinic;

/**
 *
 * @author mr117
 */
public interface iView<T> {
    public void clear();
    public void showData(T data);
    public void showError(String error);
    public void showMessage(String message);
    
}
