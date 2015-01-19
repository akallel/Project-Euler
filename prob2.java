// Project Euler problem 2
// Anis Kallel

public class prob2 {
	public static void main (String [] args){	
		int sum=0;
		int v1 =1;
		int v2 =2;
	while (v2<4000000){
		int temp=v2;
		v2=v1+v2;
		v1= temp;
		if(v2%2==0){
			sum+=v2;
		}
		
	}
		System.out.print(sum);
	}
}
