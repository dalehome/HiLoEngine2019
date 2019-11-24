package com.daleman.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestHarness1 {
	
	static enum suits {CLUBS, DIAMONDS, HEARTS, SPADES} 
	
	static int scores[] = {0, 0, 0, 0, 0, 0, 0, 0, 10 ,1, 2, 3, 4};
	
	static int values[] = {2, 3, 4, 5, 6, 7, 8, 9, 10 ,11, 12, 13, 14};
	
	static String faces[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	static List<I_PlayingCard> packList;
	
	public static void main(String[] args) {
		I_PlayingCard[] packArray = new I_PlayingCard[52];
		
		for (int i = 0; i < packArray.length; i++) {
			packArray[i] = new HiLoPlayingCard();
			packArray[i].setFace(faces[i % 13]);
			packArray[i].setScore(scores[i % 13]);
			packArray[i].setValue(values[i % 13]);
			int suitSelector = i / 13;
			switch(suitSelector) {
				case 0:
					packArray[i].setSuit(suits.CLUBS.toString());
					break;
				case 1:
					packArray[i].setSuit(suits.DIAMONDS.toString());
					break;
				case 2:
					packArray[i].setSuit(suits.HEARTS.toString());
					break;
				case 3:
					packArray[i].setSuit(suits.SPADES.toString());
					break;
			}
			System.out.println(packArray[i].getFace() + " " + packArray[i].getSuit() + " " + packArray[i].getScore() + " " + packArray[i].getValue());
		}
		
		System.out.println("\n\n\n");
		
		packList = Arrays.asList(packArray);
		Collections.shuffle(packList);
		
		for (I_PlayingCard card : packList) {
			System.out.println(card.getFace() + " " + card.getSuit() + " " + card.getScore() + " " + card.getValue());
		}
		
		deal4();
	}
	
	public static void deal4() {
		I_PlayingCard[] daleHand = new HiLoPlayingCard[7];
		I_PlayingCard[] kreepHand = new HiLoPlayingCard[7];
		I_PlayingCard[] ballieHand = new HiLoPlayingCard[7];
		I_PlayingCard[] preezbobHand = new HiLoPlayingCard[7];
		
		for (int i = 0; i < 28; i += 4) {
			daleHand[i % 7] = packList.get(i);
			kreepHand[i % 7] = packList.get(i + 1);
			ballieHand[i % 7] = packList.get(i + 2);
			preezbobHand[i % 7] = packList.get(i + 3);
		}
		
		System.out.println("\n\n\n Dale's Hand: \n\n");
		for (int i = 0; i < daleHand.length; i++) {
			System.out.println(daleHand[i].getFace() + " " + daleHand[i].getSuit() + " " + daleHand[i].getScore() + " " + daleHand[i].getValue());
		}
		
		System.out.println("\n\n\n Kreep's Hand: \n\n");
		for (int i = 0; i < kreepHand.length; i++) {
			System.out.println(kreepHand[i].getFace() + " " + kreepHand[i].getSuit() + " " + kreepHand[i].getScore() + " " + kreepHand[i].getValue());
		}
		
		System.out.println("\n\n\n Ballie's Hand: \n\n");
		for (int i = 0; i < ballieHand.length; i++) {
			System.out.println(ballieHand[i].getFace() + " " + ballieHand[i].getSuit() + " " + ballieHand[i].getScore() + " " + ballieHand[i].getValue());
		}
		
		System.out.println("\n\n\n Preezbob's Hand: \n\n");
		for (int i = 0; i < preezbobHand.length; i++) {
			System.out.println(preezbobHand[i].getFace() + " " + preezbobHand[i].getSuit() + " " + preezbobHand[i].getScore() + " " + preezbobHand[i].getValue());
		}
		
	}
}
