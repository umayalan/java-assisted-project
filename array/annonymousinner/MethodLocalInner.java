package com.simplilearn.annonymousinner;




	public class MethodLocalInner {



		

		public void dispaly() {

			

			class Inner{

				

				int a=10;

				

				void print() 

				{

					System.out.println("Method of inner class");

					System.out.println("Value of a : "+a);

				}

				

			}

			

			Inner inner= new Inner();

			inner.print();

			

			

			

		}

		

		public static void main(String[] args) {

			

			MethodLocalInner outer= new MethodLocalInner();

			outer.dispaly();

			

		}

		

		

}