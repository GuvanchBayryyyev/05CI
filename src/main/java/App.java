



import java.util.*;

public class App {

	public static List<Integer> singleInput(int number){

			List<Integer> factors = new ArrayList<Integer>();
			for (int i = 2; i <= number; i++) {
				while (number % i == 0) {
					factors.add(i);
					number /= i;
				}
			}
			return factors;
		}
	public static List<Integer> doubleInput(String[]  args){

		int c=0,i,j;
		int l= args.length;
		int h=sc.nextInt();
		for(i=l;i<=h;i++)
		{
			for(j=2;j<i;j++)
				if(i%j==0)
					break;
			if(i==j)
				c++;
		}
		System.out.print(c);
	}

//		double max = Math.sqrt(number) + 1;
//
//		if(number ==2)
//			return true;
//		if (number%2==0)
//			return false;
//		for (long i=3; i<max; i+=2){
//			if (number%i==0){
//				return false;
//			}
//		}
//		return true;
//	}
	public static void main(int[] args){
		if (args.length==1){
			App appObj = new App();
			int result = Integer.parseInt(args);
			System.out.println(appObj.singleInput(result));

		}
		if (args.length==2){
			App appObj = new App();
			int first = args.length[0];
			System.out.println(appObj.doubleInput(args));

		}

//		if (args.length<1 || args.length>1){
//			System.out.println("please input a number as the program argument");
//			System.exit(0);
//		}
//		App appObj = new App();
//		long input = Long.parseLong(args[0]);
//		System.out.println(appObj.isPrime(input));
	}

	
}
