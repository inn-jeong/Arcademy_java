package Chapter13;

interface MyFuntion2{
	int calc(int x);
}

public class LambdaEx2 {
	public static void main(String[] args) {
		MyFuntion2 square=x->x*x;
		System.out.println(square.calc(2));
	}
}
