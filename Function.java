import java.util.Scanner;
public class Function {
	public static void main(String []args) {
		System.out.println("Enter numbers:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter choice:\n1.Add\n2.Multiply");
		int ch = sc.nextInt();
		switch(ch) {
			case 1:
				add(a,b);
				break;
			case 2:
				multiply(a,b);
				break;
		}
	}

	public static int add(int a, int b) {
		return a+b;
	}
}
