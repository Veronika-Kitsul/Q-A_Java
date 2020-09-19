//Q&A by Veronika Kitsul
//referred to Mr. David's code

public class QandA {
	
	public static void main (String [] argc)
	{
		System.out.println("Where are you from?");
		sleep(600);
		System.out.println("I am from Western Ukraine.\n");
		sleep(1000);
		
		System.out.println("What is your hobby?");
		sleep(600);
		System.out.println("I am engaged in sustainability youth NGO in Ukraine. Since quarantine we do all of our projects remotely, but I still love it! I also used to do martial arts, but I am not sure what will happen this year, since it is a very close-contact sport. I also like conducting investigations on Physics, play different board games (or just any games really) with friends (even via zoom!)\n");
		sleep (1500);
		
		System.out.println("Do you have any siblings?");
		sleep(500);
		System.out.println("I have younger sister and younger brother\n");
		sleep(700);
		
		System.out.println("Favorite musicians? Shows/Movies?");
		sleep(700);
		System.out.println("I listen very different music depending on time of the year, mood, etc. Now I listen a lot of Ukrainian/Russian songs, Indie music, Pop.");
		sleep(400);
		System.out.println("I don't watch TV at all, but I love watching series. I have a couple of episodes left of The Big Bang Theory now. Love the Show! If you like comedies + science mix - then you may like it as well.\n ");
		sleep(1300);
		
		System.out.println("How did you spend your summer?");
		sleep(500);
		System.out.println("I took several online-courses, was running a project of ethical Bot, had an intership in researching for Ukrainian startup that checks students's essays based on AI and machine learning, helped to organize an online boot-camp for 50 students and 63 volunteers.");
		
		
	}
	

	private static void sleep(int time) {
		try 
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
