public class loopPerformance {
	public static void main(String[] args) {
		loopPerformance.testTwoLoops(10000000);
	}
	
	public static void testTwoLoops(long upperBound){
		long startingNumber= 0;
		long start = System.nanoTime();
		for(long i=1; i<= upperBound; i++){
			startingNumber=i;
		}
		long end = System.nanoTime();
		long postIncrementTime=end-start;
		
		System.out.printf(startingNumber +" iterations with i++ took: %,35d\n", postIncrementTime);
		
		
		startingNumber= 0;
		start = System.nanoTime();
		for(long i=1; i<= upperBound; ++i){
			startingNumber=i;
		}
		end = System.nanoTime();
		long preIncrementTime=end-start;
		
		System.out.printf(startingNumber +" iterations with ++i took: %,35d\n", preIncrementTime);
		
		System.out.printf("Difference (post - pre): %,d  nanoseconds\n", (postIncrementTime-preIncrementTime));
	}
}