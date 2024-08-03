import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				for(int k = 0; k < 101; k++) {
					if(i > 0 || j > 0 || k > 0) {
						if(a * i + b * j + c * k <= n) {
							sb.append(i).append(" Brown Trout, ").append(j).append(" Northern Pike, ").append(k).append(" Yellow Pickerel").append("\n");
							count++;
						}
					}
				}
			}
		}
		sb.append("Number of ways to catch fish: ").append(count);
		
		System.out.print(sb);
	}
}
