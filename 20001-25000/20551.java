import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		while(n --> 0) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.size(); i++) {
			if(map.get(arr.get(i)) == null) {
				map.put(arr.get(i), i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(m --> 0) {
			int num = Integer.parseInt(br.readLine());
			sb.append(map.get(num) == null ? -1 : map.get(num)).append("\n");
		}
		System.out.print(sb);
	}
}
