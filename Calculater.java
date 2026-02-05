public class Calculater{
	
	public static void main(String[] arg){
		
		int A1=multiple(3,4);
		int A2=multiple(5,7);
		int A3=add(A1,A2);
		int A4=square(A3);
		
		System.out.println("1. "+A4);
		
		int B1=add(4,7);
		int B2=add(8,3);
        int B3=square(B1);
        int B4=square(B2);
		int B5=add(B3,B4);
		
		System.out.println("2. "+B5);
		
	}
	public static int add( int i, int j){
		return i+j;

	}
	public static int multiple( int i, int j){
		return i*j;

	}
	public static int square( int i){
		return i*i;

	}
	
}