package sample;

public class Arrays {

int [] SampleArray = {10,20,30,40,50,60,70};
int arraylength = SampleArray.length;
int numElements = arraylength -1;
	 public void printArray()
	 	{
		 	for(int i=0;i<arraylength;i++)
		 	{
		 		System.out.println(SampleArray[i]);
		 	}
	 	}
	 
	 public void searchArray(int element)
	 	{
		 	for(int j =0;j<arraylength;j++)
		 		{
			     if(SampleArray[j]==element)
			     {
			    	 System.out.println(SampleArray[j]);
			     }
			     else 
			    	 System.out.println("Not Found");
		 		}
		 	}
	 
	 public void deleteArray(int element)
	 	{
		 	for(int k=0;k<arraylength;k++)
		 	{
			 if(SampleArray[k]==element)
			{
				SampleArray[k] = SampleArray[k+1];
				numElements -- ;	
			}
		 	}
	 }
public static void main(String[] args)
{
Arrays a = new Arrays();
a.deleteArray(30);
a.printArray();
	
}


}
