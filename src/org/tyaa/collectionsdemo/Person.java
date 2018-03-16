/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.collectionsdemo;

/**
 *
 * @author student
 */
public class Person<T> {
    
    public String name;
    public int age;
    public T salary;
    
    private static int count;
    static Person<Integer> pers= new Person();
    //step2: static var
    
    static{
        count = 0;
    }
    
    //step1: private
    private Person(){
        count++;
    }
    
    //step3: static method getInstance()
    public static Person getInstance(){
        return pers;
    }
    
    public static int size(){
    
        return count;
    }
    
    public void setSalary(T _s){
        salary = _s;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        count--;
    /*public void create()
    }*/
}
