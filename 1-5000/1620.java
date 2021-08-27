import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()), pro = Integer.parseInt(st.nextToken());

		Map<String, String> map = new HashMap<>();
		for(int i = 1; i <= size; i++) {
			String read = br.readLine();
			map.put(read, Integer.toString(i));
			map.put(Integer.toString(i), read);
		}
		
		StringBuilder sb = new StringBuilder();
		while(pro --> 0) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
}
