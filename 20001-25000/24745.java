import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {"01","1000","1010","100","0","0010","110","0000","00","0111","101","0100","11","10","111","0110","1101","010","000","1","001","0001","011","1001","1011","1100"};
		String[] str1 = {"11111","01111","00111","00011","00001","00000","10000","11000","11100","11110"};
	
		String s = "";
		for(char c : br.readLine().toCharArray()) {
			if(c >= '0' && c <= '9') {
				s += str1[c - '0'];
			}
			else if(c >= 'a' && c <= 'z') {
				s += str[c - 'a'];
			}
			else if(c >= 'A' && c <= 'Z') {
				s += str[c - 'A'];
			}
			else {
				continue;
			}
		}
		System.out.print(new StringBuilder(s).reverse().toString().equals(s) && !s.equals("")? "YES" : "NO");
	}
}
