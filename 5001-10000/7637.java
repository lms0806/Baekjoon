import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
			
			int[] time = new int[1440];
			while(t --> 0) {
				String[] s = br.readLine().split("-");
				
				String[] a = s[0].split(":"), b = s[1].split(":");
				
				int atime = Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1]);
				int btime = Integer.parseInt(b[0]) * 60 + Integer.parseInt(b[1]);
				
				for(int i = atime; i < btime; i++) {
					time[i]++;
				}
			}
			
			boolean flag = true;
			for(int i = 0; i < 1440; i++) {
				if(time[i] > 1) {
					flag = false;
					break;
				}
			}
			
			sb.append(flag ? "no conflict" : "conflict").append("\n");
		}
		System.out.print(sb);
	}
}
