import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		boolean saflag = false, zaflag = false, ziflag = false;
		int answer = 0;
		while(t --> 0) {
			String s = br.readLine();
			
			switch(s){
				case "botswana":
					break;
				case "ethiopia":
					answer += 50;
					break;
				case "kenya":
					answer += 50;
					break;
				case "namibia":
					answer += saflag ? 40 : 140;
					break;
				case "south-africa":
					saflag = true;
					break;
				case "tanzania":
					answer += 50;
					break;
				case "zambia":
					zaflag = true;
					answer += ziflag ? 20 : 50;
					break;
				case "zimbabwe":
					ziflag = true;
					answer += zaflag ? 0 : 30;
					break;
			}
			
			if(!s.equals("zambia") && !s.equals("zimbabwe")) {
				zaflag = false;
				ziflag = false;
			}
		}
		System.out.print(answer);
	}
}
