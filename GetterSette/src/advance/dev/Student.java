package advance.dev;
import java.util.Scanner;
import java.util.Arrays;
public class Student {

	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private double averageScore;

	// Constructors
	public Student() {
	}

	public Student(String name, int age, String address, String phoneNumber, double averageScore) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.averageScore = averageScore;
	}

	// Getters and Setters with validation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Tuổi phải lớn hơn 0.");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		if (averageScore >= 0) {
			this.averageScore = averageScore;
		} else {
			System.out.println("Điểm trung bình phải lớn hơn hoặc bằng 0.");
		}
}
}
