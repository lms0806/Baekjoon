import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		sb.append("int a;").append("\n");
		sb.append("int *ptr = &a;").append("\n");
		
		String a = "**ptr", b = "&ptr";
		for(int i = 2; i <= n; i++) {
			sb.append("int ").append(a).append(i).append(" = ").append(b).append(i - 1 == 1 ? "" : i - 1).append(";").append("\n");
			
			a = "*" + a;
		}
		System.out.print(sb);
	}
}
