package com.pcschool.ocp.d10_ListAndSet.case4;

public class Exam {
	private int score;

	public Exam(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 7;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exam [score=" + score + "]";
	}
	
}
