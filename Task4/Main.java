class Main{
	
	public static void main(String [] args){

		fibonacci(1, 1);

	}

	public static void fibonacci(int a, int b){
		//Task 4.a
		int c = a+b;
		System.out.print("\t"+c);
		a=b;
		b=c;
		if(a <= 1000 && b <= 1000){
		fibonacci(a, b);
		}
	}

}