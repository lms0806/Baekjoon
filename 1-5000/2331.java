import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>(), arr1 = new ArrayList<>();
		
		int n = a;
		while(true) {
			if(arr.contains(n)) {
				for(int i = 0; i < arr.indexOf(n); i++) {
					arr1.add(arr.get(i));
				}
				break;
			}
			else {
				arr.add(n);
			}
			
			int num = 0;
			while(n != 0) {
				num += Math.pow(n % 10, p);
				n /= 10;
			}
			
			n = num;
		}
		System.out.print(arr1.size());
	}
}
