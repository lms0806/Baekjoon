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
		int[] num = new int[3];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num);
			
			bw.append("Scenario #" + (i+1) + ":\n");
			
			if(num[0]*num[0] + num[1]*num[1] == num[2]*num[2]) {
				bw.append("yes\n\n");
			}
			else {
				bw.append("no\n\n");
			}
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
