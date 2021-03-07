package dz.djamel.program;

public class PayrollDriver {

	public static void main(String[] args) {
		// Instantiates a payroll object with 2 arg constructor
		Payroll emp1 = new Payroll("Evan Gudmestad", 1);// creér object emp1 from class payroll de parametr String
														// integer
		// set pay info
		emp1.setHoursWorked(70.5);// hours worked de emp1 set to 70.5
		emp1.setPayRate(8.20);// payrate de l'object emp1 set to 8.20
		// get the employee info ..
//afichage d"info de emp1 qui on a deja set en precedent 
		System.out.println("Payroll Info : " + "\n" + "Name : " + emp1.getName() + "\n" + "IdNumber : "
				+ emp1.getIdNumber() + "\n" + "Hours Worked : " + emp1.getHoursWorked() + "\n" + "Pay Rate : "
				+ emp1.getPayRate() + "\n" + "Gross Pay : " + emp1.getGrosspay());
	}
}
