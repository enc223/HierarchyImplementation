import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
//Emma Chiusano Exam 1
public class Test extends Animal implements CanFly{
	public static void main(String[]args) throws FileNotFoundException,  InputMismatchException {
		Scanner input=new Scanner(System.in);
		File animalFile=new File("animals.txt");
		int count=0;
		int choice=0;
		String name="";
		double weight=0;
		int lifespan=0;
		String type="";
		int flyingSpeed=0;
		Animal[] animals=new Animal[50];
		try {
			Scanner animalArrayScan=new Scanner (animalFile);
			while (animalArrayScan.hasNext()) {
				String animalNameSwitch=animalArrayScan.next();
				switch (animalNameSwitch) {
					case "Bird":
						animals[count++]=new Bird(animalArrayScan.next(), animalArrayScan.nextDouble(), animalArrayScan.nextInt(), animalArrayScan.nextInt());
						break;
					case "Bat":
						animals[count++]=new Bat(animalArrayScan.next(), animalArrayScan.nextDouble(), animalArrayScan.nextInt(), animalArrayScan.nextInt());
						break;
					case "Cat":
						animals[count++]=new Cat(animalArrayScan.next(), animalArrayScan.nextDouble(), animalArrayScan.nextInt());
						break;
					default:
						System.out.println("Invalid operation");
				}
			}
			animalArrayScan.close();
			}
			catch(FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(0);
		}
		do{
			System.out.println("Select an Operation:"); 
			System.out.println("1: View all Animals");
			System.out.println("2: View Flying Animals");         
			System.out.println("3. Sort Animals by Weight");     
			System.out.println("4: Exit");    
			choice=getInt(choice);
			switch (choice){
			case 1: printAnimals(animals,count); 
				break;
			case 2: printFlyingAnimals(animals,count, flyingSpeed);
				break;
			case 3: //printSortedAnimals(animals,count);
				java.util.Arrays.sort(animals);
				for(int i=0; i<count; i++) {
					System.out.println(animals[i].toString());
					}
				break;
			case 4: 
				System.out.println("Goodbye.");
				break;
			default: System.out.println("You entered an invalid value -- try again");
				break;
			}
			}while(choice != 4);
	}
	public static int getInt(int choice) {
		Scanner input=new Scanner(System.in);
		while(input.hasNextInt()==false) {
			System.out.println("You have entered an invaled input, try again:");
			input.nextLine();//clear the input
		}
		int num=input.nextInt();//get user input
		return num;
	}
	public static void printAnimals(Animal[] list, int count) {
		System.out.println("Type\t\tName\t\tWeight(oz)\tLifespan(years)");
		for(int i=0; i<count; i++) {
			System.out.println(list[i].toString());
		}
	}
	private static void printFlyingAnimals(Animal[] list, int count, int flyingSpeed) {
		System.out.println("List of Flying Animals");
		System.out.println("Type\t\tName\t\tWeight(oz)\tLifespan(years)\tFlying Speed(mph)");
			try {
				for(int i=0; i<count; i++) {
					if (list[i] instanceof Bird) {
						System.out.println(list[i].toString()+"\t"+flyingSpeed);
					} else if (list[i] instanceof Bat) {
						System.out.println(list[i].toString()+"\t"+flyingSpeed);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
/*private static void printSortedAnimals(Animal[]list,int count) {
	java.util.Arrays.sort(list);
	for(int i=0; i<count; i++) {
		System.out.println(list[i].toString());
		}
}*/
public void flies() {
}
}
