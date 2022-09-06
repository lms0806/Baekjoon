import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		int legs = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i <= legs / a; i++) {
			for(int j = 0; j <= legs / b; j++) {
				for(int k = 0; k <= legs / c; k++) {
					if(i * a + j * b + k * c == legs) {
						sb.append(i).append(" ").append(j).append(" ").append(k).append("\n");
					}
				}
			}
		}
		System.out.print(sb.length() == 0 ? "impossible" : sb);
	}
}
