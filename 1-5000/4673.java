public class Main {
	public static void main(String[] args) {
		boolean[] b = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = solve(i);
			
			if(n < 10001) {
				b[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < b.length; i++) {
			if(!b[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static int solve(int num) {
		int n = num;
		
		while(num != 0) {
			n += num % 10;
			num /= 10;
		}
		
		return n;
	}
}
