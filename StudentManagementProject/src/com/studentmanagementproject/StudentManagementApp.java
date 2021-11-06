/**The purpose of this program is to allow users to input student details and compute the marks of the students and distribute grades, 
 * calculate the average overall marks, the number of students falls above, equal, or below average marks, 
 * the number of grades distributed, get the 2 highest score student details, sorting student list in ascending order,
 * and calculate the standard deviation and so on. */
package com.studentmanagementproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {

	/**Global variables*/
	private static Scanner keyboard = new Scanner(System.in);
	private static List<Student> studentList = new ArrayList<Student>();
	private static int option;
	private static int id;
	private static String nric;
	private static String firstName;
	private static String lastName;
	private static Date dob;
	private static boolean gender;
	private static double assignment1Marks;
	private static double assignment2Marks;
	private static double practicalMarks;
	private static double finalExamMarks;
	private static String blockNumber;
	private static String streetName;
	private static String unitNumber;
	private static long postalCode;
	private static double averageOverallMarks;
	private static String grade;

	/**Constant variables*/
	private static final String UPDATE_SUCCESS = "update success";
	private static final String DELETE_SUCCESS = "delete success";
	private static final String STANDARD_DEVIATION = "The standard deviation is ";
	private static final String NUMBER_OF_NA = "Number of NA : ";
	private static final String NUMBER_OF_F = "Number of F : ";
	private static final String NUMBER_OF_P = "Number of P : ";
	private static final String NUMBER_OF_C = "Number of C : ";
	private static final String NUMBER_OF_D = "Number of D : ";
	private static final String NUMBER_OF_HD = "Number of HD : ";
	private static final String ENTER_THE_STUDENT_ID = "Enter the student id:";
	private static final String ENTER_THE_STUDENT_NAME = "Enter the student name:";
	private static final String ABOVE_OR_EQUALS_TO_THE_AVERAGE_OVERALL_MARKS = " student overall marks are above or equals to the average overall marks.";
	private static final String THE_AVERAGE_OVERALL_MARKS_IS = "The average overall marks is ";
	private static final String DD_MM_YYYY = "dd/MM/yyyy";
	private static final String STUDENT_ADDED = "Student added";
	private static final String STUDENT_ARE_IN_THE_LIST = " student are in the list.";
	private static final String DATA_INITIALIZE = "Data initialize";
	private static final String STUDENT_NAME_NOT_FOUND = "student name not found";
	private static final String SECOND_HIGHEST_OVERALL_MARKS = "The student with the second highest overall marks is ";
	private static final String STUDENT_ID_NOT_FOUND = "student id not found";
	private static final String OVERALL_MARKS = "With overall marks of ";
	private static final String HIGHEST_OVERALL_MARKS = "The student with the highest overall marks is ";
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int FOUR = 4;
	private static final int FIVE = 5;
	private static final int SIX = 6;
	private static final int SEVEN = 7;
	private static final int EIGHT = 8;
	private static final int NINE = 9;
	private static final int TEN = 10;
	private static final int ELEVEN = 11;
	private static final int TWELVE = 12;
	private static final int THIRTEEN = 13;
	private static final int TWENTY = 20;
	private static final int FIFTY = 50;
	private static final int SIXTY = 60;
	private static final int SEVENTY = 70;
	private static final int EIGHTY = 80;
	private static final int HUNDRED = 100;
	private static final String OPTION_1 = "Option 1: Quit";
	private static final String OPTION_2 = "Option 2: Add student detail";
	private static final String OPTION_3 = "Option 3: Edit student detail";
	private static final String OPTION_4 = "Option 4: Delete student detail";
	private static final String OPTION_5 = "Option 5: Display student list";
	private static final String OPTION_6 = "Option 6: Compute average overall marks for all students";
	private static final String OPTION_7 = "Option 7: Get the number of students marks that is above or equal to average marks and below average marks";
	private static final String OPTION_8 = "Option 8: Get the number of grades distributed to the student(number of HDs, Ds etc)";
	private static final String OPTION_9 = "Option 9: Use student id to search and display the information of that student";
	private static final String OPTION_10 = "Option 10: Use student name to search and display the information of that student";
	private static final String OPTION_11 = "Option 11: Display the student names of the higest and second highest overall marks";
	private static final String OPTION_12 = "Option 12: Sort and output the student details in ascending order of student ID";
	private static final String OPTION_13 = "Option 13: Sort and output the student details in ascending order of student surname";
	private static final String OPTION_14 = "Option 14: Calculate and display standard deviation of the overall marks in the unit";
	private static final String OPTION_15 = "Option 15: Initialize data";
	private static final String MENU_OPTIONS = "Menu Options: ";
	private static final String ENTER_OPTIONS = "Enter an options: "; 
	private static final String ID_INPUT = "Enter the id :";
	private static final String NRIC_INPUT = "Enter the nric :";
	private static final String FIRSTNAME_INPUT = "Enter the first name :";
	private static final String LASTNAME_INPUT = "Enter the last name :";
	private static final String DOB_INPUT = "Enter the dob in dd/MM/yyyy:";
	private static final String GENDER_INPUT = "Enter the gender. type M for male and F for female :";
	private static final String ADDRESS_INPUT = "Enter the address :";
	private static final String BLOCKNUMBER_INPUT = "Enter the block number : ";
	private static final String STREETNAME_INPUT = "Enter the street name : ";
	private static final String HOUSENUMBER_INPUT = "Enter the house number : ";
	private static final String POSTALCODE_INPUT = "Enter the postal code : ";
	private static final String ASSIGNMENT1MARKS_INPUT = "Enter the assignment 1 marks :";
	private static final String ASSIGNMENT2MARKS_INPUT = "Enter the assignment 2 marks :";
	private static final String PRACTICALMARKS_INPUT = "Enter the practical marks :";
	private static final String FINALEXAMMARKS_INPUT = "Enter the final exam marks :";
	private static final String GRADE_INPUT = "Enter the grade :";
	private static final String DISPLAYING_SORTED_LIST = "Displaying sorted list";
	private static final String WRONG_INPUT = "wrong input, please try again.";
	private static final String HD = "HD";
	private static final String D = "D";
	private static final String C = "C";
	private static final String P = "P";
	private static final String F = "F";
	private static final String NA = "NA";
	private static final String EMPTY_STR = "";
	private static final double ZERO_DOUBLE = 0;
	private static final int ZERO_INT = 0;
	private static final String M = "M";
	private static final String EXIT_OPTION = "13: exit";
	private static final String GRADES_OPTION = "12: grades";
	private static final String FINAL_EXAM_MARKS_OPTION = "11: finalExamMarks";
	private static final String PRACTICAL_MARKS_OPTION = "10: practicalMarks";
	private static final String ASSIGNMENT2_MARKS_OPTION = "9: assignment2Marks";
	private static final String ASSIGNMENT1_MARKS_OPTION = "8: assignment1Marks";
	private static final String ADDRESS_OPTION = "7: address";
	private static final String GENDER_OPTION = "6: gender";
	private static final String DOB_OPTION = "5: dob";
	private static final String LAST_NAME_OPTION = "4: lastName";
	private static final String FIRST_NAME_OPTION = "3: firstName";
	private static final String NRIC_OPTION = "2: nric";
	private static final String ID_OPTION = "1: id";
	private static final String COLUMN_EDIT = "Which column do you wish to edit?";
	private static final String MAIN_MENU = "Going back to main menu";
	private static final String SOMETHING_WENT_WRONG = "something went wrong.";

	public static void main(String[] args) {

		menu();

	}

	/**To display menu*/
	public static void menu()
	{

		int valid = ZERO_INT;

		while(option >= ONE || option <= THIRTEEN)
		{

			do {
				try {

					System.out.println(MENU_OPTIONS);
					System.out.println(OPTION_1);
					System.out.println(OPTION_2);
					System.out.println(OPTION_3);
					System.out.println(OPTION_4);
					System.out.println(OPTION_5);
					System.out.println(OPTION_6);
					System.out.println(OPTION_7);
					System.out.println(OPTION_8);
					System.out.println(OPTION_9);
					System.out.println(OPTION_10);
					System.out.println(OPTION_11);
					System.out.println(OPTION_12);
					System.out.println(OPTION_13);
					System.out.println(OPTION_14);
					System.out.println(OPTION_15);
					System.out.println(ENTER_OPTIONS); 
					option = keyboard.nextInt();

					switch(option)
					{
					case 1:
						System.exit(0);
						break;
					case 2:
						addStudent();
						break;
					case 3:
						editStudent();
						break;
					case 4:
						deleteStudent();
						break;
					case 5:
						displayStudentDetails();
						break;
					case 6:
						computeAverageOverallMarks();
						break;
					case 7:
						aboveOrEqualsAverageOverallMarks();
						break;
					case 8:
						displayGradeCount();
						break;
					case 9:
						searchStudentById();
						break;
					case 10:
						searchStudentByName();
						break;
					case 11:
						displayNameHighestAndSecondHighestOverallMarks();
						break;
					case 12:
						sortStudentListByIDInAscendingOrder();
						break;
					case 13:
						sortStudentListByNameInAscendingOrder();
						break;
					case 14:
						CalculateStandardDeviation();
						break;
					case 15:
						initData();
						break;
					}

					valid = ONE;

				}
				catch(Exception e)
				{
					System.out.println(WRONG_INPUT);
					keyboard.nextLine();
				}
			} while(valid == ZERO_INT);

		}
	}

	/**To initialize hardcoded data*/
	public static void initData() throws ParseException
	{
		Student student1 = new Student(5,"S1234567","John","Tan", new SimpleDateFormat(DD_MM_YYYY).parse("12/12/1994"),
				true, new Address("123","hougang","11-10",123123), 70,50,70,50,0,"");

		Student student2 = new Student(3,"S4234567","Eric","Chan", new SimpleDateFormat(DD_MM_YYYY).parse("15/02/1994"),
				true, new Address("456","serangoon","15-11",123456), 50,70,60,80,0,"");

		Student student3 = new Student(6,"S7234567","Shawn","Lim", new SimpleDateFormat(DD_MM_YYYY).parse("19/11/1988"),
				true, new Address("888","hougang","07-10",123888), 50,60,50,50,0,"");

		Student student4 = new Student(2,"S3234567","Sally","Wong", new SimpleDateFormat(DD_MM_YYYY).parse("18/09/1997"),
				false, new Address("982","seng kang","05-01",123982), 50,50,45,90,0,"");

		Student student5 = new Student(8,"S9234567","Jason","Ang", new SimpleDateFormat(DD_MM_YYYY).parse("22/01/1992"),
				true, new Address("498","hougang","03-03",123498), 50,70,30,70,0,"");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		System.out.println(DATA_INITIALIZE);
	}

	/**To compute students overall marks*/
	public static void computeMarks()
	{
		double overallMarks = ZERO_DOUBLE;

		for(Student student : studentList)
		{
			overallMarks = (student.getAssignment1Marks() * TWENTY/HUNDRED) + (student.getAssignment2Marks() * TWENTY/HUNDRED) + (student.getPracticalMarks() * TEN/HUNDRED) + (student.getFinalExamMarks() * FIFTY/HUNDRED);
			student.setOverallMarks(overallMarks);
		}

	}

	/**To compute students grade*/
	public static void computeGrades()
	{
		for(Student student : studentList)
		{
			if(student.getOverallMarks() >= EIGHTY && student.getOverallMarks() <= HUNDRED)
			{
				student.setGrade(HD);
			}
			else if(student.getOverallMarks() >= SEVENTY && student.getOverallMarks() < EIGHTY)
			{
				student.setGrade(D);
			}
			else if(student.getOverallMarks() >= SIXTY && student.getOverallMarks() < SEVENTY)
			{
				student.setGrade(C);
			}
			else if(student.getOverallMarks() >= FIFTY && student.getOverallMarks() < SIXTY)
			{
				student.setGrade(P);
			}
			else if(student.getOverallMarks() >= ZERO_INT && student.getOverallMarks() < FIFTY)
			{
				student.setGrade(F);
			}
			else
			{
				student.setGrade(NA);
			}

		}
	}

	/**To add student*/
	public static void addStudent()
	{
		String dobString = EMPTY_STR;
		String genderString = EMPTY_STR;

		System.out.println(ID_INPUT);
		id = keyboard.nextInt();

		System.out.println(NRIC_INPUT);
		nric = keyboard.next();

		keyboard.nextLine();

		System.out.println(FIRSTNAME_INPUT);
		firstName = keyboard.nextLine();

		System.out.println(LASTNAME_INPUT);
		lastName = keyboard.nextLine();

		System.out.println(DOB_INPUT);
		dobString = keyboard.next();

		try {
			dob = new SimpleDateFormat(DD_MM_YYYY).parse(dobString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println(GENDER_INPUT);
		genderString = keyboard.next();

		if(genderString.equalsIgnoreCase(M))
		{
			gender = true;
		}
		else if(genderString.equalsIgnoreCase(F))
		{
			gender = false;
		}

		keyboard.nextLine();

		System.out.println(ADDRESS_INPUT);
		System.out.println(BLOCKNUMBER_INPUT);
		blockNumber = keyboard.nextLine();

		System.out.println(STREETNAME_INPUT);
		streetName = keyboard.nextLine();

		System.out.println(HOUSENUMBER_INPUT);
		unitNumber = keyboard.nextLine();

		System.out.println(POSTALCODE_INPUT);
		postalCode = keyboard.nextLong();

		System.out.println(ASSIGNMENT1MARKS_INPUT);
		assignment1Marks = keyboard.nextDouble();

		System.out.println(ASSIGNMENT2MARKS_INPUT);
		assignment2Marks = keyboard.nextDouble();

		System.out.println(PRACTICALMARKS_INPUT);
		practicalMarks = keyboard.nextDouble();

		System.out.println(FINALEXAMMARKS_INPUT);
		finalExamMarks = keyboard.nextDouble();

		Student student = new Student();
		student.setId(id);
		student.setNric(nric);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setDob(dob);
		student.setGender(gender);

		Address address = new Address(blockNumber, streetName, unitNumber, postalCode);

		student.setAddress(address);
		student.setAssignment1Marks(assignment1Marks);
		student.setAssignment2Marks(assignment2Marks);
		student.setPracticalMarks(practicalMarks);
		student.setFinalExamMarks(finalExamMarks);

		studentList.add(student);
		System.out.println(STUDENT_ADDED);
	}

	/**To edit student*/
	public static void editStudent()
	{
		int studentId = ZERO_INT;
		int editOption = ZERO_INT;
		int valid = ZERO_INT;
		String dobString = EMPTY_STR;
		String genderString = EMPTY_STR;

		System.out.println(ENTER_THE_STUDENT_ID);
		studentId = keyboard.nextInt();

		while(option >= ONE || option <= THIRTEEN)
		{
			do {
				try {

					System.out.println(COLUMN_EDIT);
					System.out.println(ID_OPTION);
					System.out.println(NRIC_OPTION);
					System.out.println(FIRST_NAME_OPTION);
					System.out.println(LAST_NAME_OPTION);
					System.out.println(DOB_OPTION);
					System.out.println(GENDER_OPTION);
					System.out.println(ADDRESS_OPTION);
					System.out.println(ASSIGNMENT1_MARKS_OPTION);
					System.out.println(ASSIGNMENT2_MARKS_OPTION);
					System.out.println(PRACTICAL_MARKS_OPTION);
					System.out.println(FINAL_EXAM_MARKS_OPTION);
					System.out.println(GRADES_OPTION);
					System.out.println(EXIT_OPTION);
					System.out.println(ENTER_OPTIONS);
					editOption = keyboard.nextInt();

					if(!studentList.isEmpty())
					{
						for(Student student: studentList)
						{
							if(student.getId() == studentId)
							{
								if(editOption == ONE)
								{
									System.out.println(ID_INPUT);
									id = keyboard.nextInt();
									student.setId(id);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == TWO)
								{
									System.out.println(NRIC_INPUT);
									nric = keyboard.next();

									keyboard.nextLine();

									student.setNric(nric);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == THREE)
								{
									System.out.println(FIRSTNAME_INPUT);
									firstName = keyboard.nextLine();

									student.setFirstName(firstName);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == FOUR)
								{
									System.out.println(LASTNAME_INPUT);
									lastName = keyboard.nextLine();

									student.setLastName(lastName);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == FIVE)
								{
									System.out.println(DOB_INPUT);
									dobString = keyboard.next();

									try {
										dob = new SimpleDateFormat(DD_MM_YYYY).parse(dobString);
									} catch (ParseException e) {
										e.printStackTrace();
									}

									student.setDob(dob);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == SIX)
								{
									System.out.println(GENDER_INPUT);
									genderString = keyboard.next();

									if(genderString.equalsIgnoreCase(M))
									{
										gender = true;
									}
									else if(genderString.equalsIgnoreCase(F))
									{
										gender = false;
									}

									keyboard.nextLine();

									student.setGender(gender);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == SEVEN)
								{

									System.out.println(ADDRESS_INPUT);
									System.out.println(BLOCKNUMBER_INPUT);
									blockNumber = keyboard.nextLine();

									System.out.println(STREETNAME_INPUT);
									streetName = keyboard.nextLine();

									System.out.println(HOUSENUMBER_INPUT);
									unitNumber = keyboard.nextLine();

									System.out.println(POSTALCODE_INPUT);
									postalCode = keyboard.nextLong();

									Address address = new Address(blockNumber, streetName, unitNumber, postalCode);
									student.setAddress(address);
									System.out.println(UPDATE_SUCCESS);

								}
								else if(editOption == EIGHT)
								{
									System.out.println(ASSIGNMENT1MARKS_INPUT);
									assignment1Marks = keyboard.nextDouble();

									student.setAssignment1Marks(assignment1Marks);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == NINE)
								{
									System.out.println(ASSIGNMENT2MARKS_INPUT);
									assignment2Marks = keyboard.nextDouble();

									student.setAssignment2Marks(assignment2Marks);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == TEN)
								{
									System.out.println(PRACTICALMARKS_INPUT);
									practicalMarks = keyboard.nextDouble();

									student.setPracticalMarks(practicalMarks);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == ELEVEN)
								{
									System.out.println(FINALEXAMMARKS_INPUT);
									finalExamMarks = keyboard.nextDouble();

									student.setFinalExamMarks(finalExamMarks);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == TWELVE)
								{
									System.out.println(GRADE_INPUT);
									grade = keyboard.next();

									keyboard.nextLine();

									student.setGrade(grade);
									System.out.println(UPDATE_SUCCESS);
								}
								else if(editOption == THIRTEEN)
								{
									System.out.println(MAIN_MENU);
									menu();
								}
								else
								{
									System.out.println(SOMETHING_WENT_WRONG);
								}

								valid = ONE;
							}
						}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			} while(valid == ZERO_INT);

		}
	}

	/**To delete student*/
	private static void deleteStudent() {

		int deleteId = ZERO_INT;

		System.out.println(ENTER_THE_STUDENT_ID);
		deleteId = keyboard.nextInt();

		int count = ZERO_INT;
		int location = ZERO_INT;
		boolean notFound = true;

		if(!studentList.isEmpty())
		{
			for(Student student: studentList)
			{
				count++;

				if(student.getId() == deleteId)
				{
					location = count;
					notFound = false;
				}

			}

			if(notFound)
			{
				System.out.println(STUDENT_ID_NOT_FOUND);
			}
			else
			{
				studentList.remove(location-1);
				System.out.println(DELETE_SUCCESS);
			}
		}

	}

	/**To display all student details*/
	public static void displayStudentDetails()
	{
		for(Student student : studentList)
		{
			System.out.println(student.toString());
		}
	}

	/**To compute the students average overall marks*/
	public static void computeAverageOverallMarks()
	{
		computeMarks();

		double totalOverallMarks = ZERO_DOUBLE;

		for(Student student: studentList)
		{
			totalOverallMarks += student.getOverallMarks();
		}

		averageOverallMarks = totalOverallMarks / studentList.size();

		System.out.println(studentList.size() + STUDENT_ARE_IN_THE_LIST);
		System.out.println(THE_AVERAGE_OVERALL_MARKS_IS +averageOverallMarks);

	}

	/**To get the count of the student that marks is above or equals to average overall marks*/
	public static void aboveOrEqualsAverageOverallMarks()
	{
		int count = ZERO_INT;

		for(Student student : studentList)
		{
			if(student.getOverallMarks() >= averageOverallMarks)
			{
				count++;
			}
		}

		System.out.println(count + ABOVE_OR_EQUALS_TO_THE_AVERAGE_OVERALL_MARKS);
	}

	/**To get the count of the distribution of grades*/
	public static void displayGradeCount()
	{
		computeGrades();

		int hdCount = ZERO_INT;
		int dCount = ZERO_INT;
		int cCount = ZERO_INT;
		int pCount = ZERO_INT;
		int fCount = ZERO_INT;
		int naCount = ZERO_INT;

		for(Student student : studentList)
		{
			if(student.getGrade().equalsIgnoreCase(HD))
			{
				hdCount++;
			}
			else if(student.getGrade().equalsIgnoreCase(D))
			{
				dCount++;
			}
			else if(student.getGrade().equalsIgnoreCase(C))
			{
				cCount++;
			}
			else if(student.getGrade().equalsIgnoreCase(P))
			{
				pCount++;
			}
			else if(student.getGrade().equalsIgnoreCase(F))
			{
				fCount++;
			}
			else
			{
				naCount++;
			}

		}

		System.out.println(NUMBER_OF_HD + hdCount);
		System.out.println(NUMBER_OF_D + dCount);
		System.out.println(NUMBER_OF_C + cCount);
		System.out.println(NUMBER_OF_P + pCount);
		System.out.println(NUMBER_OF_F + fCount);
		System.out.println(NUMBER_OF_NA + naCount);
	}

	/**To search student by id*/
	public static void searchStudentById()
	{
		int searchId;
		boolean notFound = true;

		System.out.println(ENTER_THE_STUDENT_ID);
		searchId = keyboard.nextInt();

		for(Student student : studentList)
		{
			if(student.getId() == searchId)
			{
				System.out.println(student.toString()); 
				notFound = false;
			}
		}

		if(notFound)
			System.out.println(STUDENT_ID_NOT_FOUND);

	}

	/**To search student by first name*/
	public static void searchStudentByName()
	{
		String searchName;
		boolean notFound = true;

		keyboard.nextLine();

		System.out.println(ENTER_THE_STUDENT_NAME);
		searchName = keyboard.nextLine();

		for(Student student : studentList)
		{

			if(student.getFirstName().equalsIgnoreCase(searchName))
			{
				System.out.println(student.toString());
				notFound = false;
			}

		}

		if(notFound)
		{
			System.out.println(STUDENT_NAME_NOT_FOUND);
		}
	}

	/**To display the students with the highest and second highest overall marks*/
	public static void displayNameHighestAndSecondHighestOverallMarks()
	{
		double highestMarks = ZERO_DOUBLE;
		double secondHighestMarks = ZERO_DOUBLE;
		String highestStudent = EMPTY_STR;
		String secondHighestStudent = EMPTY_STR;

		for(Student student : studentList)
		{
			if(student.getOverallMarks() > highestMarks)
			{
				highestStudent = student.getFirstName() + student.getLastName();
				highestMarks = student.getOverallMarks();
			}
		}

		for(Student student : studentList)
		{
			if(student.getOverallMarks() != highestMarks)
			{
				if(student.getOverallMarks() > secondHighestMarks)
				{
					secondHighestStudent = student.getFirstName() + student.getLastName();
					secondHighestMarks = student.getOverallMarks();
				}
			}
		}

		System.out.println(HIGHEST_OVERALL_MARKS + highestStudent);
		System.out.println(OVERALL_MARKS +highestMarks);

		System.out.println();

		System.out.println(SECOND_HIGHEST_OVERALL_MARKS + secondHighestStudent);
		System.out.println(OVERALL_MARKS +secondHighestMarks);
	}

	/**To sort the student list in ascending order by student id*/
	public static void sortStudentListByIDInAscendingOrder()
	{
		Comparator<Student> studentIDComparator = new Comparator<Student>()
		{
			public int compare(Student s1, Student s2) {

				if(s1.getId() == s2.getId())
				{
					return 0;
				}
				else if(s1.getId() > s2.getId())
				{
					return 1;
				}
				else
				{
					return -1;
				}

			}
		};

		Collections.sort(studentList, studentIDComparator);

		System.out.println(DISPLAYING_SORTED_LIST);

		for(Student student : studentList)
		{
			System.out.println(student.toString());
		}
	}

	/**To sort the student list in ascending order by student name*/
	public static void sortStudentListByNameInAscendingOrder()
	{
		Comparator<Student> studentNameComparator = new Comparator<Student>()
		{
			public int compare(Student s1, Student s2) {

				return s1.getLastName().compareTo(s2.getLastName());  
			}
		};

		Collections.sort(studentList, studentNameComparator);

		System.out.println(DISPLAYING_SORTED_LIST);

		for(Student student : studentList)
		{
			System.out.println(student.toString());
		}
	}

	/**To calculate the standard deviation*/
	public static void CalculateStandardDeviation()
	{
		double sd = ZERO_DOUBLE;
		double mean = ZERO_DOUBLE;
		double score = ZERO_DOUBLE;
		double sumsq = ZERO_DOUBLE;
		double sum = ZERO_DOUBLE;

		computeMarks();

		for(Student student: studentList)
		{
			score = student.getOverallMarks();
			sumsq += Math.pow(score, TWO);
			sum += score; 
		}

		mean = sum / studentList.size(); 
		sd = Math.sqrt((sumsq / studentList.size()) - Math.pow(mean, TWO)); 

		System.out.println(STANDARD_DEVIATION +sd);
	}
}
