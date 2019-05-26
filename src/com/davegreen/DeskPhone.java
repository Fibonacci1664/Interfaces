package com.davegreen;

public class DeskPhone implements ITelephone
{
    private int myNumber;               // In order for a class to be legal it MUST override all the methods from the interface it implements from.
    private boolean isRinging;
    
    public DeskPhone(int myNumber)
    {
        this.myNumber = myNumber;
    }
    
    @Override
    public void powerOn()
    {
        System.out.println("No action, deskphone does not have a button.");
    }
    
    @Override
    public void dial(int phoneNumber)
    {
        System.out.println("Now ringing " + phoneNumber + " on deskphone.");
    }
    
    @Override
    public void answer()
    {
        System.out.println("Answering the deskphone.");
    }
    
    @Override
    public boolean callPhone(int phoneNumber)
    {
        if(phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Ring ring...");
            answer();
        }
        else
        {
            isRinging = false;
        }
        
        return isRinging;
    }
    
    @Override
    public boolean isRinging()
    {
        return isRinging;
    }
}
