/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protectionProxy1;

/**
 *
 * @author JAVERIA
 */
public class Demo {
    public static void main(String[] args) {
        Proxy myProxy = new Proxy();
        myProxy.authenticate("Invalid", "Credentials");            
        System.out.println("Current Balance : " + myProxy.getAccBalance(100));
        System.out.println("Updating Balance by 100 ");
        myProxy.updateAccBalance(100, 100);
        System.out.println("Current Balance : " + myProxy.getAccBalance(100));
        System.out.println();
        myProxy.authenticate("myUsername", "myPassword");
        System.out.println("Current Balance : " + myProxy.getAccBalance(100));
        System.out.println("Updating Balance by 100 ");
        myProxy.updateAccBalance(100, 100);
        System.out.println("New Balance : " + myProxy.getAccBalance(100));
        System.out.println();
        
	}	
    
}
