package com.IT.epam.bean;

import java.util.Objects;

public class City {
	private String title;
	
	public City() {
		super();
	}

	public City(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "City [title=" + title + "]";
	}
	
}
