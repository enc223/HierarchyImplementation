
public class Bird extends Animal implements CanFly{
	private int flyingSpeed=0;
	public Bird() {
		super();
	}
	public Bird(String n, double w, int s, int f) {
		super(n,w,s);
		flyingSpeed=f;
	}
	public void flies() {
	}
}
