package gugudan;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args){
		//all
//		for(int i=2; i<10; i++){
//			for(int j=1; j<10; j++){
//				System.out.println(i+" x "+j+" = "+i*j);
//			}
//		}
		
		//input
		System.out.println("input : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a<2 || a>9){
			System.out.println("wrong number");
		}else{
			for(int i=1; i<10; i++){
				System.out.println(a+" x "+i+" = "+a*i);
			}
		}
	}
}
