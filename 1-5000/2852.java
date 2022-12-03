import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int now = 0;
		int timea = 0, timeb = 0;
		int scorea = 0, scoreb = 0;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int winteam = Integer.parseInt(st.nextToken());
			
			String[] s = st.nextToken().split(":");
			int time = Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
			
			if(i != 0) {
				if(scorea > scoreb) {
					timea += time - now;
				}
				else if(scorea < scoreb) {
					timeb += time - now;
				}
			}
			
			if(winteam == 1) {
				scorea++;
			}
			else {
				scoreb++;
			}

			now = time;
			
			if(i == n - 1) {
				if(scorea > scoreb) {
					timea += 2880 - time;
				}
				else if(scorea < scoreb) {
					timeb += 2880 - time;
				}
			}
		}
		
		System.out.print(print(timea / 60) + ":" + print(timea % 60) + "\n" + print(timeb / 60) + ":" + print(timeb % 60));
	}
	
	public static String print(int n) {
		return String.format("%02d", n);
	}
}
