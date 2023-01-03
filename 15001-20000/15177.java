import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int n;
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[26], b = new int[26];
		
		for(char c : "KANGAROO".toCharArray()) {
			a[c - 'A']++;
		}
		for(char c : "KIWIBIRD".toCharArray()) {
			b[c - 'A']++;
		}
		
		int suma = 0, sumb = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c >= 'A' && c <= 'Z') {
				suma += a[c - 'A'];
				sumb += b[c - 'A'];
			}
			else {
				suma += a[c - 'a'];
				sumb += b[c - 'a'];
			}
		}
		System.out.print(suma > sumb ? "Kangaroos" : suma == sumb ? "Feud continues" : "Kiwis");
	}
}
