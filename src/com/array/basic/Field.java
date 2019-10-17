package com.array.basic;

public class Field {

	int ns;
	static int s;
	Field(int ns)
	{
		if (s < ns) 
		{
			s=ns;
			this.ns=ns;
		}
	}
	void printAll()
	{
		System.out.println("ns= "+ns+" s= "+s);
	}
	public static void main(String[] args) {
		
		Field f1=new Field(50);
		Field f2=new Field(125);
		Field f3=new Field(100);
		f1.printAll();
		f2.printAll();
		f3.printAll();
	}

}
