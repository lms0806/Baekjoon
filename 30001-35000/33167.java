import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		char[] a = br.readLine().toCharArray(), b = br.readLine().toCharArray();
		
		int numa = 0, numb = 0;
		for(int i = 0; i < a.length; i++) {
			if(check(a[i], b[i])) {
				numa++;
			}
			else if(check(b[i], a[i])) {
				numb++;
			}
		}
		System.out.print(numa + " " + numb);
	}
	
	public static boolean check(char a, char b) {
		return (a == 'P' && b == 'R') || (a == 'R' && b == 'S') || (a == 'S' && b == 'P');
	}
}
