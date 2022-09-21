import java.util.Random;

//Task 3.a
class MathWork{



MathWork(){
	
}


//Task 3.b
	public void divisible(int a){
		for(int i = 1; i <= 100; i++){
			if(i % a == 0) System.out.println(i);
		}

	}
	public int getRandom(int[] arr){
		Random r = new Random();
		int randomNumber = r.nextInt(arr.length);
		return arr[randomNumber];


	}


}