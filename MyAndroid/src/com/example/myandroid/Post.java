package com.example.myandroid;

public class Post {


	public Post(int pictureId) {
		super();
		this.pictureId = pictureId;
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	private int pictureId;

}
