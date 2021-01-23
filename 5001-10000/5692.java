import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String str = "";
		StringBuilder sb = new StringBuilder();
		while(true) {
			str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			
			int answer = 0;
			for(int i = 0; i < str.length(); i++) {
				int num = fact(i+1);
				answer += (str.charAt(str.length()-i-1)-'0') * num;
			}
			sb.append(answer).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int fact(int a) {
		if(a <= 1) {
			return a;
		}
		else {
			return fact(a-1)*a;
		}
	}
}
