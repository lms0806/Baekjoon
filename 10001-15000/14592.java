import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		int maxs = 0, minc = 51, minl = 180;
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			
			if(s > maxs || (s == maxs && c < minc) || (s == maxs && c == minc && l < minl)) {
				maxs = s;
				minc = c;
				minl = l;
				answer = i + 1;
			}
		}
		System.out.print(answer);
	}
}
