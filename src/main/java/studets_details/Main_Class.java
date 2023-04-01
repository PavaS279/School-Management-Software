package studets_details;

public class Main_Class {

	public static void main(String[] args) {

		SchoolInterfaceImplementation schoolimplement = new SchoolInterfaceImplementation();
		
		//To Fetch/Print All Students Details
//		schoolimplement.toPrintAllStudentsDetails();
		
		//To Fetch/Print All Parents Details
//		schoolimplement.toPrintAllParentsDetails();
		
		//To Fetch/Print All Teachers Details
//		schoolimplement.toPrintAllTeachersDetails();
		
		//To print Details of student by ID
		schoolimplement.getStudentDetailsByID(20);
		
		//To print Details of student by Grade
//		schoolimplement.getStudentDetailsByGrade("7th");
		
		//To print Details of Parent by student ID
//		schoolimplement.getParentDetailsByStudentID(10);
		
		//To Insert Student Details
//		schoolimplement.toInsertStudentDetails(22, "Abimanyu", "A", "7th", 50000, "2007-11-10", "Male");
		
		//To Insert Parent Details 
//		schoolimplement.toInsertParentDetails(21,"Shiva", "Parvathi","1111100000" , "Phd in Physcology", "shivaparvathi01@gmail.com","Lord", 999999, 30, 28);
		
		//To Insert Teachers Details 
//		schoolimplement.toInsertTeacherDetails(121, "S Narayan" , "MA, B.Ed", "Male", "1972-06-15", "9756823414", "naras78@gmail.com", "2001-09-23", "Science", "10th", "Teacher",67000, "Koppala", "Vasuki" ,"A High school teacher with 8 years of experience managing a classroom of 144-895 children. A certified child psychologist who can modify teaching plans for students without compromising the performance of their peers. Seeking an opportunity to educate High School students in all subjects at SSS School of Excellence.");  
		
		//To Update student Grade by Passing Student ID and Grade
//		schoolimplement.updateStudentGrade(10, "8th");
		
		//To Print Teachers And Subjects Details
//		schoolimplement.toPrintTeachersAndSubjectsDetails();
		
		//To get Salary And Name Of Teacher By ID (from 101 to 121 ... so on)
//		schoolimplement.getSalaryAndNameOfTeacherByID(110);

		//To Get Highest Fees Paid By Student
//		schoolimplement.toGetHighestFeesPaidByStudent();
		
		//To Get Minimum Fees Paid By Student
//		schoolimplement.toGetMinimumFeesPaidByStudent();
		
		//To Get Average Fees Paid By Students
//		schoolimplement.toGetAverageFeesPaidByStudents();
		
		//To Get Sum Of Fees Paid By Students
//		schoolimplement.toGetSumOfFeesPaidByStudents();
		
		//To Get Total Count Of Students
//		schoolimplement.toGetTotalCountOfStudents();
		
		//To Get Highest Fees Paid By Student
//		schoolimplement.toGetHighestIncomeOfParent();
				
		//To Get Minimum Fees Paid By Student
//		schoolimplement.toGetMinimumIncomeOfParent();
				
		//To Get Average Fees Paid By Students
//		schoolimplement.toGetAverageIncomeOfParents();
				
		//To Get Sum Of Fees Paid By Students
//		schoolimplement.toGetSumOfIncomeOfParents();
				
		//To Get Total Count Of Students
//		schoolimplement.toGetTotalCountOfParents();
		
	}
	
	
}