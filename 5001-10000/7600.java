import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine().toLowerCase();
			if(str.equals("#")) {
				break;
			}
			else {
				int answer = 0;
				int[] num = new int[26];
				for(int i = 0; i < str.length(); i++) {
					int number = str.charAt(i)-'a';
					if(number >= 0 && number <= 26) {
						num[number] = 1;
					}
				}
				
				for(int i = 0; i < num.length; i++) {
					if(num[i] != 0) {
						answer++;
					}
				}
				sb.append(answer).append("\n");
			}
		}
		System.out.println(sb);
	}
}
