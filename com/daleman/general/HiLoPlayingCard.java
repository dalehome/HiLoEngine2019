package com.daleman.general;

public class HiLoPlayingCard implements I_PlayingCard {

	@Override
	public int getScore() {
		return score;
	}
	@Override
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String getFace() {
		return face;
	}
	@Override
	public void setFace(String face) {
		this.face = face;
	}
	@Override
	public String getSuit() {
		return suit;
	}
	@Override
	public void setSuit(String suit) {
		this.suit = suit;
	}
	@Override
	public int getValue() {
		return value;
	}
	@Override
	public void setValue(int value) {
		this.value = value;
	}

	private int score;
	private int value;
	private String face;
	private String suit;
}
