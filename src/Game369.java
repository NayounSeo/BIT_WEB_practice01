public class Game369 {
	public static void main(String[] args) {
		is369();
	}
	public static void is369() {
		//사실 이 rem1~은 배열로 구현하는 것이 더 좋을 텐데 toInt 자릿수만큼 사이즈로
		//String toString = String.valueOf(toInt);
		for (int i=1; i<100; i++) {
			//초기화는 for loop 안에서 하자구요 님아.....
			int rem1 = i%10;
			int rem2 = (i - rem1)/10;
			int count = 0;
			if (rem1 == 3 ||rem1 == 6 || rem1 == 9 ) {
				count++;
			}
			if (rem2 == 3 ||rem2 == 6 || rem2 == 9 ) {
				count++;
			}
			/*while (count) {
				System.out.print("짝");
				count--;
			}*/ //이건 왜 또 파이썬....ㅋㅋㅋㅋㅋ
			if(count>0) {
				System.out.print(i+" ");
				while(count>0) {
					System.out.print("짝");
					count--;
				}
				System.out.println("");
			}
		}
	}
}
