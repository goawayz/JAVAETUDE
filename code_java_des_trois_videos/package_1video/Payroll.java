package dz.djamel.program;

public class Payroll {
//Instant Fields
	
	//declare name de type String (private a cause de l'un signe -)
		private int idNumber;
	private String name;
	private double payRate;
	private double hoursWorked;
	
	//Constructor two args
	public Payroll (String n , int i) 
	{
	name = n ;   //1st
	idNumber = i;//2nd
	}
	//Mutators Setters
	public void setName(String n) 
	{
	name = n;// set ou editer la valeur de name a la valeur de n 
	}
	public void setIdNumber (int i) {
	idNumber = i;//donner la valeur qui exist dans la method payroll comme parametre integer a idNumber
	}
	public void setPayRate (double p) {
	payRate = p; //changer la valeur de payrate a la valeur qu' on prefer dans main class 
	}
	public void setHoursWorked (double h) {
	hoursWorked = h;
	}
	/*Accessor Methods ! getters
	set --->changer la valeur
	get --->lire la valeur qui on changer
	*/
	public String getName()
	{
	return name;		//donner la valeur de name qui deja changer a la "Evan Gudmestad" 
	}
	public int getIdNumber() 
	{
		return idNumber;//get la valeur de idNumber qu'est deja changer dans la class main a la valeur 1
	}
	public double getPayRate()
	{
		return payRate; // get la valeur de payrate qui il 'a deja receiver dans la class main 
	}
	public double getHoursWorked()
	{
		return hoursWorked;//retourner la valeur de hoursworked qui ona deja changer dans sethourswokrked
	}
	//CAlculation method that returns the gross pay 
	public double getGrosspay()
	{
		return hoursWorked*payRate;//Method getgrosspay calculer et donner la valeur de hoursworked*payrate de emp1 dans la class Main  
	}
}
