import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] sort = new int[n], origin = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			sort[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sort);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int rank = 0;
		for(int i = 0; i < sort.length; i++) {
			if(!map.containsKey(sort[i])) {
				map.put(sort[i], rank++);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < origin.length; i++) {
			sb.append(map.get(origin[i])).append(" ");
		}
		System.out.print(sb);
	}
}
