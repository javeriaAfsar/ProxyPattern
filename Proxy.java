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
public class Proxy implements ATM_Interface {
    Bank_RealSubject myBank;

	public void authenticate(String a, String b) {
		if (a == "myUsername" && b == "myPassword") {
			System.out.println("Successfully Authenticated!");
			myBank = new Bank_RealSubject();
		}
	}

	public void updateAccBalance(int a, double b) {
		if (myBank == null) {
			System.out.println("You must be Authenticated to Update your Balance!");
		} else {
			myBank.updateAccBalance(a, b);
		}
	}
        public double getAccBalance(int a) {
		if (myBank == null) {
			System.out.println("You must be Authenticated to get your Account Balance!");
			return 0.0;
		}
		return myBank.getAccBalance(a);
	}
    
}
