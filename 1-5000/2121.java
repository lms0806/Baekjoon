import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][2];
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			
			arr[i][0] = x;
			arr[i][1] = y;
			
			if(!map.containsKey(x)) {
				map.put(x, new HashSet<>());
			}
			
			map.get(x).add(y);
		}
		
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			if(check(map, arr[i][0] + w, arr[i][1]) && check(map, arr[i][0], arr[i][1] + h) && check(map, arr[i][0] + w, arr[i][1] + h)) {
				answer++;
			}
		}
		System.out.print(answer);
	}
	
	public static boolean check(HashMap<Integer, HashSet<Integer>> map, int x, int y) {
		return map.containsKey(x) && map.get(x).contains(y);
	}
}
