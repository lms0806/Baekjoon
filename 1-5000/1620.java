import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int pro = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		for(int i = 0; i < size; i++) {
			String read = br.readLine();
			map.put(read, Integer.toString(i+1));
			map.put(Integer.toString(i+1), read);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < pro; i++) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}
}
