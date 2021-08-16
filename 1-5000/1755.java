import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()), end = Integer.parseInt(st.nextToken());
		
		String[] s = new String[end - start + 1];
		for(int i = start; i <= end; i++) {
			s[i - start] = i > 9 ? str[i / 10 % 10] + " " + str[i % 10] : str[i];
		}
		
		Arrays.sort(s);
		
		int[] n = new int[s.length];
		for(int i = 0; i < s.length; i++) {
			if(s[i].contains(" ")) {
				String[] strs = s[i].split(" ");
				check(str, strs[0], i, n);
				n[i] *= 10;
				check(str, strs[1], i, n);
			}
			else {
				check(str, s[i], i, n);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n.length; i++) {
			sb.append(n[i - 1]).append(" ");
			if(i % 10 == 0) {
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static void check(String[] str, String s, int i, int[] n) {
		for(int j = 0; j < str.length; j++) {
			if(str[j].equals(s)) {
				n[i] += j;
				break;
			}
		}
	}
}
