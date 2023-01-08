import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int minzero = Integer.MAX_VALUE, maxzero = 0;
		int minone = Integer.MAX_VALUE, maxone = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 0) {
				minzero = Math.min(minzero, i);
				maxzero = Math.max(maxzero, i);
			}
			else {
				minone = Math.min(minone, i);
				maxone = Math.max(maxone, i);
			}
		}
		System.out.print(Math.max(maxone - minzero, maxzero - minone));
	}
}
