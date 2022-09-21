class Main{
	
	public static void main(String [] args){
		//Task 3.d
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
		MathWork math = new MathWork();
		//Task 3.c
		//MathWork.divisible(5);
		//System.out.println(math.getRandom(arr));
		countDown(24);

	}

	//3.f
	public static void countDown(int a){
		
		if(a >= 0){
			System.out.println(a);
			countDown(a-1);
		}
	}

}