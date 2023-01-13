import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[16][3];
		
		for(int i = 0; i < 16; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(r == -1 && g == -1 && b == -1) {
				break;
			}
			
			sb.append(print(r, g, b)).append(" maps to ");
			
			int ansr = 0, ansg = 0, ansb = 0, min = Integer.MAX_VALUE;
			for(int i = 0; i < 16; i++) {
				int dr = (int) Math.pow(r - arr[i][0], 2);
				int dg = (int) Math.pow(g - arr[i][1], 2);
				int db = (int) Math.pow(b - arr[i][2], 2);
				int num = (int) Math.sqrt(dr + dg + db);
				
				if(num < min) {
					min = num;
					ansr = arr[i][0];
					ansg = arr[i][1];
					ansb = arr[i][2];
				}
			}
			
			sb.append(print(ansr, ansg, ansb)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(int r, int g, int b) {
		return "(" + r + "," + g + "," + b + ")"; 
	}
}
