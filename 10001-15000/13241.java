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
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long n = 2;
		long max = 0, min = 1;
		
		while(n<=a && n<=b) {
			if(a%n == 0 && b%n == 0) {
				min = n;
			}
			n++;
		}
		max = a*b/min;
		
		bw.write(max + "\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
