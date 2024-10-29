import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[100001];
		prime[0] = prime[1] = true;		
		
		for(int i = 2; i * i < prime.length; i++){
            if(!prime[i]){
            	for(int j = i * i; j < prime.length; j += i) {
            		prime[j] = true;                
            	}
            }
        }
		
		int n = Integer.parseInt(br.readLine());
		
		TreeSet<Integer> set = new TreeSet<>();
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 2; i < prime.length; i++) {
				if(!prime[i] && num % i == 0) {
					set.add(num / i);
					set.add(i);
					break;
				}
			}
		}
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int key : set) {
			sb.append(key).append(" ");
			
			if(++count == 5) {
				count = 0;
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}
