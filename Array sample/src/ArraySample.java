import java.util.Scanner;

public class ArraySample {
	
	public static void main(String[] args) {
		
		
		int l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		l=sc.nextInt();
		
		int[] array=new int [1000];
		
		System.out.println("Enter  values");
		for( int i=0;i<l;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Entered values:");
		for(int i=0;i<l;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
