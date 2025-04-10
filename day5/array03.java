import java.util.Scanner;
class array03{
	public static void main(String[]args){
		Scanner ob=new Scanner(System.in);
		
		int num[]=new int[5];
		for (int i=0;i<5;i++)
		{
			System.out.print("enter the value from user : ");
			num[i] =ob.nextInt();
		}
		int max=num[0];
		for(int i=0;i<5;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			
		}System.out.println("the maximum value is : "+max);
	}
}