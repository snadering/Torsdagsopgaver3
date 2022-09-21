class Main{
	
	public static void main(String [] args){

		printPartOfWord("Sander", 0, 5);

	} 

	//Task 2.a
	public static void printPartOfWord(String str, int a, int b){


		System.out.println(str.substring(a, a+b));

	}




}