import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		char[] type = new char[n];
		
		for(int i = 0; i < n; i++) {
			char[] ch = br.readLine().toCharArray();
			arr[i] = ch.length;
			type[i] = ch[0];
			
			for(char c : ch) {
				if(c != type[i]) {
					type[i] = 'O';
					break;
				}
			}
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 6; i++) {
			map.put("PCVSGF".charAt(i), Integer.parseInt(st.nextToken()));
		}
		map.put('O', Integer.parseInt(br.readLine()));
		
		long answer = 0;
		for(int i = 0; i < type.length; i++) {
			answer += arr[i] * (type[i] == 'O' ? map.get(type[i]) : Math.min(map.get(type[i]), map.get('O')));
		}
		System.out.print(answer);
	}
}
