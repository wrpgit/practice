
public class HelloWorld{

	public String sayHello(){
		System.out.println("Hello,World");
		return "Hello";
	}

	public static void main(String[] args){

		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello();

	}
}
