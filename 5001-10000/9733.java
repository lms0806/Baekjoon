import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] strs = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"}; 
		int[] count = new int[7];
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < strs.length; i++) {
			map.put(strs[i], i);
		}
		
		double total = 0;
		String s = "";
		while((s = br.readLine()) != null) {
			String[] str = s.split(" ");
			for(int i = 0; i < str.length; i++) {
				if(map.containsKey(str[i])) {
					count[map.get(str[i])]++;
				}
				total++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < count.length; i++) {
			sb.append(strs[i]).append(" ").append((int)count[i]).append(" ").append(String.format("%.2f",count[i] / total)).append("\n");
		}
		sb.append("Total ").append((int)total).append(" 1.00");
		System.out.print(sb);
	}
}
