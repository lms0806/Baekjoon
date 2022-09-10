import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		ArrayList<String> a = new ArrayList<>(), b = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			a.add(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			b.add(st.nextToken());
		}
		
		int scorea = 0, scoreb = 0;
		st = new StringTokenizer(br.readLine());
		while(k --> 0) {
			String s = st.nextToken();
			
			if(a.contains(s)) {
				scorea++;
			}
			else if(b.contains(s)){
				scoreb++;
			}
		}
		
		System.out.print(scorea > scoreb ? "A" : scorea == scoreb ? "TIE" : "B");
	}
}
