public class SequentialSort {

	public static void main(String args[])

	{
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
 		int temp;

		for (int i=0;i<15;i++)

		{
			for(int j=i+1;j<15;j++)

			{
				if(arr[i]>arr[j])

				{
					temp=arr[i];

					arr[i]=arr[j];

					arr[j]=temp;

				}
			}

		}

		for(int i=0;i<15;i++)

		{
			System.out.println(arr[i]);

		}

	}
}