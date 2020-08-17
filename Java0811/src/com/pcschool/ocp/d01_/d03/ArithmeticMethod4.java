package com.pcschool.ocp.d01_.d03;

import java.util.Arrays;
import java.util.Comparator;

public class ArithmeticMethod4 {
	public static void main(String[] args) {
		Exam[] exams = { new Exam(40), new Exam(50), new Exam(80), new Exam(40), new Exam(90) };
		Arrays.stream(exams)
			.filter(s -> s.getScore() >= 60)
			.sorted(Comparator.comparing(Exam::getScore))
			.forEach(e -> System.out.println(e));
	}
}

class Exam {
	private int score;

	public Exam(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}