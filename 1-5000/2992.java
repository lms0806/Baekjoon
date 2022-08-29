import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	static String s;
	static int[] number = new int[10];
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine();
		
		for(char c : s.toCharArray()) {
			number[c - '0']++;
		}
		
		dfs(0, 0);
		
		Collections.sort(arr);
		
		int n = Integer.parseInt(s);
		int answer = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) > n) {
				answer = arr.get(i);
				break;
			}
		}
		
		System.out.println(answer);
	}
	
	public static void dfs(int num, int depth) {
		if(depth == s.length()) {
			arr.add(num);
			return;
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 0 && depth == 0) {
				continue;
			}
			if(number[i] != 0) {
				number[i]--;
				dfs(num * 10 + i, depth + 1);
				number[i]++;
			}
		}
	}
}
