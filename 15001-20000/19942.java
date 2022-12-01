import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int n, answer = Integer.MAX_VALUE;
	static int[][] arr;
	static int[] min = new int[4];
	static int[] select;
	static ArrayList<String> road = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			min[i] = Integer.parseInt(st.nextToken());
		}
		
		arr = new int[n][5];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			select = new int[n];
			dfs(0, i + 1, 0);
		}
		
		if(road.size() > 0) {
			Collections.sort(road);
			
			System.out.print(answer + "\n" + road.get(0));
		}
		else {
			System.out.print(-1);
		}
	}
	
	public static void dfs(int depth, int sel, int start) {
		if(depth == sel) {
			check(sel);
			return;
		}
		
		for(int i = start; i < n; i++) {
			select[depth] = i;
			dfs(depth + 1, sel, i + 1);
		}
	}
	
	public static void check(int sel) {
		int price = 0;
		int[] sum = new int[4];
		
		for(int i = 0; i < sel; i++) {
			for(int j = 0; j < 4; j++) {
				sum[j] += arr[select[i]][j];
			}
			price += arr[select[i]][4];
		}
		
		for(int i = 0; i < 4; i++) {
			if(min[i] > sum[i]) {
				return;
			}
		}
		
		if(answer >= price) {
			if(answer > price) {
				answer = price;
				road.clear();
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < sel; i++) {
				sb.append(select[i] + 1).append(" ");
			}
			road.add(sb.toString());
		}
		return;
	}
}
