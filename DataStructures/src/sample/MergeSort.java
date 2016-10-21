package sample;

public class MergeSort {


//int length = unsortedArray.length;
//int upperbound = length -1;

public void sort(int unsortedArray[] ,int l ,int r)
{
	if(l < r)
	{
	int m = (l+r)/2;
	sort(unsortedArray , l , m);
	sort(unsortedArray , m +1 , r);
	merge(unsortedArray , l , m , r);
	}
}

public void merge(int arr[], int l, int m, int r) {
	// TODO Auto-generated method stub
	int n1 = m -l + 1;
	int n2 = r-m;
	int L[] = new int[n1];
	int R[]= new int[n2];
	for (int i=0;i<n1;i++)
	L[i]=arr[l+i];
	for(int k=0;k<n2;k++)
		R[k] = arr[m + 1 + k];
	int i=0,j=0;
	int k=l;
	while(i<n1 && j<n2)
	{
		if(L[i] <=R[j])
		{
			arr[k] = L[i];
			i++;
		}
		else
		{
			arr[k] = R[j];
			j++;
		}
		k++;
	}
	while (i < n1)
    {
        arr[k] = L[i];
        i++;
        k++;
    }

    /* Copy remaining elements of L[] if any */
    while (j < n2)
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}
static void printArray(int arr[])
{
    int n = arr.length;
    for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}

public static void main(String[] args)
{
	int unsortedArray[] = {50,20,60,10,40,80,30};
	MergeSort ms = new MergeSort();
	ms.sort(unsortedArray, 0, unsortedArray.length-1);
	printArray(unsortedArray);
	
}

}
