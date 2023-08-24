import java.util.Scanner;

public class FunctionSample {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int num=sc.nextInt();
		int num2=sc.nextInt();
		
		int result=sum(num,num2);
		
		
		System.out.println("Result:"+result);
		
		
	}
static int sum(int a,int b) {
		int s=a+b;
		return s;
	}
}		
		
	


