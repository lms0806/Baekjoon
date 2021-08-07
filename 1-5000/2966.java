import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		char[] a = {'A','B','C','A','B','C','A','B','C','A','B','C'};
		char[] b = {'B','A','B','C','B','A','B','C','B','A','B','C'};
		char[] c = {'C','C','A','A','B','B','C','C','A','A','B','B'};
		
		br.readLine();
		
		int[] count = new int[3];
		int number = 0;
		String s = br.readLine();
		for(char ch : s.toCharArray()) {
			if(ch == a[number]) {
				count[0]++;
			}
			if(ch == b[number]) {
				count[1]++;
			}
			if(ch == c[number]) {
				count[2]++;
			}
			number++;
			
			if(number % 12 == 0) {
				number = 0;
			}
		}
		
		int max = Math.max(count[0], Math.max(count[1], count[2]));
		
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n");
		
		for(int i = 0; i < 3; i++) {
			if(count[i] == max) {
				sb.append(i == 0 ? "Adrian" : i == 1 ? "Bruno" : "Goran").append("\n");
			}
		}
		
		System.out.print(sb);
	}
}
