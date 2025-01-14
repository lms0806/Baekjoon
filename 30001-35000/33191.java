import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int money = Integer.parseInt(br.readLine());
		
		System.out.print(check(money, Integer.parseInt(br.readLine())) ? "Watermelon" : check(money, Integer.parseInt(br.readLine())) ? "Pomegranates" : check(money, Integer.parseInt(br.readLine())) ? "Nuts" : "Nothing");
	}
	
	public static boolean check(int money, int num) {
		return money >= num;
	}
}
