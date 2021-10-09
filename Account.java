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
public class Account {
    int accNo;
    double bal;
    String custName;
    String custAddress;
    String customerType;
    String creditRating;
    
    public Account(int a, double b, String c, String d, String e, String f) {
        accNo = a;
        bal = b;
        custName = c;
        custAddress = d;
        customerType = e;
        creditRating = f;
    }

	public int getAccNo() {
		return accNo;
	}
        public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCreditRating() {
		return creditRating;
	}
        public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
}
