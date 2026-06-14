package JavaPrograms14;

public class IfNumberIsPrimeOrNot {

	public static void main(String[] args) {

		int num = 7;

		boolean b = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				b = true;
				break;
			}
		}

		if (b == true) {
			System.out.println(num + " is not  prime");
		}
		else
		{
		    System.out.println(num + " is  prime");
		}
	}

}
