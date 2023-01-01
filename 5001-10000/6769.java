import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int[] num = {1, 5, 10, 50, 100, 500, 1000};
		char[] ch = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		
		String[] str = s.replaceAll("[0-9]", "").split("");
		int[] idx = new int[str.length];
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < ch.length; j++) {
				if(str[i].charAt(0) == ch[j]) {
					idx[i] = num[j];
					break;
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < s.length(); i += 2) {
			if(i < s.length() - 2 && idx[i / 2] < idx[i / 2 + 1]) {
				answer -= (s.charAt(i) - '0') * idx[i / 2];
			}
			else {
				answer += (s.charAt(i) - '0') * idx[i / 2];
			}
		}
		System.out.print(answer);
	}
}
