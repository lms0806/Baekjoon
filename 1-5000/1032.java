import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		String[] str = new String[size];
		
		for(int i = 0; i < size; i++) {
			str[i] = br.readLine();
		}
		
		String answer = "";
		for(int i = 0; i < str[0].length(); i++) {
			char ch = str[0].charAt(i);
			int count = 0;
			for(int j = 1; j < size; j++) {
				if(str[j].charAt(i) != ch) {
					count = 1;
					break;
				}
			}
			if(count == 0) {
				answer += ch;
			}
			else {
				answer += "?";
			}
		}
		
		System.out.println(answer);
	}
}
