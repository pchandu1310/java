package chandu;

import java.util.Scanner;
public class Function {
	public static void name() {
		System.out.println("My Name");
	}
	public static void name(String str) {
		System.out.println(str);
	}
	public static int add(int c, int d) {
		return c + d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		int result;
		result = add(a, b);//function call
//		Here a and b are parameters
		System.out.println(result);
		name();//function call
		name("Manoj");//function call with parameter
		sc.close();
	}

}

