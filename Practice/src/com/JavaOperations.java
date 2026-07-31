package com;

public class JavaOperations {


		public static void main(String [] args){
			System.out.println("Hello World");

			int a = 30;
			int b = 40;
			int sum = a+b;
			System.out.println(sum);
			System.out.println("Sum :"+sum);

			JavaOperations opr = new JavaOperations();
			opr.display(a,b);
			int product = opr.prod(a,b);
			System.out.println(product);
		}

		public void display(int a ,int b){
			System.out.println(a +" "+ b);
		}

		public int prod(int a, int b){
			int prod = a * b;
			return prod;

		}
	}

