/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;
import java.util.*;

/**
 *
 * @author pwittenmyer
 */
public class MyStack<T> extends ArrayList<T>{
    
    
    public void Push(T o)
    {
        add(o); //adds the generic 'o' item to the stack
    }
    
    public T Pop()
    {
        return remove(size() - 1); //removes the next item from the stack
    }
    
    public boolean IsEmpty()
    {
        return size()==0; //returns 0 if the stack is empty
    }
}
