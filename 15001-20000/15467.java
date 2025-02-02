import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			HashMap<Integer, Integer> map = new HashMap<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 6; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			
			int[] num = new int[7];
			for(int key : map.keySet()) {
				num[map.get(key)]++;
			}
			
			sb.append(print(num)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(int[] num) {
		if(num[1] == 6) {
			return "single";
		}
		if(num[1] == 4 && num[2] == 1) {
			return "one pair";
		}
		if(num[1] == 2 && num[2] == 2) {
			return "two pairs";
		}
		if(num[2] == 3) {
			return "three pairs";
		}
		if(num[1] == 3 && num[3] == 1) {
			return "one triple";
		}
		if(num[3] == 2) {
			return "two triples";
		}
		if(num[1] == 2 && num[4] == 1) {
			return "tiki";
		}
		return num[2] == 1 && num[4] == 1 ? "tiki pair" : "full house";
	}
}
