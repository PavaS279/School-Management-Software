package studets_details;

public interface SchoolInterface {
	
	//To Fetch/Print All Students Details 
	void toPrintAllStudentsDetails() ;
	
	//To Fetch/Print All Parents Details 
	public void toPrintAllParentsDetails() ;
	
	//To Fetch/Print All Teachers Details 
	public void toPrintAllTeachersDetails() ;
	
	
	//To print Details of student by ID
	public void getStudentDetailsByID(int id);
	
	//To print Details of student by Grade
	public void getStudentDetailsByGrade(String grade);

	//To print Details of Parent by student ID
	public void getParentDetailsByStudentID(int id);
	
	//To Insert Student Details
	public void toInsertStudentDetails(int sdnt_roll_no,String first_name,String last_name,String grade,int fees,String dob,String gender);

	//To Insert Parent Details
	public void toInsertParentDetails(int sdnt_roll_no,String father_name, String mother_name, String phone_no, String qualification,String email,String occupition,int income,int f_age,int m_age);
		
	//To Insert Teacher Details
	public void toInsertTeacherDetails(int teacher_id,String name,String teacher_qualification,String gender,String date_of_birth,String phone_no,String email_id,String date_of_joining,String subjects_taken,String class_assigned,String designation,int salary,String city,String father_name_or_spouse_name, String teacher_bio);

	//To Update student Grade by Passing Student ID and Grade
	public void updateStudentGrade(int student_id, String grade);
	
	//To Print Teachers And Subjects Details
	public void toPrintTeachersAndSubjectsDetails();
	
	//To get Salary And Name Of Teacher By ID
	public void getSalaryAndNameOfTeacherByID(int id);
	
	//To Get Highest Fees Paid By Student
	public void toGetHighestFeesPaidByStudent();
	
	//To Get Minimum Fees Paid By Student
	public void toGetMinimumFeesPaidByStudent();
	
	//To Get Average Fees Paid By Students
	public void toGetAverageFeesPaidByStudents();
	
	//To Get Sum Of Fees Paid By Students
	public void toGetSumOfFeesPaidByStudents();
	
	//To Get Total Count Of Students
	public void toGetTotalCountOfStudents();
	
	
	//To Get Highest Fees Paid By Student
	public void toGetHighestIncomeOfParent();
					
	//To Get Minimum Fees Paid By Student
	public void toGetMinimumIncomeOfParent();
					
	//To Get Average Fees Paid By Students
	public void toGetAverageIncomeOfParents();
					
	//To Get Sum Of Fees Paid By Students
	public void toGetSumOfIncomeOfParents();
					
	//To Get Total Count Of Students
	public void toGetTotalCountOfParents();
	
	
	
	
	
	
}
