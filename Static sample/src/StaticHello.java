
public class StaticHello {
	
	int a=10;
	static int b=20;
	
	public static void main(String ar[]) {
		
		StaticHello h=new StaticHello();
		StaticHello h1=new StaticHello();
		System.out.println(h.a);
		h.hello();
		hey();
		h.b=50;
		
		h1.b=100;		
		
		System.out.println("h.b:"+h.b);
	}
	 void hello() {
		
	}
	 
	 static void hey() {
		 
	 }

}
