package com.darshan;
interface ATM1 {
	abstract void checkbalance();

}
class machine implements ATM1{
	public void checkbalance() {
	}	
}
class ATM_Kotak{
	public static void main(String[] args) {
		machine m= new machine();
		m.checkbalance();
	}
}
