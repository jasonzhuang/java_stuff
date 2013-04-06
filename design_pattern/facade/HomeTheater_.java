package facade;



public class HomeTheater_ {
   Amplifier amplifier;    //扩音器
   DvdPlayer dvd;
   Screen screen;
   public HomeTheater_(Amplifier amplifier,DvdPlayer dvd,Screen screen)
   {
	   this.amplifier=amplifier;
	   this.dvd=dvd;
	   this.screen=screen;
   }
   //---------------提供一个简化的接口，将每项任务委托给子系统中相应组件处理,这样用户就不需去依次调用每个子系统的方法
   void watchMovie(){
	   System.out.println("准备播放电影。。。");
	   screen.down();
	   amplifier.setVolumes(5);
	   dvd.on();
	   
   }
   void endMovie(){
	   System.out.println("关闭电影。。。");
	   screen.down();
	   amplifier.off();
	   dvd.off();
   }
}
