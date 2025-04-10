package licao_2;
import java.util.Scanner;
public class SequenciaFibonacci500 {

	public static void main(String[] args) {
		int n = 13;
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
				if (a < 700) {
				System.out.println(a);
				}
				if (b < 700) {
					System.out.println(b);
					}
				if (c < 700) {
					System.out.println(c);
					}
			
	}
	}
}
