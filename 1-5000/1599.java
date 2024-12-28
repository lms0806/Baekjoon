import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine().replaceAll("ng", "z");
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>() {{
				put('a', 1);
				put('b', 2);
				put('k', 3);
				put('d', 4);
				put('e', 5);
				put('g', 6);
				put('h', 7);
				put('i', 8);
				put('l', 9);
				put('m', 10);
				put('n', 11);
				put('z', 12);
				put('o', 13);
				put('p', 14);
				put('r', 15);
				put('s', 16);
				put('t', 17);
				put('u', 18);
				put('w', 19);
				put('y', 20);
		}};
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int size = Math.min(o1.length(), o2.length());
				for(int i = 0; i < size; i++) {
					if(o1.charAt(i) != o2.charAt(i)) {
						return map.get(o1.charAt(i)) - map.get(o2.charAt(i));
					}
				}
				return o1.length() - o2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String s : str) {
			sb.append(s.replaceAll("z", "ng")).append("\n");
		}
		System.out.print(sb);
	}
}
