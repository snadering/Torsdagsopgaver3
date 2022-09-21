class Main{

	public static void main(String [] args){
		//Task 1.c
		printlfPalindrome("Den laks skal ned");


	



	}
		//Task 1.a
	public static void printlfPalindrome(String str){

		str = str.toLowerCase(); //Task 1.b
		String reversedString = "";
		int strLength = str.length();
		for(int i = (strLength - 1); i >= 0; i--){
			reversedString += str.charAt(i);
			} 
		 if(reversedString.equals(str)){
			System.out.println("It is a palindrome string!");
			}
			else{
				System.out.println("It is NOT a palindrome string!");
				}
	}

}