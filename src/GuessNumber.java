import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
		Random random = new Random();
		int key = random.nextInt(99) + 1;
		System.out.println("수를 결정하였습니다. 맞추어 보세요 ");
		Scanner scanner = new Scanner(System.in);
		//char로 쓰고 싶은데 (메모리) 스캐너때문에ㅜㅠㅜㅠㅋㅋㅋㅋ HA...
		String conti = "y";
		int up=0, down=100;
		do {
			int guess=0;
			System.out.println(up+"-"+down);
			int i = 1;
			System.out.print(i+">>");
			guess = scanner.nextInt();
			
			if(key>guess) {
				System.out.println("더 높게");
				down = guess;
			}else if(key<guess) {
				System.out.println("더 낮게");
				up = guess;
			}else {
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까(y/n)");
				conti = scanner.next();
			}
			i++;
		} while (conti == "y");
	}
}
/*public static int key;
public static String conti = "y";
public static void main(String[] args) {
	Random random = new Random();
	int up=0, down=100;
	int key = random.nextInt(99) + 1;
	System.out.println("수를 결정하였습니다. 맞추어 보세요 ");

	Scanner scanner = new Scanner(System.in);
	int guess = 0;
	while(conti == "y") {
		System.out.println(up+"-"+down);
		int i = 1;
		System.out.print(i+">>");
		guess = scanner.nextInt();
	}
}
public static void upDown(int input) {
	if(input > key) {
		System.out.println("더 낮게");
	}else if(input < key) {
		System.out.println("더 높게");
	}else {
		System.out.println("맞았습니다.");
		System.out.println("다시 하시겠습니까(y/n)>>");
	}
}
public static void isConti() {
}*/
