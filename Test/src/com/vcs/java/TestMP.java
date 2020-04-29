package com.vcs.java;

import java.util.ArrayList;
import java.util.List;

public class TestMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("metrics-processor-10-p1");
		list.add("metrics-processor-10-p2");
		list.add("metrics-processor-10-p3");
		list.add("metrics-processor-10-p4");
		list.add("metrics-processor-10-p5");
		list.add("metrics-processor-10-p6");
		list.add("metrics-processor-10-p8");

		int yamlMPCount = 10;
		int serviceCount = 7;

		for (int p = 1; p <= yamlMPCount; p++) {

			if (!hasMetricService(list, p)) {
				System.out.println("create " + p);
			}
		}

	}

	public static boolean hasMetricService(List<String> list, int input) {

		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf((list.get(i).split("-")[3]).substring(1)) == input) {
				return true;
			}
		}
		return false;
	}
}
