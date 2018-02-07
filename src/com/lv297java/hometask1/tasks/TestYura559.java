import java.util.Scanner;

public class TestYura559 extends AbstractTest{
	
	private Scanner sc;
	
	public TestYura559() {
		super("559");
		sc = new Scanner(System.in);
	}

	@Override
	public void execute() {
		System.out.println("Дано натуральне число n. Знайти всі менші n числа Мерсена. (Просте " + 
				" число називається числом Мерсена, якщо воно може бути представлене у вигляді " + 
				" 2 ^ p - 1, де p - теж просте число");
		
		System.out.println("Введіть натуральне число n: ");
		int n = sc.nextInt();

		int temp = 1;
		int mersenNum; 
		
		do {
			temp *= 2;
			mersenNum = temp - 1;
			
			if(mersenNum < n)
				System.out.println(mersenNum + " ");
			
		} while (mersenNum < n);
		
	}
	
}
