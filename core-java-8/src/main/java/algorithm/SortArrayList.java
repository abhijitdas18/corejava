package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Java Program to sort an ArrayList using Comparator

public class SortArrayList {

	public static void main(String[] args) {
		Course cors1 = new Course("Java", 201);
		Course cors2 = new Course("NET", 111);
		Course cors3 = new Course("C Plus", 211);
		Course cors4 = new Course("Spring", 301);
		
		ArrayList <Course> listOfCours = new ArrayList<>();
		listOfCours.add(cors1);
		listOfCours.add(cors2);
		listOfCours.add(cors3);
		listOfCours.add(cors4);
		
		System.out.println("Default value : "+ listOfCours);
		// sort by using title using Compartor
		TitleCompare compare = new TitleCompare();
		Collections.sort(listOfCours, compare);
		System.out.println("After comparator : " + listOfCours);
		
		// Using Java8
		Comparator<Course> titleCompare = (c1, c2) -> c1.getTitle().compareTo(c2.getTitle());
		Collections.sort(listOfCours, titleCompare);
		System.out.println(listOfCours);
		
		// Using Anonymous class
		Comparator<Course> com = new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
			}
		};
		Collections.sort(listOfCours, com);
		System.out.println("Using anonymous class : " + listOfCours);
		

		// Sort by fee using comparator
		Comparator<Course> feeCom = (c1, c2) -> (int) (c1.getFee() - c2.getFee());
		Collections.sort(listOfCours, feeCom);
		System.out.println(" Sort by fee using comparator : " + listOfCours);
	}

	

	
}

class Course {
	String title;
	int fee;
	public Course(String title, int fee) {
		this.title = title;
		this.fee = fee;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [title=" + title + ", fee=" + fee + "]";
	}
	
}

class TitleCompare implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
	
}
