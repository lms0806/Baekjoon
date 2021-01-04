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
		
		int[] pull = {1,1,2,2,2,8};
		int[] input = new int[pull.length];
		int[] answer = new int[pull.length];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < pull.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < pull.length; i++) {
			answer[i] = pull[i] - input[i];
			bw.write(answer[i] + " ");
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
