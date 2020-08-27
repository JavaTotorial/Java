package com.pcschool.ocp.d10_ListAndSet.case4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class School {
	public static void main(String[] args) {
		Student s1 = new Student("John");
		s1.addScore(80).addScore(90).addScore(90).addScore(70);

		Set<Exam> exams = new LinkedHashSet<>();
		exams.add(new Exam(90));
		exams.add(new Exam(80));
		exams.add(new Exam(70));
		exams.add(new Exam(100));
		Student s2 = new Student("Mary", exams);

		System.out.println(s1);
		System.out.println(s2);

		// 全班
		Set<Student> students = new LinkedHashSet<>();
		students.add(s1);
		students.add(s2);
		System.out.println(students);

		// @formatter:off
		// 所有人的最高分求平均
		double avg = students.parallelStream()
								.mapToInt(s -> s.getExams()
												.parallelStream()
												.mapToInt(Exam::getScore)
												.summaryStatistics()
												.getMax())
								.summaryStatistics()
								.getAverage();
		System.out.printf("所有人的最高分求平均: %.2f\n", avg);
		
		// 取出最高分
		ArrayList<Integer> maxes = students.parallelStream()
				.mapToInt(s -> s.getExams()
				.parallelStream()
				.mapToInt(Exam::getScore)
				.summaryStatistics()
				.getMax()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		System.out.println(maxes);
		// @formatter:on
//		ArrayList<Integer> maxes = students.parallelStream()
//				.collect(
//				() -> new ArrayList<>()
//				, (scoreLt, score) -> scoreLt.add(score),
//				(scoreLt1, scoreLt2) -> scoreLt1.addAll(scoreLt2));
	}
}
