package com.hammer.ip;

public class HammerIterator implements HammerAbstractIterator {

	Hammer[] hammerList;
	public int index = 0;
	public HammerIterator(Hammer[] hammerList) {

		this.hammerList = hammerList;
	}

	@Override
	public boolean hasnext()
	{		
		if (index >= hammerList.length ||
	            hammerList[index] == null)
	            return false;
	        else
	            return true;
	 }

	@Override
	public Object next() {
		 Hammer ham =  hammerList[index];
	        index += 1;
	        return ham;
	}

}
