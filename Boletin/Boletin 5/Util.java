
public class Util {
	// Función que nos imprime una tabla
		public static void imprime(int[] tab) {
			System.out.println(Arrays.toString(tab));
		}
		
		
		public static int[] leerTabla(int n) {
			Scanner sc = new Scanner(System.in);
			int[] dev = new int[n];
			
			System.out.println("Dime los " + n + " números");
			for(int i=0; i<n; i++) {
				dev[i] = sc.nextInt();
			}
			
			return dev;
			
		}
}
