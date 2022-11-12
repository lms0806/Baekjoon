import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double humanhp = Double.parseDouble(st.nextToken()), humanatk = Double.parseDouble(st.nextToken());
		double devilhp = Double.parseDouble(st.nextToken()), devilatk = Double.parseDouble(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		double p = Double.parseDouble(st.nextToken()), s = Double.parseDouble(st.nextToken());
		
		double human_death_count = Math.ceil(humanhp / devilatk);
		double devil_death_count = 0;
		
		if(devilhp - (Math.ceil(devilhp / humanatk) - 1) * humanatk > p) {
			devil_death_count = Math.ceil(devilhp / humanatk);
		}
		else {
			devil_death_count = Math.ceil((devilhp + s) / humanatk);
		}
		
		System.out.print(human_death_count >= devil_death_count ? "Victory!" : "gg");
	}
}
