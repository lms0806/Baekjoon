import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("*")) {
				break;
			}
			
			ArrayList<String> arr = new ArrayList<>();
			
			sb.append(s).append(" is ");
			boolean istrue = true;
			for(int i = 1; i < s.length(); i++) {
				for(int j = 0; j < s.length() - i; j++) {
					String str = s.charAt(j) + "" + s.charAt(j + i);
					if(arr.contains(str)) {
						sb.append("NOT ");
						istrue = false;
						break;
					}
					arr.add(str);
				}
				if(!istrue) {
					break;
				}
				arr.clear();
			}
			sb.append("surprising.").append("\n");
		}
		System.out.print(sb);
	}
}
