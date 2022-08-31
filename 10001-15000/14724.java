import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
		
		int n = Integer.parseInt(br.readLine());
		
		int max = 0, idx = 0;
		for(int i = 0; i < str.length; i++) {
			int num = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				num = Math.max(num, Integer.parseInt(st.nextToken()));
			}
			
			if(num > max) {
				max = num;
				idx = i;
			}
		}
		System.out.print(str[idx]);
	}
}
