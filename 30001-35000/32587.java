import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String a = br.readLine(), b = br.readLine();
		
		int aNum = 0, bNum = 0;
		for(int i = 0; i < a.length(); i++) {
			if(check(a.charAt(i), b.charAt(i))) {
				aNum++;
			}
			else if(check(b.charAt(i), a.charAt(i))) {
				bNum++;
			}
		}
		System.out.print(aNum > bNum ? "victory" : "defeat");
	}
	
	public static boolean check(char a, char b) {
		return (a == 'P' && b == 'R') || (a == 'R' && b == 'S') || (a == 'S' && b == 'P');
	}
}
