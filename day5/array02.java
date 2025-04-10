import java.util.Scanner;
class array02{
	public static void main(String[]args){
		Scanner ab=new Scanner(System.in);
		
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter the number : ");
			array[i]=ab.nextInt();
		}
		String days[]={"monday","tuesday","wednessday","thursday","friday","saturday","sunday"};
		for(String day:days)
		{
			System.out.println(day);
		}
	}
}