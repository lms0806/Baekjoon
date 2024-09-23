import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] check = new boolean[n];
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			check[i] = s.equals(new StringBuilder(s).reverse().toString());
		}
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				
				if(check[i] && check[j]) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
