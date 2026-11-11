package TH_Code_PTIT.TH_3rd.Bai5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int departmentCount = Integer.parseInt(reader.readLine().trim());
		Map<String, String> departments = new HashMap<>();
		for (int i = 0; i < departmentCount; i++) {
			String[] parts = reader.readLine().trim().split("\\s+", 2);
			departments.put(parts[0], parts[1]);
		}

		int employeeCount = Integer.parseInt(reader.readLine().trim());
		for (int i = 0; i < employeeCount; i++) {
			String code = reader.readLine().trim();
			String name = reader.readLine().trim();
			long baseSalary = Long.parseLong(reader.readLine().trim());
			long workingDays = Long.parseLong(reader.readLine().trim());

			String departmentCode = code.substring(3, 5);
			long salary = baseSalary * getMultiplier(code) * workingDays * 1000;
			System.out.printf("%s %s %s %d%n",
					code, name, departments.get(departmentCode), salary);
		}
	}

	private static int getMultiplier(String employeeCode) {
		char group = employeeCode.charAt(0);
		int years = Integer.parseInt(employeeCode.substring(1, 3));
		int column;

		if (years <= 3) {
			column = 0;
		} else if (years <= 8) {
			column = 1;
		} else if (years <= 15) {
			column = 2;
		} else {
			column = 3;
		}

		int[][] multipliers = {
				{10, 12, 14, 20},
				{10, 11, 13, 16},
				{9, 10, 12, 14},
				{8, 9, 11, 13}
		};
		return multipliers[group - 'A'][column];
	}
}
