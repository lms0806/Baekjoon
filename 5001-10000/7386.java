import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[26], b = new int[26];
		
		for(char c : br.readLine().toCharArray()) {
			a[c - 'A']++;
		}
		for(char c : br.readLine().toCharArray()) {
			b[c - 'A']++;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.print(Arrays.equals(a, b) ? "YES" : "NO");
	}
}
