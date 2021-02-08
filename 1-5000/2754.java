import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[][] str = {{"A+","4.3"},{"A0","4.0"},{"A-","3.7"},{"B+","3.3"},{"B0","3.0"},{"B-","2.7"},{"C+","2.3"},{"C0","2.0"},{"C-","1.7"},{"D+","1.3"},{"D0","1.0"},{"D-","0.7"},{"F","0.0"}};
		
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length; i++) {
			if(s.equals(str[i][0])) {
				sb.append(str[i][1]).append("\n");
				break;
			}
		}
		System.out.print(sb);
	}
}
