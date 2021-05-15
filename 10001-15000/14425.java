import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> arr = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			arr.put(br.readLine(), 1);
		}
		
		int answer = 0;
		for(int i = 0; i < m; i++) {
			if(arr.get(br.readLine()) != null){
				answer++;
			}
		}
		System.out.print(answer);
	}
}
