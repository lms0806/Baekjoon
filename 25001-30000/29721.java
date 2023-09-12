import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] dx = {2, 0, -2, 0};
		int[] dy = {0, 2, 0, -2};
		
		long[][] arr = new long[t][2];
		HashSet<Long> check = new HashSet<>();
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Long.parseLong(st.nextToken());
			arr[i][1] = Long.parseLong(st.nextToken());
			
			check.add(arr[i][0] * 100000 + arr[i][1]);	
		}
		
		HashSet<Long> set = new HashSet<>();
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < 4; j++) {
				long nx = arr[i][0] + dx[j];
				long ny = arr[i][1] + dy[j];
				
				if(nx > 0 && nx <= n && ny > 0 && ny <= n && !check.contains(nx * 100000 + ny)) {
					set.add(nx * 100000 + ny);
				}
			}
		}
		System.out.print(set.size());
	}
} 
