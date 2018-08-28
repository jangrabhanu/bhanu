class Vehicle{
	public static void main(String args[]){
		Vehiclea t2=new Twoa();
		Vehiclea f4=new Foura();
		t2.start();
		t2.stop();
		f4.start();
		f4.stop();
	}
}
abstract class Vehiclea{
	public abstract void start();
	public void stop(){
		System.out.println("Vehicle Is Stopped");
	}

}
class Twoa extends Vehiclea{
	public void start(){
		System.out.print("Two Wheeler is Started \n");
	}
	
}
class Foura extends Vehiclea{
	public void start(){
		System.out.println("Four Wheeler Started");
	}
}


