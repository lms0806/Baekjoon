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
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		
		int[] num = new int[10];
		int[] result = new int[t];
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 10; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num);
			
			result[i] = num[10-3];
		}
		for(int i = 0; i < t; i++) {
			bw.write(result[i] + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
