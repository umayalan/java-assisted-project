package com.simplilearn.annonymousinner;

public class LocalInnerClass {


		

		void Check(String locker_key) {

			

			

			if(locker_key.equals("sanofer@gmail.com")) {

				

				class Inner {

					

					

					void validate() {

						System.out.println("User Found and Authenticated");

					}

					

					

				}

				

				Inner inner= new Inner();

				inner.validate();





			}

			else {

				

				System.out.println("Not Valid");

			}

			

			

		}

		

		

		public static void main(String[] args) {

			

			LocalInnerClass outer= new LocalInnerClass();

			outer.Check("sanofer@gmail.com");

			

			

		}

	}

