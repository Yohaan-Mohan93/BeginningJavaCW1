/* Name: Yohaan Mohan
 * Student Number: 160291137
 */
import java.util.Random;

public class PartA {

	static String[] answers = new String[] { "Without a doubt","Yes", "Concentrate and ask again", "Don't count on it",  "Very doubtful", "Outlook unclear" };

	public static void main(String[] args) {
		String c1 = censor("short");
		String c2 = censor("longer the short");
		String c3 = censor("the longest one we've got");

		print(c1);
		print(c2);
		print(c3);
		print("");

		/*
		 *The for loop is done to show that the results which are being shown is random.
                 *This means that results that is being printed in not a order that is shown in 
                 * the array. 
		 */
		for (int i = 0; i<20;i++){
			String m8ball1 = magic8Ball();
			print(m8ball1);
		}
		print("");

		String[] star1 = drawStars(10, 3);
		String[] star2 = drawStars(20, 10);
		String[] star3 = drawStars(30, 6);

		print(star1);
		print("");
		print(star2);
		print("");
		print(star3);
		print("");
	}

	public static String censor(String arg)
	{
		char censorChar = '*';
		String returnString = "";

		for(int i = 0; i < arg.length(); i++)
		{
			returnString += censorChar;
		}

		return returnString;
	}

	public static void print(String arg)
	{
		System.out.println(arg);
	}
        
        public static void print(String[] arg)
	{
            for(int i = 0; i < arg.length; i++)
                System.out.println(arg[i]);
	}

	public static String magic8Ball()
	{
		Random magicAnswers = new Random();
		return answers[magicAnswers.nextInt(answers.length)];
	}
	
	public static String[] drawStars(int length, int repetitions)
	{
		String returnString = "";
		char star = '*';
                String[] stringArr = new String[repetitions];;
		
                for (int i = 0; i < length; i++)
		{
                    returnString += star;
		}
                
                for(int i = 0; i < repetitions; i++)
                {
                    stringArr[i] = returnString;
                }
	

		
		return stringArr;
	}
	
}


