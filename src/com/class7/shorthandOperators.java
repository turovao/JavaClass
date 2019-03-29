package com.class7;

public class shorthandOperators {
	public static void main(String[] args) {
		
		int x=1;
		x=x+1; 
	  System.out.println(x);
	  
	  int y=1;
	  y+=1;
	  System.out.println(y);
//increment -->( + + )
	  
	  
	  int z=1;
	  z++;
	  System.out.println(z);
	  
	  int w=2;
	  w++;                                   //++a  preincrement ;--b
	  System.out.println(w);//3              // a++ postincrement;b--
// 2+1
	  //decrement  (- -)
	  int v=10;
	  v--;
	  System.out.println(v);//9
		//10-1
	  
	  int a=10;
	  int b=++a;
	  
	  System.out.println(b);//11 preincrement =first increment ->assign
	  System.out.println(a);//11
	  
	  int c=10; 
	  int d=c++;
	  
	  System.out.println(d);//10 postincrement= first assigh-> increment
	  System.out.println(c);//11
	  
	  int q=100;
	  int e=q--;
	  System.out.println("Value of e is"+e);//100 
	  System.out.println("Value of q is"+q);//99
	  
	  //1)e-> assihn
	  //2)q -> decrement
	   int h=50;//49    both always the same in preincrement
	   int g=--h;//49  1 deceremnt then assighn the value
	   
	   
	  
	  
	  
	  
	}
	
	


	}
	


