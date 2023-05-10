import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());

		long holl = 0, hollcount = 0;
		long match = 0, matchcount = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(st.nextToken());

			if(num % 2 == 0){
				holl += i - hollcount;
				hollcount++;
			}
			else{
				match += i - matchcount;
				matchcount++;
			}
		}
		System.out.print(Math.min(holl, match));
	}
}
