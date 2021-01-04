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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = 2;
		int max = 0, min = 1;
		
		while(n<=a && n<=b) {
			if(a%n == 0 && b%n == 0) {
				min = n;
			}
			n++;
		}
		max = a*b/min;
		
		bw.write(min + "\n" + max);
		bw.flush();

		br.close();
		bw.close();
	}
}
