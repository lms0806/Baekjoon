import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int n) {
		for(int h = 1; h < 10; h++) {
			for(int e = 0; e < 10; e++) {
				if(h == e) {
					continue;
				}
				
				for(int l = 0; l < 10; l++) {
					if(h == l || e == l) {
						continue;
					}
					
					for(int o = 0; o < 10; o++) {
						if(h == o || e == o || l == o) {
							continue;
						}
						
						int hello = h * 10000 + e * 1000 + l * 100 + l * 10 + o;
						
						for(int w = 1; w < 10; w++) {
							if(h == w || e == w || l == w || o == w) {
								continue;
							}
							
							for(int d = 0; d < 10; d++) {
								if(d == h || d == e || d == l || d == o || d == w) {
									continue;
								}
								
								for(int r = 0; r < 10; r++) {
									if(r == h || r == e || r == l || r == o || r == w || r == d) {
										continue;
									}
									
									int world = w * 10000 + o * 1000 + r * 100 + l * 10 + d;
									
									if(hello + world == n) {
										StringBuilder sb = new StringBuilder();
										sb.append("  ").append(hello).append("\n");
										sb.append("+ ").append(world).append("\n");
										sb.append("-------\n");
										sb.append(n < 100000 ? "  " : " ").append(n);
										return sb.toString();
									}
								}
							}
						}
					}
				}
			}
		}
		return "No Answer";
	}
}
