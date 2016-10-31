package sample;
class Linkss 
{
	Linkss next;
	int data;
    
Linkss(int data)
{
	this.data=data;
	}
}
public class SwapInSl {
Linkss first , last =null;
Linkss current , prevx , prevy;
public void Swap (int One , int Second)
{
	if(One == Second)
	{
		return;
	}
	
current = first;
//Keep track of x and prev of X
while (current!=null && current.data!=One)
{
	prevx = current;
	current = current.next;
}

while (current!=null && current.data!= Second)
{
	prevy = current;
	current = current.next;
}


}
	public static void main (String[] args)
{
	
}
}
package sample;
class Linkss 
{
	Linkss next;
	int data;
    
Linkss(int data)
{
	this.data=data;
	}
}
public class SwapInSl {
Linkss first , last =null;
Linkss current , prevx , prevy;
public void Swap (int One , int Second)
{
	if(One == Second)
	{
		return;
	}
	
current = first;
//Keep track of x and prev of X
while (current!=null && current.data!=One)
{
	prevx = current;
	current = current.next;
}

while (current!=null && current.data!= Second)
{
	prevy = current;
	current = current.next;
}


}
	public static void main (String[] args)
{
	
}
}
