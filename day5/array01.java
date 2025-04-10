import java.util.Scanner;
public class array01{
	public static void main(String []args){
		Scanner ob=new Scanner(System.in);
		int array[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the values for the user : ");
            array[i]=ob.nextInt();			
		}
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum +=array[i];
		}
		System.out.println("summation : "+sum);
	}
}
		