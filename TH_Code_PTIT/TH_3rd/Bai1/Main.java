package TH_Code_PTIT.TH_3rd.Bai1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Main {
	static class Course {
		String code;
		String name;

		Course(String code, String name) {
			this.code = code;
			this.name = name;
		}
	}

	static class Lecturer {
		String code;
		String name;

		Lecturer(String code, String name) {
			this.code = code;
			this.name = name;
		}
	}

	static class Teaching {
		String lecturerCode;
		String courseCode;
		double hours;

		Teaching(String lecturerCode, String courseCode, double hours) {
			this.lecturerCode = lecturerCode;
			this.courseCode = courseCode;
			this.hours = hours;
		}
	}

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int courseCount = Integer.parseInt(reader.readLine().trim());
		Map<String, Course> courses = new HashMap<>();
		for (int i = 0; i < courseCount; i++) {
			String[] parts = splitCodeAndName(reader.readLine());
			courses.put(parts[0], new Course(parts[0], parts[1]));
		}

		int lecturerCount = Integer.parseInt(reader.readLine().trim());
		Map<String, Lecturer> lecturers = new HashMap<>();
		for (int i = 0; i < lecturerCount; i++) {
			String[] parts = splitCodeAndName(reader.readLine());
			lecturers.put(parts[0], new Lecturer(parts[0], parts[1]));
		}

		int teachingCount = Integer.parseInt(reader.readLine().trim());
		List<Teaching> teachings = new ArrayList<>();
		for (int i = 0; i < teachingCount; i++) {
			String[] parts = reader.readLine().trim().split("\\s+");
			teachings.add(new Teaching(parts[0], parts[1], Double.parseDouble(parts[2])));
		}

		String requestedLecturer = reader.readLine().trim();
		Lecturer lecturer = lecturers.get(requestedLecturer);
		double totalHours = 0;

		System.out.println("Giang vien: " + lecturer.name);
		for (Teaching teaching : teachings) {
			if (teaching.lecturerCode.equals(requestedLecturer)) {
				Course course = courses.get(teaching.courseCode);
				System.out.println(course.name + " " + formatHours(teaching.hours));
				totalHours += teaching.hours;
			}
		}
		System.out.printf("Tong: %.2f%n", totalHours);
	}

	private static String[] splitCodeAndName(String line) {
		String[] parts = line.trim().split("\\s+", 2);
		return new String[]{parts[0], parts[1]};
	}

	private static String formatHours(double hours) {
		if (hours == Math.rint(hours)) {
			return String.format("%.0f", hours);
		}
		return Double.toString(hours);
	}
}
