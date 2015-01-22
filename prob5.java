// Project Euler problem 5
// Anis Kallel

public class prob5 {
public static void main (String [] args){
	boolean x=false;
	int i=2520;
	while(x!=true){
		if (yes(i)==true) 
			{x=true;
		System.out.println(i);}
		else{
			i++;
		}
	}
	}

public static boolean yes (int a){
	return (a%1==0) && (a%2==0) &&(a%3==0) && (a%4==0) && (a%5==0) && (a%6==0) && (a%7==0) &&(a%8==0) &&(a%9==0) && (a%10==0) &&(a%11==0) && (a%12==0) &&(a%13==0) &&(a%14==0) &&(a%15==0) && (a%16==0) && (a%17==0) &&(a%18==0) &&(a%19==0) &&(a%20==0);
	}
}
