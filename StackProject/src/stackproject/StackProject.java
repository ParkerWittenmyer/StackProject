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
public class StackProject {

    
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(); //creates the stack
        
        
        
        stack.Push(3); 
        stack.Push(2);
        stack.Push(1);
        System.out.println(stack.Pop());
        //System.out.println(stack.Pop());
        //System.out.println(stack.Pop());
        //System.out.println(stack.Pop());
    }
}
