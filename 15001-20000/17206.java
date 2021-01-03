import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		
		int[] num = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			int sum = 0;
			num[i] = Integer.parseInt(st.nextToken());
			
			for(int j = 3; j <= num[i]; j += 3) {
				sum += j;
			}
			
			for(int j = 7; j <= num[i]; j += 7) {
				sum += j;
			}
			
			for(int j = 21; j <= num[i]; j += 21) {
				sum -= j;
			}
			bw.write(sum + "\n");
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
