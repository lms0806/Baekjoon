import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		
		for(int i = 1; i <= num[0]; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(num[j]%i != 0) {
					break;
				}
				else {
					count++;
				}
			}
			if(count == n) {
				bw.append(i + "\n");
			}
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
