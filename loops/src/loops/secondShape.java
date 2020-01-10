package loops;

public class secondShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
		
		for(i=0;i<5;i++) {
			System.out.println("");
			for(j=0;j<i;j++) {
				System.out.print(" @ ");
			}
		}
		for(i=5;i>0;i--) {
			System.out.println("");
			for(j=i;j>0;j--) {
				System.out.print(" @ ");
			}
		}

	}

}
