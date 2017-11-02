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
    private ArrayList<T> list1 = new ArrayList<>();
    
    public void Push(T o)
    {
        list1.add(o); //adds the generic 'o' item to the stack
    }
    public T Pop()
    {
        if(list1.size() > 0)
        {
            T end = list1.get(list1.size()-1);
            list1.remove(size()); //removes the next item from the stack
            return end;
        }   
        else
        {
            System.out.println("Error!");
            return null;
        }
    }
}
