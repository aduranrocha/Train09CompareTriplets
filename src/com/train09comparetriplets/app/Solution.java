package com.train09comparetriplets.app;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/*
	 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, 
	 * awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, 
	 * and difficulty.
	 * We define the rating for Alice's challenge to be the triplet a = (a[0],a[1],a[2]), and the rating for Bob's 
	 * challenge to be the triplet b = (b[0],b[1],b[2]).
	 * 
	 * Your task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1],a[2] and b[2] with .
	 * If a[i] > b[i], then Alice is awarded 1 point.
	 * If a[i] < b[i], then Bob is awarded 1 point.
	 * If a[i] = b[i], then neither person receives a point.
	 * 
	 * Comparison points is the total points a person earned.
	 * Given a and b, determine their respective comparison points.
	 * 'compareTriplets' has the following parameter(s):
	 * a: an array of integers representing Alice's challenge rating
	 * b: an array of integers representing Bob's challenge rating
	 * 
	 */

	public static void main(String[] args) {
		List<Integer> a = new  ArrayList<Integer>();
		a.add(5);
		a.add(6);
		a.add(7);
		List<Integer> b = new  ArrayList<Integer>();
		b.add(3);
		b.add(6);
		b.add(10);
		System.out.print(compareTriplets(a,b));
	}
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	   List<Integer> score = new  ArrayList<Integer>();
	   int aliceScore = 0;
	   int bobScore = 0;
	   for(int index = 0; index < a.size(); index ++) {
		   if(a.get(index) > b.get(index)) {
			   aliceScore ++;
		   }
		   if(a.get(index) < b.get(index)) {
			   bobScore ++;
		   }
	   }
	   score.add(aliceScore);
	   score.add(bobScore);
	   return score;
	}
}
