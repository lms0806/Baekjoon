import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		
		for(int i = 0; i < 51; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			if(!map.containsKey(s)) {
				map.put(s, new ArrayList<>());
			}
			
			map.get(s).add(num);
		}
		
		String as = null;
		int an = 0;
		for(String key : map.keySet()) {
			if(map.get(key).size() != 13) {
				as = key;
				
				boolean[] flag = new boolean[14];
				for(int a : map.get(key)) {
					flag[a] = true;
				}
						
				for(int i = 1; i < 14; i++) {
					if(!flag[i]) {
						an = i;
						break;
					}
				}
				
				break;
			}
		}
		System.out.print(as + " " + an);
	}
}
