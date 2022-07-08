package com.yong.test1;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
	//class Solution {
		//public long solution(int a, int b) {
			long answer =0;
			
			Scanner scan = new Scanner(System.in);
			
			
			int a1 = scan.nextInt();
			int b1 = scan.nextInt();
			
			//System.out.println(a1);
			//System.out.println(b1);
			
			{
			
			if (a1<b1) {
				for(int i=a1; i<=b1; i++ )
					answer= answer+i;
				System.out.println(answer);
			}
				
			else if (a1>b1){
				for(int j=b1; j<=a1; j++)
					answer= answer+j;
				System.out.println(answer);
				
			}
			
			else {
				answer=a1;
				System.out.println(answer);
			
			}
	}
	}
}
			
		
	

