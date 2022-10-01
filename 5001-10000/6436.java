import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int filesize = 1860000;
		
		int idx = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			n = n % 2 == 0 ? n / 2 : n / 2 + 1;
			n += n / 2;
			
			sb.append("File #").append(idx).append("\n");
			sb.append("John needs ").append((n + filesize - 1) / filesize).append(" floppies.").append("\n\n");
			
			idx++;
		}
		System.out.print(sb);
	}
}
