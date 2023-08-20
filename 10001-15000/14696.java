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
			int[][] arr = new int[2][4];
			
			for(int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int n = Integer.parseInt(st.nextToken());
				
				while(n --> 0) {
					arr[i][Integer.parseInt(st.nextToken()) - 1]++;
				}
			}
			
			if(arr[0][3] != arr[1][3]) {
				sb.append(print(arr[0][3], arr[1][3]));
			}
			else if (arr[0][2] != arr[1][2]){
				sb.append(print(arr[0][2], arr[1][2]));
			}
			else if(arr[0][1] != arr[1][1]) {
				sb.append(print(arr[0][1], arr[1][1]));
			}
			else if(arr[0][0] != arr[1][0]) {
				sb.append(print(arr[0][0], arr[1][0]));
			}
			else {
				sb.append('D');
			}
			
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static char print(int a, int b) {
		return a > b ? 'A' : 'B';
	}
} 
