import java.util.*;

class mi{

	static char[] wordbank = {'米','饭','大','咩'};
		
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("How long is the string? ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);

		System.out.println(generateString(num));
	}

	public static String generateString(int num){
		String result = "";
		Random random = new Random();

		int randomInt2 = random.nextInt(2);
		String isBao = (randomInt2 == 0)? "宝": "";
		num = (randomInt2 == 0)? num-1 : num;

		while(num > 0){
			int randomInt = random.nextInt(wordbank.length);
			result += wordbank[randomInt];
			num -= 1;
		}

		result += isBao;

		return result;
	}
}
