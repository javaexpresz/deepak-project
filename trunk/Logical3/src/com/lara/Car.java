package com.lara;

public abstract class Car //every car will have a registration number
{
	int regno;  //every car will have a registration number
	
	//initialize the value of regno
	Car(int r)
	{
		regno = r;
	}
	//all cars will have a fuel tank and same mechanism to open tank 
	void openTank()
	{
		System.out.println("Fill the tank");
	}
	//all cars will have steering but different cars will have different steering mechanisms.
	abstract void steering(int direction, int angle);
	
	//all cars will have brakes but different cars will have different braking mechanisms.
	abstract void braking(int force);
}
class Maruti extends Car
{
	Maruti(int regno) //store regno in super class var
	{
		super(regno);
	}
	void steering(int direction, int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is ordinary steering");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("These ar hydraulic brakes");
	}
	void test()
	{
		System.out.println("welcome to test");
	}
	public static void main(String[] args)
	{
		Car c1 = new Maruti(1234);
		c1.braking(45);
	}
}
