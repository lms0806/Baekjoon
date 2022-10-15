import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		char kind = st.nextToken().charAt(0);
		
		HashSet<String> set = new HashSet<>();
		
		while(n --> 0) {
			set.add(br.readLine());
		}
		
		System.out.print(print(kind, set.size()));
	}
	
	public static int print(char kind, int size) {
        return kind == 'Y' ? size : kind == 'F' ? size / 2 : size / 3;
	}
}
