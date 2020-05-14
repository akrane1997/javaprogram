package corejava;
public class Array_sort {
public static void main(String[] args) {
	int temp,i,j;
	int arr []= {5,8,3,1,9,10,15,0};
	
	for( i=0;i<arr.length;i++)
	{
		for( j=0;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
	         temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	System.out.println("Sorted Arrey:");
	for( i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
}
