package com.davegreen;

public interface ITelephone
{
    public void powerOn();                      // As can be seen it is perfectly legal to use an access modifier but as is highlighted doing so rather redundant, as because this
    public void dial(int phoneNumber);          // is an interface the inherently means that we will be using these particular methods, so there is no need to mark them public.
    void answer();
    boolean callPhone(int phoneNumber);         // As can be seen here the access modifiers have been removed and the code is still legal.
    boolean isRinging();
}
