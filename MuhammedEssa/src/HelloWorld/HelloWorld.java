package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Wahid dridi");
		String hello ="wahid";   // stack
		String hello1 = new String ("new hello world ");  //heap  
		System.out.println(hello);
		System.out.println(hello1);
		char[] hellowArray ={'h','e','l','0','o','.'};
		String HelloString = new String(hellowArray);
		System.out.println(HelloString);
		System.out.println("my name is ".concat(" wahid dridi "));
				

	}

}
