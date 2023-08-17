package dailyAssignment;

public class Secondsmallest {

	public static int getsecondsmallest(int[] a, int total) {
		// TODO Auto-generated method stub
		
		int temp;
		for(int i = 0;i<total;i++)
			
		{
			for(int j = i+1;j<total;j++)
				
			{
			
				if(a[1]>a[j])
				{
					temp = a[1];
					a[i]=a[j];
					a[j]=temp; 	
				}
					
					
			}
		}

		return a[1];

	}
	
	public static void main(String args[])
	{
		
		int a[]= {1,2,3,4,5};
		
		System.out.println("Second smallest: " +getsecondsmallest(a,5));
		
	}
	}

