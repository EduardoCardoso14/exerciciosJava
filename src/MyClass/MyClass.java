/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyClass;


/**
 *
 * @author 962670
 */
//exercicio 48:
public class MyClass {

    private int x = 5;
    
    int x2;
    
    public void constructor(){
        x2 = 5;
    }
            
    static void MyMethod(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        
        //exercicio 49:
        MyClass myObj = new MyClass();
        
        //exercicio 50:
        System.out.println(myObj.x);
        
        //exercicio 51:
        System.out.println("----------");
        myObj.MyMethod();
        
        //exercicio 52:
        MyClass myObj2 = new MyClass();
        myObj2.constructor();
        System.out.println("----------");
        System.out.println(myObj2.x2);
        
        //exercicio 53:
        //private class MyClass(){}
        
        //exercicio 54:
        //import java.util.Scanner
        
        //exercicio 55:
        //class Car extends Vehicle(){}
        
    }
}
