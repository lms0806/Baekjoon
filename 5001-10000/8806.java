import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			double[][] arr = new double[2][3];
			
			for(int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 3; j++) {
					arr[i][j] = Double.parseDouble(st.nextToken());
				}
			}
			
			double a = arr[0][0] * arr[1][1] + arr[0][1] * arr[1][2] + arr[0][2] * arr[1][0];
			double b = arr[1][0] * arr[0][1] + arr[1][1] * arr[0][2] + arr[1][2] * arr[0][0];
			
			sb.append(a == b ? "=" : a > b ? "ADAM" : "GOSIA").append("\n");
		}
		System.out.print(sb);
	}
}
