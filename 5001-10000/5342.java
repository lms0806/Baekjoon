import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = {"Paper", "Printer", "Planners", "Binders", "Calendar", "Notebooks", "Ink"};
		double[] num = {57.99, 120.5, 31.25, 22.5, 10.95, 11.2, 66.95};
		
		double sum = 0;
		while(true) {
			String s = br.readLine();
			
			if(s.equals("EOI")) {
				break;
			}
			
			for(int i = 0; i < str.length; i++) {
				if(str[i].equals(s)) {
					sum += num[i];
					break;
				}
			}
		}
		System.out.print("$" + sum);
	}
}
