import java.util.Scanner;

public class ArraySearch {
	
	public static void main(String[] ang) {
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		value=sc.nextInt();
		int i;
		int[]  array=new int[100];
		System.out.println("Enter the value ");
		for( i=0;i<value;i++) {
			array[i]=sc.nextInt();
		}
		
		int searchkey,flag=0;
		System.out.println("Please enter the search number");
		searchkey=sc.nextInt();
		for( i=0;i<value;i++) {
			if(searchkey==array[i]) {
				flag=1;
				break;
			}
		}
		i=i+1;
		if(flag==1) {			
			System.out.println("value found at position " +i);
		}else {
			System.out.println("value not found");
		}
		
	}

}
