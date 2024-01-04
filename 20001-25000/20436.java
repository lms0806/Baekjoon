import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		String[] str = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
		String right = "yuiophjklbnm";
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		char a = st.nextToken().charAt(0), b = st.nextToken().charAt(0);
		
		int ax = 0, ay = 0;
		int bx = 0, by = 0;
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				if(str[i].charAt(j) == a) {
					ax = i;
					ay = j;
				}
				else if(str[i].charAt(j) == b) {
					bx = i;
					by = j;
				}
			}
		}
		
		int answer = 0;
		for(char c : br.readLine().toCharArray()) {
			int x = 0, y = 0;
			
			boolean flag = false;
			for(int i = 0; i < str.length; i++) {
				for(int j = 0; j < str[i].length(); j++) {
					if(str[i].charAt(j) == c) {
						flag = true;
						x = i;
						y = j;
						break;
					}
				}
				
				if(flag) {
					break;
				}
			}
			
			int mina = Math.abs(x - ax) + Math.abs(y - ay);
			int minb = Math.abs(x - bx) + Math.abs(y - by);
			
			if(right.contains(c + "")) {
				answer += minb;
				bx = x;
				by = y;
			}
			else {
				answer += mina;
				ax = x;
				ay = y;
			}
			
			answer++;
		}
		System.out.print(answer);
	}
}
