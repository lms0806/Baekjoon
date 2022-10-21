import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int testcase = 1; testcase <= t; testcase++) {
			sb.append("Case #").append(testcase).append(": ");
			
			br.readLine();
			int[][] arr = new int[9][9];
			
			boolean flag = true;
			for(int i = 0; i < 9; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if(arr[i][j] < 1 || arr[i][j] > 9) {
						flag = false;
					}
				}
			}
			sb.append(!flag ? "No" : solve(arr)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int[][] arr) {
		for(int i = 0; i < 9; i++) {
			boolean[] number = new boolean[10], number2 = new boolean[10];
			for(int j = 0; j < 9; j++) {
				if(number[arr[i][j]] || number2[arr[j][i]]) {
					return "No";
				}
				number[arr[i][j]] = true;
				number2[arr[j][i]] = true;
			}
		}
		
		for(int i = 0; i < 9; i += 3) {
			for(int j = 0; j < 9; j += 3) {
				boolean[] number = new boolean[10];
				for(int k = i; k < i + 3; k++) {
					for(int l = j; l < j + 3; l++) {
						if(number[arr[k][l]]) {
							return "No";
						}
						number[arr[k][l]] = true;
					}
				}
			}
		}
		return "Yes";
	}
}
