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
		
		int[] num = new int[5];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int sum = 0;
			for(int j = 0; j < 5; j++) {
				num[j] = Integer.parseInt(st.nextToken());
				sum += num[j];
			}
			
			Arrays.sort(num);
			
			sum -= (num[4] + num[0]);
			if(num[3] - num[1] >= 4) {
				bw.write("KIN\n");
			}
			else {
				bw.write(sum + "\n");
			}
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
