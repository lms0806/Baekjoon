import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] s = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-", "..--..", "---...", "-....-", ".--.-."};
		String[] ans = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ".", "?", ":", "-", "@"};
		
		br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(String str : br.readLine().split(" ")) {
			for(int i = 0; i < s.length; i++) {
				if(s[i].equals(str)) {
					sb.append(ans[i]);
					break;
				}
			}
		}
		System.out.print(sb);
	}
}
