//Comparing two objects

package general.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		int num[] = new int[5];
		
		List<Integer> age = new ArrayList<>();
		age.add(45);
		age.add(33);
		age.add(89);
		age.add(21);
		
		System.out.println("Age Entered:"+ age);
		
		//Sort the age
		Collections.sort(age);
		System.out.println("Age after sort:"+ age);
	
	///////////////////////////////////////////////////
		
		Laptop lap01 = new Laptop(8, 8, 40000);
		Laptop lap02 = new Laptop(4, 4, 20000);
		Laptop lap03 = new Laptop(16, 8, 50000);
		Laptop lap04 = new Laptop(4, 12, 140000);
		
		int a = lap01.compareTo(lap02);
		int b = lap04.compareTo(lap03);
		int c = lap02.compareTo(lap04);
		int d = lap03.compareTo(lap02);
		System.out.println(a + ":" + b + ":" + c + ":" +d);

		
	}

}


class Laptop implements Comparable<Laptop>
{
	int ram;
	int cpu;
	int price;
	Laptop(int ram, int cpu, int price)
	{
		this.ram = ram;
		this.cpu = cpu;
		this.price = price;
	}
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	public int compareTo(Laptop lap) {
		if(this.getRam()> lap.getRam() )
			return 1;
		else
			return -1;
		
	}


	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", cpu=" + cpu + ", price=" + price + "]";
	}
	
	
	
	
}