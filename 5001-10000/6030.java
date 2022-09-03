import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int p = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arrp = new ArrayList<>(), arrq = new ArrayList<>();
		
		for(int i = 1; i <= p; i++) {
			if(p % i == 0) {
				arrp.add(i);
			}
		}
		for(int i = 1; i <= q; i++) {
			if(q % i == 0) {
				arrq.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arrp.size(); i++) {
			for(int j = 0; j < arrq.size(); j++) {
				sb.append(arrp.get(i)).append(" ").append(arrq.get(j)).append("\n");
			}
		}
		System.out.print(sb);
	}
}
