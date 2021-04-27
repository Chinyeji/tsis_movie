package com.tsis.movie.model;

public class InfoVo {
	private int movie_id;
	private int theater_no;
	private String movie_name;
	private int price;
	private String time;
	private int seats_left;
	
	public InfoVo(int movie_id, int theater_no, String movie_name, int price, String time, int seats_left) {
		super();
		this.movie_id = movie_id;
		this.theater_no = theater_no;
		this.movie_name = movie_name;
		this.price = price;
		this.time = time;
		this.seats_left = seats_left;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public int getTheater_no() {
		return theater_no;
	}

	public void setTheater_no(int theater_no) {
		this.theater_no = theater_no;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getSeats_left() {
		return seats_left;
	}

	public void setSeats_left(int seats_left) {
		this.seats_left = seats_left;
	}
	
	
//	public int getTest_id() {
//		return test_id;
//	}
//	public void setTest_id(int test_id) {
//		this.test_id = test_id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

}
