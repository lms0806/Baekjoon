import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			String str = br.readLine();
			
			int s = 0, e = 0;
			int answer = 0, count = 0;
			int[] check = new int[128];
			check[str.charAt(e)]++;
			while(e < str.length()) {
				if(count == n && check[str.charAt(e)] > 0) {
					check[str.charAt(s)]--;
					if(check[str.charAt(s)] == 0) {
						count--;
					}
					s++;
				}
				else {
					answer = Math.max(answer, e - s + 1);
					e++;
					if(e < str.length()) {
						if(check[str.charAt(e)] == 0) {
							count++;
						}
						check[str.charAt(e)]++;
					}
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
