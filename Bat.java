
public class Bat extends Mammal implements CanFly{
	private int flyingSpeed=0;
	public Bat() {
		super();
	}
	public Bat(String n, double w, int s, int f) {
		super(n,w,s);
		flyingSpeed=f;
	}
	
	public void flies() {
	}

}
