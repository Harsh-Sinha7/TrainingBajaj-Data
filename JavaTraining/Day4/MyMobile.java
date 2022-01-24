package com.bajaj.day2;

//component 
interface FeaturesMobile
{
	
public void calling(); //calling 2g
public void sendSMS();
public void playGame();
	
}

abstract class SimCardHolder
{

	//non abstract method
	public void simCard()
	{
		System.out.println("Normal Sim card");
	}
	// abstract method
	abstract void hybridSimCard();
	
	
	
	
}

class SmartMobile extends SimCardHolder implements FeaturesMobile
{
	@Override
	void hybridSimCard()
	{
		
	}

	public void OS()
	{
		System.out.println("Android ");
	}
	
	public void vidoCalling()
	{
		System.out.println("video calling");
	}
	
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("5 calling ");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Play games");
	}
	
}

class Nokia implements FeaturesMobile
{
  
	public void brand() {
		System.out.println("Nokia");
	}
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		
	}
	
}

class Sumsung implements FeaturesMobile
{
	
	public void brand() {
		System.out.println("sumsung");
	}
	

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("sumsung apple");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("sumsung apple");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("sumsung apple");
	}
	
}
class Apple implements FeaturesMobile
{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling apple");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("sms apple");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("sms playGame");
	}
	
}


public class MyMobile {
	
	public static void main(String args[])
	{
		
	
		//child class reference to parent
		
		
		FeaturesMobile mobile=new Sumsung();
		mobile.calling();
		mobile.sendSMS();
		mobile.playGame();
		//mobile.
		
		Apple apple=new Apple();
		
		
		//mobile2.
		
		//abstract class
	/*	SimCardHolder sim=new SimCardHolder() {
			
			@Override
			void hybridSimCard() {
				System.out.println("My sim card");
				
			}
		};
		
		sim.hybridSimCard();
		sim.simCard();
		//interface 
		FeaturesMobile featuresMobile=new FeaturesMobile() {
			
			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void calling() {
				// TODO Auto-generated method stub
				
			}
		};
	}*/
	}

}
