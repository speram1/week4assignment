package com.hammer.ip;

public class HammerIteratorTest {

	public static void main(String args[])
    {
	
	 HammerCollector hammers = new HammerCollector() ;
	 HammerAbstractIterator iterator = hammers.getIterator();
     System.out.println("-------Types of Hammers------------");
     while (iterator.hasnext())
     {
         Hammer h = (Hammer)iterator.next();
         System.out.println(h.getId()+ ". "+h.getName());
     }
}
}