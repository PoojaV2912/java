package com.xworkz.app.dto;

public class TheatorDTO implements Comparable<TheatorDTO> {
	private String name;
	private float rating;
	private String location;
	private String movieName;
	public TheatorDTO(String name, float rating, String location, String movieName) {
		super();
		this.name = name;
		this.rating = rating;
		this.location = location;
		this.movieName = movieName;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	@Override
	public String toString() {
		return "TheatorDTO [name=" + name + ", rating=" + rating + ", location=" + location + ", movieName=" + movieName
				+ "]";
	}
	@Override
	public int compareTo(TheatorDTO argument) {
		TheatorDTO current=this;
		if(current.rating==argument.rating)
		{
		return 0;
	}
		if(current.rating > argument.rating)
		{
			return 565;
		}
		if(current.rating < argument.rating) 
		{
			return -10;
		}
		throw new IllegalArgumentException("cannot compare TheatorDTO");
			
		}
			
		}

