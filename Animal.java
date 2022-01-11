import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
public abstract class Animal implements Comparable<Animal>{
	private String name;
	private double weight;
	private int lifespan;
	int type;
	public Animal() {
		name="";
		weight=0;
		lifespan=0;
	}
	public Animal(String n, double w, int s) {
		name=n;
		weight=w;
		lifespan=s;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public int getLifeSpan() {
		return lifespan;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void setweight(double w) {
		this.weight=w;
	}
	public void setLifeSpan(int s) {
		this.lifespan=s;
	}
	public String toString(Animal a) {
		String s;
		s = String.format("%-10s\t%-10.2f\t%-10d","Bird",name, weight, lifespan);
		return s;
		}
	public int compareTo(Animal a) {
		if (weight<a.weight) {
			return -1;
		}else if (weight>a.weight) {
			return 1;
		}else {
			return 0;
		}
	}

}
