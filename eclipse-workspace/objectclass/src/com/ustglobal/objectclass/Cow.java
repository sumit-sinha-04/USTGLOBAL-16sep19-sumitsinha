package com.ustglobal.objectclass;

public class Cow {

	int id;
	String name;
	double cost;


	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

@Override
	public boolean equals (Object obj)
	{


		if(this==obj)
			return true;	

		
		Cow c = (Cow) obj;
		if(this.name.equals(c.name))
		{
			if(this.id ==c.id)
			{	
				if(this.cost==c.cost) {
					return true;
				}
				else
				{
					return false;
				}
			}

                 else
				{
					return false;
				}
			}


			else
			{
				return false;
			}
			}

@Override
public String toString() {
	return "Cow [id=" + id + ", name=" + name + ", cost=" + cost + "]";
}
		}









