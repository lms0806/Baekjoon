import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static String s;
	static int maxNum;
	static boolean[] check = new boolean[51];
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		s = br.readLine();
		
		maxNum = s.length() > 9 ? 9 + ((s.length() - 9) >> 1) : s.length();
		
		dfs(0);
	}
	
	public static void dfs(int idx) {
		if(idx == s.length()) {
			for(int i = 1; i <= maxNum; i++) {
				if(!check[i]) {
					return;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int a : arr) {
				sb.append(a).append(" ");
			}
			System.out.print(sb);
			
			System.exit(0);
		}
		
		int num = Integer.parseInt(s.substring(idx, idx + 1));
		if(!check[num]) {
			check[num] = true;
			arr.add(num);
			dfs(idx + 1);
			arr.remove(arr.size() - 1);
			check[num] = false;
		}
		
		if(idx < s.length() - 1) {
			num = Integer.parseInt(s.substring(idx, idx + 2));
			
			if(num < 51 && !check[num]) {
				check[num] = true;
				arr.add(num);
				dfs(idx + 2);
				arr.remove(arr.size() - 1);
				check[num] = false;
			}
		}
	}
}
