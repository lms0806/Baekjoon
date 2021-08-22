import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(check(a, b) || check(b, a)) {
				count++;
			}
		}
		
		System.out.print(size == 3 && count == 3 ? "Wa-pa-pa-pa-pa-pa-pow!" : "Woof-meow-tweet-squeek");
	}
	
	public static boolean check(int a, int b) {
		if(a == 1 && (b == 3 || b == 4) || a == 3 && b == 4) {
			return true;
		}
		return false;
	}
}
