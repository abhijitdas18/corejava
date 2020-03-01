package general.collection;

public class Movie implements Comparable<Movie>{
	
	private String 	name;
	private float rating;
	private int year;
	
	
	public Movie(String name, float rating, int year) {
		System.out.println("Movie constructor called _____________________");
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int compareTo(Movie o) {
		System.out.println("Movie : CompareTo is called");
		
		return this.getYear() - o.getYear();
	}
	
	
	
	

}
