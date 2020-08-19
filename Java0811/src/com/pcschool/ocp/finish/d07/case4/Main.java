package com.pcschool.ocp.finish.d07.case4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String path = "src\\com\\pcschool\\ocp\\d07\\case4\\programmer.json";
		String json = new Scanner(new File(path)).useDelimiter("/A").next();
		// System.out.println(json);

		// 透過 Gson 將 Json 資料匯入到 Programmer[] 陣列中
		Programmer[] programmers = new Gson().fromJson(json, Programmer[].class);

		// 有幾筆資料
		System.out.printf("資料筆數: %d\n\n", programmers.length);

		// programmer 總薪資, 平均薪資, 最高薪資, 最低薪資
		IntSummaryStatistics stat = Arrays.stream(programmers).mapToInt(Programmer::getSalary).summaryStatistics();
		System.out.printf("總薪資: %,d\n平均薪資: %,.2f\n最高薪資: %,d\n最低薪資: %,d\n\n", stat.getSum(), stat.getAverage(),
				stat.getMax(), stat.getMin());

		// java平均薪資
		System.out.printf("java平均薪資: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getName().equals("java"))
						.mapToInt(Programmer::getSalary).average().getAsDouble());

		// php平均薪資
		System.out.printf("php平均薪資: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getName().equals("php"))
						.mapToInt(Programmer::getSalary).average().getAsDouble());

		// 男性平均薪資
		System.out.printf("男性平均薪資: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getSex().equals("m"))
						.mapToInt(Programmer::getSalary).average().getAsDouble());

		// 女性平均薪資
		System.out.printf("女性平均薪資: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getSex().equals("f"))
						.mapToInt(Programmer::getSalary).average().getAsDouble());

		// 男性平均年齡
		System.out.printf("男性平均年齡: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getSex().equals("m"))
						.mapToInt(Programmer::getAge).average().getAsDouble());

		// 女性平均年齡
		System.out.printf("女性平均年齡: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getSex().equals("f"))
						.mapToInt(Programmer::getAge).average().getAsDouble());

		// 男性java平均年齡
		System.out.printf("男性java平均年齡: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getSex().equals("m"))
						.filter(p -> p.getName().equals("java")).mapToInt(Programmer::getAge).average().getAsDouble());

		// 男性php平均年齡
		System.out.printf("男性php平均年齡: %,.2f\n",
				Arrays.stream(programmers).filter(programmer -> programmer.getSex().equals("f"))
				.filter(p -> p.getName().equals("php")).mapToInt(Programmer::getAge).average().getAsDouble());

	}
}
