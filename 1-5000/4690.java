public class Main {
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for(int i = 6; i <= 100; i++) {
			int n = i * i * i;
			
			for(int j = 2; j < i - 2; j++) {
				int a = j * j * j;
				for(int k = j + 1; k < i - 1; k++) {
					int b = k * k * k;
					for(int l = k + 1; l < i; l++) {
						int c = l * l * l;
						
						if(n == a + b + c) {
							sb.append("Cube = ").append(i).append(", Triple = (").append(j).append(",").append(k).append(",").append(l).append(")\n");
						}
					}
				}
			}
		}
		System.out.print(sb);
	}
}
