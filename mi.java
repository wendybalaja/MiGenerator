import java.util.*;

class mi{

	static char[] wordbank = {'米','饭','大','咩'};
		
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Type in number to select:");
		System.out.println("1) Get a mi name");
		System.out.println("2) Feel like eating something");
		System.out.println("3) Feel like going somewhere");
		int sel = Integer.parseInt(scan.nextLine());

		if(sel == 1){
			System.out.println("How long is the string? ");
			int num = Integer.parseInt(scan.nextLine());
			System.out.println(generateString(num));
		}
		if(sel == 2){
			generateEat(scan);
		}
		if(sel == 3) {
			generatePlace(scan);
		}
	}

	public static void generateEat(Scanner scan){
			System.out.println("想吃点什么?");
			String eat = scan.nextLine();
			System.out.println("(*￣︶￣*)  搞点"+eat+"吃吃 !");
			System.out.println("想喝点什么?");
			String drink = scan.nextLine();
			System.out.println("(*￣︶￣*)  搞杯"+drink+"喝喝 ! ");
	}
	
	public static void generatePlace(Scanner scan){
			System.out.println("想去哪里?");
			String place = scan.nextLine();
			System.out.println("(*￣︶￣*)  要去"+ place +"啦？");
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
