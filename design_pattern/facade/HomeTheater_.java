package facade;



public class HomeTheater_ {
   Amplifier amplifier;    //������
   DvdPlayer dvd;
   Screen screen;
   public HomeTheater_(Amplifier amplifier,DvdPlayer dvd,Screen screen)
   {
	   this.amplifier=amplifier;
	   this.dvd=dvd;
	   this.screen=screen;
   }
   //---------------�ṩһ���򻯵Ľӿڣ���ÿ������ί�и���ϵͳ����Ӧ�������,�����û��Ͳ���ȥ���ε���ÿ����ϵͳ�ķ���
   void watchMovie(){
	   System.out.println("׼�����ŵ�Ӱ������");
	   screen.down();
	   amplifier.setVolumes(5);
	   dvd.on();
	   
   }
   void endMovie(){
	   System.out.println("�رյ�Ӱ������");
	   screen.down();
	   amplifier.off();
	   dvd.off();
   }
}
