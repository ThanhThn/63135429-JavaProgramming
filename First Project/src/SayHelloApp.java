interface printable{
	void print();
}

public class SayHelloApp implements printable{
public void print() {
	System.out.println("Xin chào");
}
public static void main(String args[]) {
	SayHelloApp obj = new SayHelloApp();
	obj.print();
}
}

