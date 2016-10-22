package Sorting ; 
class WrapQueues
{
	long[] Queues;
	int front =-1 , rear =-1;
	int n, size;
	public WrapQueues(int s)
	{	size = s;
		Queues = new long[size];
		
	}
	public boolean isEmpty()
	{
		return front==rear;
	}
	public int Size()
	{
		return (n-front+rear)% n;
	}
	public void insert(int element)
	{if (rear==-1)
	{
		front =0;
		rear =0;
		Queues[rear]=element;
	}
	else if(rear +1 < size)
	{
			Queues[++rear]=element;
			
			
	}
		n++;
	}
	public void Remove()
	{
		if(isEmpty())
			
		{	System.out.println("Queue is full");}
		else
		{
		long temp=Queues[front];
		front ++;
		n--;
		System.out.println("deleted" + "\t" + temp);
		}
	}
	public void printArray()
	{
		for(int i=front;i<Queues.length;i++)
			System.out.println(Queues[i]);
	}
	
	
	
	public static void main(String[] args)
	{    
		WrapQueues wr = new WrapQueues(10);
		
		wr.insert(20);
		wr.insert(3);
		wr.insert(23);
		wr.Remove();
		wr.printArray();
		
		
	}
	
}
