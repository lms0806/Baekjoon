import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[2][2];
		int idx = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++) {
				if(Integer.parseInt(st.nextToken()) == 1) {
					arr[idx][0] = i;
					arr[idx][1] = j;
					idx++;
				}
			}
		}
		
		System.out.print(Math.abs(arr[0][0] - arr[1][0]) + Math.abs(arr[0][1] - arr[1][1]));
	}
}
