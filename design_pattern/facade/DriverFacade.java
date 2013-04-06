package facade;

public class DriverFacade {
	public static void main(String[] args) {
		Amplifier amplifer=new Amplifier();
		DvdPlayer dvd=new DvdPlayer();
		Screen screen=new Screen();
		HomeTheater_ homeTheater=new HomeTheater_(amplifer,dvd,screen);
		homeTheater.watchMovie();
		System.out.println();
		homeTheater.endMovie();
}
}
