import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hlo = Integer.parseInt(st.nextToken()), hhi = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int slo = Integer.parseInt(st.nextToken()), shi = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int vlo = Integer.parseInt(st.nextToken()), vhi = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int max = (int) Math.max(r, Math.max(g, b)), min = (int) Math.min(r, Math.min(g, b));
		
		double v = max, s = 255 * (v - min) / max, h = 0;
		
		if(v == r) {
			h = 60 * (g - b) / (v - min);
		}
		else if(v == g) {
			h = 120 + 60 * (b - r) / (v - min);
		}
		else {
			h = 240 + 60 * (r - g) / (v - min);
		}
		
		if(h < 0) {
			h += 360;
		}
		
		System.out.print(hlo <= h && h <= hhi && slo <= s && s <= shi && vlo <= v && v <= vhi ? "Lumi will like it." : "Lumi will not like it.");
	}
}
