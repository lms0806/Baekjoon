import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, dir;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			arr = new int[n][n];
			
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < n; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			if(s.equals("right")) {
				dir = 0;
			}
			else if(s.equals("up")) {
				dir = 1;
			}
			else if(s.equals("left")) {
				dir = 2;
			}
			else {
				dir = 3;
			}
			
			process();
			
			sb.append("Case #").append(i).append(":\n");
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					sb.append(arr[j][k]).append(" ");
				}
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void process() {
		for(int i = 0; i < dir; i++) {
			rotate90();
		}
		
		start();
		if(dir != 0) {
			for(int i = 0; i < 4 - dir; i++) {
				rotate90();
			}
		}
	}
	
	public static void start() {
		for(int i = 0; i < n; i++) {
			poll(i);
			
			for(int j = n - 1; j > 0; j--) {
				if(arr[i][j] == arr[i][j - 1]) {
					arr[i][j] += arr[i][j - 1];
					arr[i][j - 1] = 0;
				}
			}
			
			poll(i);
		}
	}
	
	public static void poll(int i) {
		for(int j = n - 1; j > 0; j--) {
			if(arr[i][j] == 0) {
				int idx = j - 1;
				while(idx > 0 && arr[i][idx] == 0) {
					idx--;
				}
				arr[i][j] = arr[i][idx];
				arr[i][idx] = 0;
			}
		}
	}
	
	public static void rotate90() {
		int[][] map = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			map[i] = arr[i].clone();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[j][n - 1 - i] = map[i][j];
			}
		}
	}
}
