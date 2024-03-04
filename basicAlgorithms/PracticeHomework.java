public class PracticeHomework {

	// Q1 Answer
	public int largest(int[] arr){
		int largest = arr[0];
		
		for (int i =0; i<arr.length; i++){
			if (arr[i] > largest){
				largest = arr[i];
			}
		}
		
		return largest;
	}
	
	// Q2 Answer
	public int[] reverse(int[] arr){
		int[] output = new int[arr.length];
		int index = 0;
		for (int i =arr.length-1; i>=0; i--){
			output[index] = arr[i];
			index++;
		}
		return output;
	}
	
	
	// Q3 Answer
	public boolean contains(int[] arr, int target){
		
		for (int i =0; i<arr.length; i++){
			if (target == arr[i]){
				return true;
			}
		}
		
		return false;
	}

	// Q4 Answer
	public int[] odd(int[] arr){
		int[] oddElems = new int[arr.length/2];
		int index = 0;
		for (int i =1; i<arr.length; i+=2){
			oddElems[index] = arr[i];
			index++;
		}
	
		return oddElems;
	}
	
	// Q5 Answer
	public int total(int[] arr){
		int total = 0;
		for (int i =0; i<arr.length; i++){
			total += arr[i];
		}
		
		return total;
	}
	
	// Q6 Answer
	public void table(int num){
		for(int i = 1; i<13; i++){
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public void allTables(){
		for(int i = 1; i<13; i++){
			System.out.println("---------------");
			table(i);
		}
	}
	
	// Q7 Answer
	public boolean isPrime(int num){
		for (int i = 2; i <= (num / 2); i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public void hundredPrimes(){
		int count = 0;
		int num =2;
		while(count < 100){
			if (isPrime(num)){
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
	
	// Q8 Answer
	public void fizzBuzz(){
	    for(int i=1; i<=100; i++) {
			if(i%3 == 0){
				System.out.println("Fizz");
			} else if(i%5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
    }	
	
	public static void main(String[] args){
	
		PracticeHomework ph = new PracticeHomework();
		// Q1
		System.out.println("------Q1-------");
		int[] arr = new int[]{1,2,3,13,24,1,4};
		System.out.println(ph.largest(arr));
		
		// Q2
		System.out.println("------Q2-------");
		int[] reverse = ph.reverse(arr);
		for (int i = 0; i<reverse.length; i++){
			System.out.println(reverse[i]);
		}
		
		// Q3
		System.out.println("------Q3-------");
		System.out.println(ph.contains(arr, 13));
		System.out.println(ph.contains(arr, 100));
		
		// Q4
		System.out.println("------Q4-------");
		int[] odds = ph.odd(arr);
		for (int i = 0; i<odds.length; i++){
			System.out.println(odds[i]);
		}

		// Q5
		System.out.println("------Q5-------");
		System.out.println(ph.total(arr));
		
		// Q6
		System.out.println("------Q6-------");
		ph.allTables();
		
		// Q7 
		System.out.println("------Q7-------");
		ph.hundredPrimes();
		
		// Q8
		System.out.println("------Q8-------");
		ph.fizzBuzz();

	}


}