import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			
			sb.append("Case #").append(i).append(": ").append("\n");
			for(int j = 0; j < r * 2 + 1; j++) {
				for(int k = 0; k < c * 2 + 1; k++) {
					if(j < 2 && k < 2) {
						sb.append(".");
					}
					else {
						if(j % 2 == 0 && k % 2 == 0) {
							sb.append("+");
						}
						else if(j % 2 == 0 && k % 2 == 1){
							sb.append("-");
						}
						else if(j % 2 == 1 && k % 2 == 0){
							sb.append("|");
						}
						else {
							sb.append(".");
						}
					}
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
