
public class SumofArrays {
	public static int[] sumArrays(int[] arr1,int[] arr2)
	{ int n=0,i=0,j=0,m=0;
		if(arr1.length>arr2.length)
			n=arr1.length+1;
			
		else 
			n=arr2.length+1;
			
		i=arr1.length-1;
		j=arr2.length-1;
		int[] sum=new int[n];
		if(i>j)
			 m=j;
		else
			m=i;
		int k=n-1;
		int digit=0;
		int carry=0;
		while(m>=0)
		{
			 digit= carry+ arr1[i]+arr2[j];
			sum[k]=digit%10;
			carry=digit/10;
			i--;
			j--;
			k--;
			m--;	
			}
		if(arr1.length>arr2.length)
			{while(i>=0)
		{
			digit=carry + arr1[i];
			sum[k]=digit%10;
			carry=digit/10;
			k--;
			i--;
		}
			}
			else
			{
				{while(j>=0)
				{
					digit=carry + arr2[j];
					sum[k]=digit%10;
					carry=digit/10;
					k--;
					j--;
				}
				
			}
			}
		
	return sum;}
	
		
		
		

	
	public static void main(String[] args)
	{
		int[] arr1= {1,9,6};
		int[] arr2= {4,7};
		int[] temp=sumArrays(arr1,arr2);
		for(int i=0;i<temp.length;i++)
			System.out.print(temp[i]+" ");
		
		
		
	}

}
