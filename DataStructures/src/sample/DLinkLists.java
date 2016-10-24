package sample;

class Links{
	double  ddata;
	Links next , prev;

public Links ( double data)
{
	//idata = id;
	data = ddata;
}
public void display()
{
	System.out.println("List " + ddata);
}
}

public class DLinkLists {
	

private Links first =null , last = null ;

public boolean isEmpty()
{
	return first==null;
}

public void InsertFirst(double dd)
{
	Links newlink = new Links(dd);
	first.prev = newlink;
	newlink.next = first;
	first = newlink;
	
}

public void insertLast(double dd)
{
	if(first == null)
	{
		System.out.println("Error");
	}
	Links newlink = new Links(dd);
	last.next = newlink;
	last = newlink;
	
}
public void DeleteFirst()
{
	if(first.next==null)
	{
		last = null;
	}
	else
		{first.next.prev = null;}
	first = first.next;
}
public void DeleteLast()
{
	if(first.next==null)
	{
		first = null;
	}
	else
	{
		last.prev.next = null;
		last = last.prev;
	}
}
public boolean insertAfter(double key , double data)
{
	Links current = first;
	while(current.ddata!=key)
	{	current = current.next;
		if(current==null)
		{
			return false;
		}}
	Links newlink = new Links(data);
		if(current==last)
		{
			newlink.next = null;
			last = newlink;
		}
		else{
			newlink.next = current.next;
			current.next.prev = newlink;
			return true;
		}
		newlink.prev = current;
		current.next = newlink;
		return true;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
}
}
