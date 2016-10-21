package sample;

public class Stacks {
private int size;
private int top ;
private long[] arrayStack;
public Stacks(int s)
{
	size =s;
	arrayStack = new long[size];
	top =-1;
}
public void push(int element)
{
	arrayStack[++top] =element ;	
}
public long pop()
{
	return arrayStack[top--];
}
public boolean isEmpty()
{
	return top ==-1;
}
public static void main (String[] args)
{
	Stacks s = new Stacks(10);
	s.push(12);
	s.push(1);
	
	while(!s.isEmpty())
	{
		System.out.println(s.pop());	
	}
	
	
}
}
