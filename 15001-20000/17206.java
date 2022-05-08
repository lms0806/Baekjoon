import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int temp = 0;
		int[] arr = new int[80001];
		for(int i = 3; i <= 80000; i++) {
			if(i % 3 == 0 || i % 7 == 0) {
				temp += i;
			}
			arr[i] = temp;
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(arr[Integer.parseInt(st.nextToken())]).append("\n");
		}
		System.out.print(sb);
	}
}
