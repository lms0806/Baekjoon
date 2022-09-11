import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[] ch;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			ch = br.readLine().toCharArray();
			
			sb.append(check(0, ch.length - 1, 0)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int check(int left, int right, int num) {
		while(left <= right) {
			if(ch[left] != ch[right]) {
				if(num == 0) {
					if(check(left + 1, right, 1) == 0 || check(left, right - 1, 1) == 0) {
						return 1;
					}
					return 2;
				}
				return 2;
			}
			
			left++;
			right--;
		}
		return 0;
	}
}
