package com.training;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String SayHello(){
        return "Hello Jenkins!";
    } 
    public static void main( String[] args )
    {
        System.out.println(new App().SayHello());
    }
}
