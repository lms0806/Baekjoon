import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
			
			if(p == 0 && s == 0) {
				break;
			}
			
			sb.append("Hole #").append(i).append("\n").append(solve(p, s)).append(".\n\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int p, int s) {
		int dif = p - s;
		
		return dif == 1 ? "Birdie" : dif == -1 ? "Bogey" : dif == 2 && s == 1 ? "Hole-in-one" : dif == 2 ? "Eagle" : dif == 3 ? "Double eagle" : dif == 0 ? "Par" : "Double Bogey";
	}
}
