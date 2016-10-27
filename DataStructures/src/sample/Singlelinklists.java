package linkedlists;

class Link
{
	Link next;
	double data;
Link(double data)
{
	this.data = data;
	this.next = null;
}
}
public class Singlelinklists {
Link first , last;
public void insertFirst(double data)
{
	Link link = new Link(data);
	if(first==null)
	{
		first = link;
		link.next = null;
	}
	else
	{
		link.next = first;
		first = link;
	}
}

public void push(double new_data)
{
    /* 1 & 2: Allocate the Node &
              Put in the data*/
    Link new_node = new Link(new_data);

    /* 3. Make next of new Node as head */
    new_node.next = first;

    /* 4. Move the head to point to new Node */
    first = new_node;
}
public void printlist()
{
Link current = first ;
while(current!=null)
{
	System.out.println(current.data);
	current = current.next ;
}
}
public static void main(String[] args)
{
	Singlelinklists sl =new Singlelinklists();
	sl.push(2.01);
	
	sl.printlist();
	sl.insertFirst(2.00);
	sl.insertFirst(2.02);
	sl.printlist();
}
}
