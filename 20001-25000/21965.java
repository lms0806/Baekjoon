import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean b = true;
		
		int size = Integer.parseInt(br.readLine());
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		for(int i = 1; i < size; i++) {
			if(num[i - 1] < num[i]) {
				if(count == -1) {
					b = false;
					break;
				}
				count++;
			}
			else if(num[i-1] == num[i]) {
				b = false;
				break;
			}
			else {
				count = -1;
			}
		}
		
		System.out.print(b ? "YES" : "NO");
	}
}
