/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protectionProxy1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JAVERIA
 */
public class Bank_RealSubject implements ATM_Interface {
    private ArrayList<Account> accountArray = new ArrayList<Account>();
    private int NumOfAccounts = 0;
    int accountIndex;    
    
    public Bank_RealSubject() {
	 accountArray.add(new Account(100, 1000.00, "Dave Martin", "Athlone", "Personal", "Good"));
	 accountArray.add(new Account(101, 1000.00, "Joe Bloggs", "Galway", "Corporate", "Good"));
	 accountArray.add(new Account(102, 1000.00, "Jane Bloggs", "Dublin", "Personal", "Good"));
	 accountArray.add(new Account(103, 1000.00, "John Doe", "Waterford", "Corporate", "Good"));
	 NumOfAccounts = 4;
    }
	
    public void createAccount(int a, double b, String c, String d, String e, String f) {
        accountArray.add(new Account(a, b, c, d, e, f));
        NumOfAccounts++;
    }
 public void deleteAccount(int anAccNumber) {
	Iterator<Account> iterator = accountArray.iterator();
	
	while(iterator.hasNext()) {
		if(iterator.next().getAccNo() == (anAccNumber)) {
		iterator.remove();
		}
	}
	NumOfAccounts--;
    }

    public void updateAccBalance(int anAccNumber, double newBalance) {
    	Iterator<Account> iterator = accountArray.iterator();
   	
    	while(iterator.hasNext()) {
    		if(iterator.next().getAccNo() == (anAccNumber)) {
    			iterator.next().setBal(iterator.next().getBal() + newBalance);
    		}
    	}
    }

    public double getAccBalance(int anAccNumber) {
    	double balance = 0.00;
    	Iterator<Account> iterator = accountArray.iterator();
       	
    	while(iterator.hasNext()) {
    		if(iterator.next().getAccNo() == (anAccNumber)) { 
    			balance = iterator.next().getBal();
    		}
    	}
    	return balance;
    }
    
}
