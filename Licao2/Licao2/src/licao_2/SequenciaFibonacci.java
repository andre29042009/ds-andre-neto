package licao_2;
import java.util.Scanner;
public class SequenciaFibonacci {

	public static void main(String[] args) {
		int n = 9;
		int a = 1;
		int b = 1;
		int c = b + a;
		System.out.println("a sequencia de fibonacci é:");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			for (int i = 7 ; i < n; i++ ) {
				a = b + c;
				b = a + c;
				c = b + a;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				
			}
			
	}
}
