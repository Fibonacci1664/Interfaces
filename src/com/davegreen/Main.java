package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        ITelephone davesPhone = new DeskPhone(123456);       // This is a valid and legal instantiation of a Deskphone object, is this polymorphic in a sense?
	    
//        ITelephone iTelephone = new ITelephone()                      // Although legal this is not what we are trying to achieve when trying to create a Deskphone object as can be
//        {                                                             // seen when creating a new ITelephone interface its automatically adds in all the methods that are required
//            @Override                                                 // to be overridden, and has created a new class in itself.
//            public void powerOn()
//            {
//
//            }
//
//            @Override
//            public void dial(int phoneNumber)
//            {
//
//            }
//
//            @Override
//            public void answer()
//            {
//
//            }
//
//            @Override
//            public boolean callPhone(int phoneNumber)
//            {
//                return false;
//            }
//
//            @Override
//            public boolean isRinging()
//            {
//                return false;
//            }
//        }
     
//	    DeskPhone stacysPhone = new DeskPhone(654321);          // This is also legal and effective for our purpose in trying to create a Deskphone object.
//
//        stacysPhone.powerOn();
//        stacysPhone.callPhone(654321);
        
        davesPhone.powerOn();
        davesPhone.callPhone(123456);
        
        
        davesPhone = new MobilePhone(246810);           // Here i am able to create a new MobilePhone object which is assigned to davesPhone because davesPhone was origianlly
                                                                  // of type interface ITelephone.
        
        //stacysPhone = new MobilePhone(654321);          // As can be seen here this is not legal due to the fact that stacysPhone was orignally of Type DeskPhone and we
                                                                 // cannot create a mobile phone from a desk phone but can however create a mobile phone from an interface ITelephone.
        
        davesPhone.powerOn();
        davesPhone.callPhone(246810);
    }
}
