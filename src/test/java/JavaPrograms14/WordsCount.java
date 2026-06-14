package JavaPrograms14;

public class WordsCount {

	public static void main(String[] args)

	{
		String str = "Mumbai is metro city";

		boolean flag = true;
		int count = 0;

		for (int i = 0; i < str.length(); i++)

		{

			if (str.charAt(i) == ' ')

			{
				flag = true;
			} else if (flag == true) {

				flag = false;
				count++;
			}
		}
		System.out.println(count);
	}

}
