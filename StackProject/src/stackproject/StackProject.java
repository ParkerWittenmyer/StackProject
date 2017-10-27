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
public class StackProject<T> {

    
    public static void main(String[] args) {
        int i;
        
        ArrayList<Integer> array1 = new ArrayList<>(); //creates the arraylist
        
        MyStack stack2 = new MyStack(); //creates the stack
        
        for(i = 1; i <= 10; i++) //initializes the for loop to add integers to the arraylist
        {
            array1.add(i); //adds integers to the arraylist
        }
        
        stack2.Push(array1); //adds integers from the arraylist to the stack
        
        while (!stack2.IsEmpty()) //initializes the while loop for printing out the integers
        {
            System.out.println(stack2.Pop()); //prints out the integers
            if(stack2.isEmpty() == true)
            {
                System.out.println("Done!"); //prints out 'Done!' when the stack is empty
            }
        }
    }
}
