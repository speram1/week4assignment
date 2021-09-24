package com.hammer.ip;

public class HammerCollector implements HammerAbstractCollector {

	static final int MAX = 5;
    int items = 0;
    Hammer[] hammerList;
  
    public HammerCollector()
    {
        hammerList = new Hammer[MAX];
  
        // Let us add some dummy notifications
        addItem(1, "Ballpeen Hammer");
        addItem(2, "Claw Hammer");
        addItem(3, "Club Hammer");
    }
  
    public void addItem(int id, String str)
    {
        Hammer hammer = new Hammer(id, str);
        if (items >= MAX)
            System.err.println("Full");
        else
        {
            hammerList[items] = hammer;
            items = items + 1;
        }
    }
  
	@Override
	public HammerAbstractIterator getIterator() {

		return new HammerIterator(hammerList);
	}

}
