package com.pcschool.ocp.school;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class School {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/com/pcschool/ocp/school/student.txt");
		String[] datas = new Scanner(file).useDelimiter("/A").next().split("\r\n");
		ArrayList<Student> students = new ArrayList<Student>();
		String[] d;

		for (String data : datas) {
			d = data.split(",");
			students.add(new Student(d[0], Integer.parseInt(d[1]), Integer.parseInt(d[2]), Double.parseDouble(d[3])));
		}

		Collections.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
		
		students.stream().forEach(student -> System.out.println(student));
		System.out.println("==================================================================");

		Collections.sort(students, (o1, o2) -> (int)Math.ceil(o1.getBmi() - o2.getBmi()));
//		Collections.sort(students, (o1, o2) -> (int)Math.ceil(o2.getBmi() - o1.getBmi()));
		
		students.stream().forEach(student -> System.out.println(student));
	}
}
