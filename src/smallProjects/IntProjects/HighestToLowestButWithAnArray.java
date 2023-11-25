package smallProjects.IntProjects;

import java.util.Arrays;

public class HighestToLowestButWithAnArray {
	public static void highestToLowestButWithAnArray() {
		int[] array = {
				1, 2, 3, 4, 5, 6, 7, 8, 2, 2, 2, 2, 2, 4, 4, 4, 1, 1, 4, 6, 2 };

		removeElement(array, 2);

	}

	public static int removeElement(int[] nums, int val) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
			System.out.println(Arrays.toString(nums));
		}

		return index;

	}
}
