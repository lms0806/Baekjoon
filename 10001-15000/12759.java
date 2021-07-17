import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int nowplayer = Integer.parseInt(br.readLine());
		
		int[][] num = new int[3][3];
		
		int n = 0;
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = nowplayer;
			nowplayer = nowplayer == 1 ? 2 : 1;
			
			n = solve(num);
			if(n != 0) {
				break;
			}
		}
		System.out.print(n);
	}
	
	public static int solve(int[][] num) {
		if(num[0][0] == num[1][1] && num[1][1] == num[2][2]) {
			return num[0][0];
		}
		else if(num[0][2] == num[1][1] && num[1][1] == num[2][0]){
			return num[1][1];
		} // 대각선
		
		else if(num[0][0] == num[0][1] && num[0][1] == num[0][2]) {
			return num[0][0];
		}
		else if(num[1][0] == num[1][1] && num[1][1] == num[1][2]) {
			return num[1][1];
		}
		else if(num[2][0] == num[2][1] && num[2][1] == num[2][2]) {
			return num[2][2];
		}//가로
		
		else if(num[0][0] == num[1][0] && num[1][0] == num[2][0]) {
			return num[0][0];
		}
		else if(num[0][1] == num[1][1] && num[1][1] == num[2][1]) {
			return num[1][1];
		}
		else if(num[0][2] == num[1][2] && num[1][2] == num[2][2]){
			return num[2][2];
		}//세로
		
		return 0;
	}
}
