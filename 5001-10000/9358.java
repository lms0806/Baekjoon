import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			int n = Integer.parseInt(br.readLine());
			
			ArrayList<Integer> arr = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			while(arr.size() != 2) {
				int arrsize = arr.size();
				for(int i = 0; i <= arrsize / 2; i++) {
					arr.add(arr.get(i) + arr.get(arrsize - i - 1));
				}
				
				while(arrsize --> 0) {
					arr.remove(0);
				}
			}
			
			sb.append("Case #").append(t).append(": ").append(arr.get(0) > arr.get(1) ? "Alice" : "Bob").append("\n");
		}
		System.out.print(sb);
	}
}
