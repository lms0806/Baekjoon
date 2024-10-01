import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= 9; i++) {
			map.put(Integer.parseInt(st.nextToken()), i);
		}
		
		int before = -1;
		StringBuilder sb = new StringBuilder();
		for(char c : br.readLine().toCharArray()) {
			int number = choice(c);
			int num = map.get(number);
			
			if(before == num) {
				sb.append("#");
			}
			for(int i = 0; i < count; i++) {
				sb.append(num);
			}
			
			before = num;
		}
		System.out.print(sb);
	}
	
	public static int choice(char c) {
		if(c < 'd') {
			count = c - 'a' + 1;
			return 2;
		}
		else if(c < 'g') {
			count = c - 'c';
			return 3;
		}
		else if(c < 'j') {
			count = c - 'f';
			return 4;
		}
		else if(c < 'm') {
			count = c - 'i';
			return 5;
		}
		else if(c < 'p') {
			count = c - 'l';
			return 6;
		}
		else if(c < 't') {
			count = c - 'o';
			return 7;
		}
		else if(c < 'w') {
			count = c - 's';
			return 8;
		}
		count = c - 'v';
		return 9;
	}
}
