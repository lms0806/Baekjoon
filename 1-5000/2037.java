import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		
		int answer = 0;
		int n = 0;
		for(char ch : str.toCharArray()) {
			if(ch == ' ') {
				answer += p;
				n = 0;
			}
			else if(ch == 'A' || ch == 'B' || ch == 'C') {
				if(n == 1) {
					answer += w;
				}
				answer += (ch - 'A' + 1) * p;
				n = 1;
			}
			else if(ch == 'D' || ch == 'E' || ch == 'F') {
				if(n == 2) {
					answer += w;
				}
				answer += (ch - 'C') * p;
				n = 2;
			}
			else if(ch == 'G' || ch == 'H' || ch == 'I') {
				if(n == 3) {
					answer += w;
				}
				answer += (ch - 'F') * p;
				n = 3;
			}
			else if(ch == 'J' || ch == 'K' || ch == 'L') {
				if(n == 4) {
					answer += w;
				}
				answer += (ch - 'I') * p;
				n = 4;
			}
			else if(ch == 'M' || ch == 'N' || ch == 'O') {
				if(n == 5) {
					answer += w;
				}
				answer += (ch - 'L') * p;
				n = 5;
			}
			else if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') {
				if(n == 6) {
					answer += w;
				}
				answer += (ch - 'O') * p;
				n = 6;
			}
			else if(ch == 'T' || ch == 'U' || ch == 'V') {
				if(n == 7) {
					answer += w;
				}
				answer += (ch - 'S') * p;
				n = 7;
			}
			else {
				if(n == 8) {
					answer += w;
				}
				answer += (ch - 'V') * p;
				n = 8;
			}
		}
		System.out.print(answer);
	}
}
