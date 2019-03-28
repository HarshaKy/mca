class Race extends Thread{
	
	private String model;
	
	private int speed;
	
	public Race(){}
	
	public Race(String model, int speed){
		this.start();
		this.model = model;
		this.speed = speed;
	}
	
	public void go(){
		
		int trackLen = 500;
		int checkpoint = 0;

		for(int i = 0; i < trackLen; i += this.speed){
			if(checkpoint * 100 < i){
				checkpoint++;

				System.out.println(this.model + " has passed the " + checkpoint + "th checkpoint");
			}
		}
	}
	
	@Override
	public void run() {
		go();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Tester {
	public static void main(String[] args) {
		new Race("Audi R8", 100);
		new Race("Lamborghini Aventador", 1);
		new Race("McLaren P1", 10);
	}
}