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
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int max = 0, min = 0;
			for(int j = 1; j <= a && j <= b; j++) {
				if(a%j == 0 && b%j == 0) {
					min = j;
				}
			}
			max = a * b / min;
			
			bw.write(max + " " + min + "\n");
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
