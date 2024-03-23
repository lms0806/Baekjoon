import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] s = new String[n];
		int[][][] arr = new int[n][5][5];
		
		for(int i = 0; i < n; i++) {
			s[i] = br.readLine();
			
			for(int j = 0; j < 5; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int k = 0; k < 5; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < 5; j++) {
					boolean flag = false;
					for(int k = 0; k < 5; k++) {
						if(arr[i][j][k] == num) {
							arr[i][j][k] = 0;
							flag = true;
							break;
						}
					}
					
					if(flag) {
						break;
					}
				}
			}
		}
		
		ArrayList<String> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			if(check(arr[i])) {
				answer.add(s[i]);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(answer.size()).append("\n");
		for(String str : answer) {
			sb.append(str).append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int[][] arr) {
		for(int i = 0; i < 5; i++) {
			if(arr[i][0] == 0 && arr[i][1] == 0 && arr[i][2] == 0 && arr[i][3] == 0 && arr[i][4] == 0) {
				return true;
			}
			
			if(arr[0][i] == 0 && arr[1][i] == 0 && arr[2][i] == 0 && arr[3][i] == 0 && arr[4][i] == 0) {
				return true;
			}
		}
		
		if(arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0 && arr[3][3] == 0 && arr[4][4] == 0) {
			return true;
		}
		if(arr[4][0] == 0 && arr[3][1] == 0 && arr[2][2] == 0 && arr[1][3] == 0 && arr[0][4] == 0) {
			return true;
		}
		return false;
	}
}
