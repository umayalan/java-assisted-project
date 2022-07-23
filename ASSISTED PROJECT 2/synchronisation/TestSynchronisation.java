package com.simplilearn.synchronisation;


	

	public class TestSynchronisation {
		
		public static void main(String[] args) {
			
			Sender sender = new  Sender();
			
			User t1= new User("umayal", "Hello Good morning....!", sender);
			User t2= new User("vijay","Hii!! how  are you?",sender);
			
			t1.start();
			t2.start();
		}

	}

