import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
			
			int[][] year = new int[126][3];
			
			while(t --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(st.nextToken());
				st.nextToken();
				String s = st.nextToken();
				
				if(s.equals("Gold")) {
					year[n - 1896][0]++;
				}
				else if(s.equals("Silver")) {
					year[n - 1896][1]++;
				}
				else {
					year[n - 1896][2]++;
				}
			}
			int goldyear = 0, gold = 0, allyear = 0, all = 0;
			for(int i = 0; i < year.length; i++) {
				if(gold < year[i][0]) {
					gold = year[i][0];
					goldyear = i + 1896;
				}
				
				if(all < year[i][0] + year[i][1] + year[i][2]) {
					all = year[i][0] + year[i][1] + year[i][2];
					allyear = i + 1896;
				}
			}
			sb.append(goldyear).append(" ").append(allyear).append("\n");
		}
		System.out.print(sb);
	}
}
