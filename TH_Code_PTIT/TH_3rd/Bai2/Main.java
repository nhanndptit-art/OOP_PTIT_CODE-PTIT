package TH_Code_PTIT.TH_3rd.Bai2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	static class Lecturer {
		private final String code;
		private final String name;
		private final String departmentCode;

		Lecturer(int number, String name, String department) {
			this.code = String.format("GV%02d", number);
			this.name = name;
			this.departmentCode = abbreviate(department);
		}

		String getCode() {
			return code;
		}

		String getName() {
			return name;
		}

		String getLastName() {
			String[] words = name.split("\\s+");
			return words[words.length - 1];
		}

		String getDepartmentCode() {
			return departmentCode;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int lecturerCount = Integer.parseInt(reader.readLine().trim());
		List<Lecturer> lecturers = new ArrayList<>();

		for (int i = 1; i <= lecturerCount; i++) {
			String name = reader.readLine().trim();
			String department = reader.readLine().trim();
			lecturers.add(new Lecturer(i, name, department));
		}

		lecturers.sort(Comparator
				.comparing(Lecturer::getLastName)
				.thenComparing(Lecturer::getCode));

		for (Lecturer lecturer : lecturers) {
			System.out.printf("%s %s %s%n",
					lecturer.getCode(), lecturer.getName(), lecturer.getDepartmentCode());
		}
	}

	private static String abbreviate(String department) {
		StringBuilder result = new StringBuilder();
		for (String word : department.split("\\s+")) {
			result.append(Character.toUpperCase(word.charAt(0)));
		}
		return result.toString();
	}
}
