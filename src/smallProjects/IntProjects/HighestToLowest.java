package smallProjects.IntProjects;

import java.util.ArrayList;

public class HighestToLowest {
	public static void highestToLowest() {
		ArrayList<Integer> sortedNumbers = new ArrayList<>();

		sortedNumbers.add(9925);
		sortedNumbers.add(125);
		sortedNumbers.add(11);
		sortedNumbers.add(66666);
		sortedNumbers.add(12);
		sortedNumbers.add(-190);
		sortedNumbers.add(0);
		sortedNumbers.add(-5);

		customSort(sortedNumbers);

		System.out.println(sortedNumbers);

	}

	public static void customSort(ArrayList<Integer> arrayList) {
		int n = arrayList.size();

		for (int i = 0; i < n; i++) {
			int tempVariable = arrayList.get(i);
			int j = i - 1;

			while (j >= 0 && arrayList.get(j) < tempVariable) {
				arrayList.set(j + 1, arrayList.get(j));
				j = j - 1;
			}
			arrayList.set(j + 1, tempVariable);
		}
	}
}
