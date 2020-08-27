package com.pcschool.ocp.d09_InterfaceAndInner.case8;

import java.util.function.*;

//@formatter:off
@SuppressWarnings("unused")
public class BMIConsumer {
	public static void main(String[] args) {
		BiConsumer<Double, Integer> bc = (h, w) -> System.out.println(w / Math.pow(h / 100, 2));
		bc.accept(170.0, 60);
		
		BiFunction<Double, Integer, Double> bf = (h, w) -> w / Math.pow(h / 100, 2);
		BiFunction<Double, Integer, Double> bf2 = (h, w) -> h * w;
		double bmi = bf.apply(170.0, 60);
		System.out.println(bmi);

		BiFunction<Double, Double, Double> bf3 = (h, w) -> w / Math.pow(h / 100, 2);
		System.out.println(bf3.apply(170.0, 60.0));

		BinaryOperator<Double> bo = (h, w) -> w / Math.pow(h / 100, 2); // BiFunction<Double, Double, Double>
		System.out.println(bo.apply(170.0, 60.0));

		// 攝氏轉華氏
		Function<Double, Double> f1 = c -> c * (9.0 / 5) + 32;
		UnaryOperator<Double> 	 uo = c -> c * (9.0 / 5) + 32; // Function<Double, Double>
		DoubleUnaryOperator 	 du = c -> c * (9.0 / 5) + 32; // UnaryOperator<Double>

		System.out.println(f1.apply(0.0));
		System.out.println(uo.apply(0.0));
		System.out.println(du.applyAsDouble(0.0));
		
		
		class Exam {
			int chinese;
			int english;
			public Exam(int chinese, int english) {
				this.chinese = chinese;
				this.english = english;
			}
		}
		Exam exam = new Exam(100, 80);
		ObjIntConsumer<Exam> ois = (t, value) -> System.out.println((t.chinese + t.english) / 2 >= value);
		ois.accept(exam, 60);
	}
}
