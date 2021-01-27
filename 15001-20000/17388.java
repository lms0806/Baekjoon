import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] str = {"Soongsil","Korea","Hanyang"};
		int[] num = new int[3];
		
		int min = 100, sum = 0;
		for(int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(st.nextToken());
			sum += num[i];
			min = Math.min(min, num[i]);
		}
		if(sum >= 100) {
			System.out.println("OK");
		}
		else {
			for(int i = 0; i < 3; i++) {
				if(min == num[i]) {
					System.out.println(str[i]);
				}
			}
		}
	}
}
