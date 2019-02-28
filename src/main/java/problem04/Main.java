package problem04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("구구단 게임 1단 부터 9단까지 각 단에서 2개씩 총 18개의 문제가 나옵니다 : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(isr);
		
		String str;
		str = in.readLine();
		int gogoNum = new Integer(str).intValue();
		
		Random random = new Random();
		int rNum = (random.nextInt()%9)+1;
		
		int result = rNum * gogoNum;
		System.out.println(gogoNum + " * " + rNum + "=");
		str = in.readLine();
		gogoNum = new Integer(str).intValue();
		if(result==gogoNum) {
			System.out.println("맞았습니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
	}
}