import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
 	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[10][10];
		
		for(int i = 4; i < 10; i++) {
			for(int j = 4; j < 10; j++) {
				arr[i][j] = -1;
			}
		}
		
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			if(n == 1) {
				for(int i = 9; i >= 0; i--) {
					if(arr[i][y] == 0) {
						arr[i][y] = 1;
						break;
					}
				}
				
				for(int i = 9; i >= 0; i--) {
					if(arr[x][i] == 0) {
						arr[x][i] = 1;
						break;
					}
				}
			}
			else if(n == 2) {
				boolean flag = false;
				for(int i = 1; i < 10; i++) {
					if(arr[i][y] == 1 || arr[i][y + 1] == 1) {
						arr[i - 1][y] = 1;
						arr[i - 1][y + 1] = 1;
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					arr[9][y] = 1;
					arr[9][y + 1] = 1;
				}
				
				flag = false;
				for(int i = 0; i < 9; i++) {
					if(arr[x][i] == 1 || arr[x][i + 1] == 1) {
						arr[x][i + 1] = 1;
						arr[x][i] = 1;
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					arr[x][9] = 1;
					arr[x][8] = 1;
				}
			}
			else {
				boolean flag = false;
				for(int i = 1; i < 9; i++) {
					if(arr[i][y] == 1 || arr[i + 1][y] == 1) {
						arr[i][y] = 1;
						arr[i - 1][y] = 1;
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					arr[8][y] = 1;
					arr[9][y] = 1;
				}
				
				flag = false;
				for(int i = 1; i < 10; i++) {
					if(arr[x][i] == 1 || arr[x + 1][i] == 1) {
						arr[x][i - 1] = 1;
						arr[x + 1][i - 1] = 1;
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					arr[x][9] = 1;
					arr[x + 1][9] = 1;
				}
			}
			
			for(int i = 6; i < 10; i++) {
				int count = 0;
				for(int j = 0; j < 4; j++) {
					count += arr[i][j];
				}
				if(count == 4) {
					for(int j = 0; j < 4; j++) {
						arr[i][j] = 0;
					}
					
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
