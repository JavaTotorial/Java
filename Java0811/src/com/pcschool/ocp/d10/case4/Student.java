package com.pcschool.ocp.d10.case4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
	private String name;
	private Set<Exam> scores;

	public Student(String name) {
		this(name, new LinkedHashSet<>());
	}

	public Student(String name, Set<Exam> scores) {
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Exam> getScores() {
		return scores;
	}

	public void addScore(int... score) {
		Arrays.stream(score).forEach(s -> scores.add(new Exam(s)));
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", scores=" + scores + "]";
	}

}
