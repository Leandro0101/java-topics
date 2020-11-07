package services;

import java.util.List;

public class CalculationService {
	public static <T extends Comparable<? super T>> T max(List<T> list) {

		if (list.isEmpty())
			throw new IllegalStateException("List can't be empty");

		T max = list.get(0);

		for (T value : list) {
			if (value.compareTo(max) > 0)
				max = value;
		}

		return max;
	}
}
