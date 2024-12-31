import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			map.put(st.nextToken(), i);
		}
		
		String[] str = br.readLine().split(" ");
		
		int count = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(map.get(str[i]) < map.get(str[j])) {
					count++;
				}
			}
		}
		
		System.out.print(String.format("%d/%d", count, n * (n - 1) / 2));
	}
}
