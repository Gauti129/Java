package collection_list_examples;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx implements Comparable<ComparableEx> {
	private String studentname;
	private int rollno;
	private int studentage;

	public ComparableEx(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	// Overriding of compareTo method
	@Override
	public int compareTo(ComparableEx comparableEx) {
		return this.studentage - comparableEx.getStudentage();
	}

	// For printing on console
	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}

	public static void main(String[] args) {

		ArrayList<ComparableEx> li = new ArrayList<ComparableEx>();
		li.add(new ComparableEx(1, "Abc", 12));
		li.add(new ComparableEx(11, "Arbc", 152));
		li.add(new ComparableEx(133, "Abyc", 1542));

		Collections.sort(li);

		for (ComparableEx str : li) {
			System.out.println(str);
		}

	}
}
