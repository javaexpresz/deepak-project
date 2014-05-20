package com.lara;

public abstract class GenericBank
{
    private double balance;
    public abstract boolean openAccount();
    public double getBalance()
    {
        return balance;
    }
}
 
 class NewBank extends GenericBank 
{
    public boolean openAccount()
    {
    	return true;
    }
}



