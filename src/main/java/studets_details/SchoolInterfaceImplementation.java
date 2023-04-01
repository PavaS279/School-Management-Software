package studets_details;
import java.sql.*;
public class SchoolInterfaceImplementation implements SchoolInterface {
	
	
	//To Fetch/Print All Students Details 
	public void toPrintAllStudentsDetails() {
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		} 
	}

	@Override      //To Fetch/Print All Parents Details 
	public void toPrintAllParentsDetails() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select * from parent");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}

	@Override       //To Fetch/Print All Teachers Details
	public void toPrintAllTeachersDetails() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select * from teacher");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getString(9)+" "+rs.getString(10)+" "+rs.getString(11)+" "+rs.getString(12)+" "+rs.getString(13)+" "+rs.getString(14)+" "+rs.getString(15)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}


	@Override
	public void getStudentDetailsByID(int id) {
		// TODO Auto-generated method stub
		try{ 
			int s_id=id;
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select * from student where sdnt_roll_no= " + s_id );
			while(rs.next()) {
				System.out.println("Roll Number:- "+rs.getString(1)+" \nName:- "+rs.getString(2)+" "+rs.getString(3)+" \nClass:- "+rs.getString(4)+" \nFees Paid:- "+rs.getString(5)+" \nDate of Birth:- "+rs.getString(6)+" \n"+rs.getString(7)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}

	@Override
	public void getStudentDetailsByGrade(String grade) {
		// TODO Auto-generated method stub
		try{ 
			String s_grade=grade;
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select sdnt_roll_no, first_name, last_name, grade from student where  grade='" + s_grade+"'" );
			while(rs.next()) {
				System.out.println("Roll Number:- "+rs.getString(1)+" \nName:- "+rs.getString(2)+" "+rs.getString(3)+" \nClass:- "+rs.getString(4)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	@Override
	public void toInsertStudentDetails(int sdnt_roll_no,String first_name,String last_name,String grade,int fees,String dob,String gender) {
		// TODO Auto-generated method stub
		
		int rn=sdnt_roll_no;
		String fn= first_name;
		String ln= last_name;
		String gd=grade;
		int fee=fees;
		String dofb=dob;
		String g=gender;
		
		
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			int rs=stmt.executeUpdate("insert into student values( " +rn + ",'"+ fn +"','"+ ln+"','"+ gd+"',"+fee+",'"+dofb+"','"+g+"' );");
			System.out.println("Sucessfully Inserted "+rs+ "Row");
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	@Override
	public void toInsertParentDetails(int sdnt_roll_no,String father_name, String mother_name, String phone_no, String qualification,String email,String occupition,int income,int f_age,int m_age) {
		// TODO Auto-generated method stub
		int rn=sdnt_roll_no;
		String fn=father_name;
		String mn= mother_name;
		String pn =phone_no;
		String q= qualification;
		String em=email;
		String occ=occupition;
		int inc= income;
		int fa=f_age;
		int ma=m_age;
		
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			int rs=stmt.executeUpdate("insert into parent values( " +rn + ",'"+ fn +"','"+ mn+"','"+ pn+"','"+q+"','"+em+"','"+occ+"',"+inc+","+fa+","+ma+" );");
			System.out.println("Sucessfully Inserted "+rs+ "Row");
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	@Override
	public void toInsertTeacherDetails(int teacher_id,String name,String teacher_qualification,String gender,String date_of_birth,String phone_no,String email_id,String date_of_joining,String subjects_taken,String class_assigned,String designation,int salary,String city,String father_name_or_spouse_name, String teacher_bio) {
		// TODO Auto-generated method stub
		int t_id=teacher_id;
		String n=name;
		String t_q=teacher_qualification;
		String g=gender;
		String dob=date_of_birth;
		String pn= phone_no;
		String e_id=email_id;
		String dof_joinung=date_of_joining;
		String s_t=subjects_taken;
		String cl_ass=class_assigned;
		String d=designation;
		int s=salary;
		String c=city;
		String f_n_or_s=father_name_or_spouse_name;
		String t_b= teacher_bio;
		
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			int rs=stmt.executeUpdate("insert into teacher values( " +t_id + ",'"+ n +"','"+ t_q+"','"+ g+"','"+dob+"','"+pn+"','"+e_id+"','"+dof_joinung+"','"+s_t+"','"+cl_ass+"','"+d+"',"+s+",'"+c+"','"+f_n_or_s+"','"+t_b+"' );");
			System.out.println("Sucessfully Inserted "+rs+ "Row");
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
		
	}

	@Override
	public void getParentDetailsByStudentID(int id) {
		// TODO Auto-generated method stub
		int s_id=id;
		try{ 
			
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select * from parent where sdnt_roll_no= " + s_id );
			while(rs.next()) {
				System.out.println("Father Name:- "+rs.getString(2)+" \nMother Name:- "+rs.getString(3)+"\nPhone No. "+rs.getString(4)+" \nQualification:- "+rs.getString(5)+" \ne-mail:- "+rs.getString(6)+" \nDesignation:- "+rs.getString(7)+" \nSalary:- "+rs.getString(8)+" \nFather Age:- "+rs.getString(9)+" \nMother Age:- "+rs.getString(10)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}

	public void updateStudentGrade(int std_id, String gr) {
		// TODO Auto-generated method stub
		String grade=gr;
		int stdntid=std_id;
		
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			int rs=stmt.executeUpdate("update student set grade = '"+ grade+"' where sdnt_roll_no =  " +stdntid);
			System.out.println("Sucessfully Updated "+ rs + " Student ID " + stdntid+" to "+grade+" Standard" );
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}

	public void toPrintTeachersAndSubjectsDetails() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select teacher_id, name, subjects_taken from teacher");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}

	public void getSalaryAndNameOfTeacherByID(int t_id) {
		// TODO Auto-generated method stub
		int id=t_id;
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select teacher_id,name, salary from teacher where teacher_id= " + id+";" );
			while(rs.next()) {
				System.out.println("Teacher ID:- "+rs.getString(1)+" \nName:- "+rs.getString(2)+"\nSalary:-  "+rs.getString(3)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	public void toGetHighestFeesPaidByStudent() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select max(fees) from student");
			while(rs.next()) {
				System.out.println("The Highest Fees Paid by Student is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void toGetMinimumFeesPaidByStudent() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select min(fees) from student");
			while(rs.next()) {
				System.out.println("The Minimum Fees Paid by Student is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void toGetAverageFeesPaidByStudents() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select avg(fees) from student");
			while(rs.next()) {
				System.out.println("The Average Fees Paid by Student is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void toGetSumOfFeesPaidByStudents() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select sum(fees) from student");
			while(rs.next()) {
				System.out.println("The Total Sum of Fees Paid by Students is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void toGetTotalCountOfStudents() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select count(*) from student");
			while(rs.next()) {
				System.out.println("The Total Count of Students is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void toGetHighestIncomeOfParent() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select max(income) from parent");
			while(rs.next()) {
				System.out.println("The Highest Income Of Parent is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void toGetMinimumIncomeOfParent() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select min(income) from parent");
			while(rs.next()) {
				System.out.println("The Minimum Income Of Parent is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void toGetAverageIncomeOfParents() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select avg(income) from parent");
			while(rs.next()) {
				System.out.println("The Average Income Of Parents is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void toGetSumOfIncomeOfParents() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select sum(income) from parent");
			while(rs.next()) {
				System.out.println("The Total Sum of Parents is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	public void toGetTotalCountOfParents() {
		// TODO Auto-generated method stub
		try{ 
//			Class.forName("com.mysql.jdbc.Driver"); // Not required because updated
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/schooldb","root","tiger"); 
			Statement stmt=con.createStatement();//here sonoo is database name, root is usrame and pawrd 
			ResultSet rs=stmt.executeQuery("select count(*) from parent");
			while(rs.next()) {
				System.out.println("The Total Count of Parents is - "+rs.getString(1)); 
			}
			con.close();
		}	
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
//
//	Parent p1 = new Parent("swamy", "Priyanka", 654654, "jkdks", "sdhaku","iuhauid", 5946152);
//	Parent p2 = new Parent("pava", "vasanta", 46546454, "jkdks", "sdhaku","iuhauid", 632656);
//	Parent p3 = new Parent("avi", "sujaa", 65465465, "jkdks", "sdhaku","iuhauid", 54836);
//	Parent p4 = new Parent("mohas", "deepa", 65449654, "jkdks", "sdhaku","iuhauid", 356423);
//	Parent p5 = new Parent("mery", "pooree", 654603654, "jkdks", "sdhaku","iuhauid", 696162);
//	Parent p6 = new Parent("aru", "divya", 6546554, "jkdks", "sdhaku","iuhauid", 300000);
//	Parent p7 = new Parent("ggowda", "sanni", 966447614, "jkdks", "sdhaku","iuhauid", 365942);
//	Parent p8 = new Parent("mahesh", "sujaa", 65465465, "jkdks", "sdhaku","iuhauid", 564486);
//	Parent p9 = new Parent("hemath", "deepa", 65449654, "jkdks", "sdhaku","iuhauid", 696698);
//	Parent p10 = new Parent("kiru", "pooree", 654603654, "jkdks", "sdhaku","iuhauid", 396568);
//	Parent p11 = new Parent("swamy", "maya", 654654, "jkdks", "sdhaku","iuhauid", 5946152);
//	Parent p12 = new Parent("pava", "vasanta", 46546454, "jkdks", "sdhaku","iuhauid", 632656);
//	Parent p13 = new Parent("avi", "sujaa", 65465465, "jkdks", "sdhaku","iuhauid", 54836);
//	Parent p14 = new Parent("mohas", "deepa", 65449654, "jkdks", "sdhaku","iuhauid", 356423);
//	Parent p15 = new Parent("mery", "pooree", 654603654, "jkdks", "sdhaku","iuhauid", 696162);
//	Parent p16 = new Parent("aru", "divya", 6546554, "jkdks", "sdhaku","iuhauid", 300000);
//	Parent p17 = new Parent("ggowda", "sanni", 966447614, "jkdks", "sdhaku","iuhauid", 365942);
//	Parent p18 = new Parent("mahesh", "sujaa", 65465465, "jkdks", "sdhaku","iuhauid", 564486);
//	Parent p19 = new Parent("hemath", "deepa", 65449654, "jkdks", "sdhaku","iuhauid", 696698);
//	Parent p20 = new Parent("kiru", "pooree", 654603654, "jkdks", "sdhaku","iuhauid", 396568);

//	System.out.println(p1);
//	System.out.println(p2);
//	System.out.println(p3);
//	System.out.println(p4);
//	System.out.println(p5);
//	System.out.println(p6);
//	System.out.println(p7);
//	System.out.println(p8);
//	System.out.println(p9);
//	System.out.println(p10);
//	System.out.println(s11.toString());

//	Student s1 = new Student("swamy1", "maya", 654654,"6th", 50958, p1);
//	Student s2 = new Student("swamy2", "maya", 654654,"7th", 694565, p2);
//	Student s3 = new Student("swamy3", "maya", 654654,"8th", 96855,p3);
//	Student s4 = new Student("swamy4", "maya", 654654,"6th", 259866,p4);
//	Student s5 = new Student("swamy5", "maya", 654654,"6th", 9683218,p5);
//	Student s6 = new Student("swamy6", "maya", 654654,"4th", 256341,p6);
//	Student s7 = new Student("swamy7", "maya", 654654,"6th", 596846,p7);
//	Student s8 = new Student("Soundarya", "maya", 654654,"8th", 364912 ,p8);
//	Student s9 = new Student("swamy9", "maya", 654654,"9th", 366956,p9);
//	Student s10 = new Student("Harish", "S R", 654654,"10th", 9648521,p10);
//	Student s11 = new Student("swamy11", "maya", 654654,"6th", 50958,p11);
//	Student s12 = new Student("swamy12", "maya", 654654,"7th", 694565,p12);
//	Student s13 = new Student("swamy13", "maya", 654654,"8th", 96855,p13);
//	Student s14 = new Student("swamy14", "maya", 654654,"6th", 259866,p14);
//	Student s15 = new Student("swamy15", "maya", 654654,"6th", 9683218,p15);
//	Student s16 = new Student("swamy16", "maya", 654654,"4th", 256341,p16);
//	Student s17 = new Student("swamy17", "maya", 654654,"6th", 596846,p17);
//	Student s18 = new Student("swamy18", "maya", 654644454,"8th", 364912,p18);
//	Student s19 = new Student("swamy19", "maya", 654654,"9th", 366956,p19);
//	Student s20 = new Student("Harish raj", "S R", 654654,"10th", 9648521,p20);
	
//	s1.par=p1;
//	s2.par=p2;
//	s3.par=p3;
//	s4.par=p4;
//	s5.par=p5;
//	s6.par=p6;
//	s7.par=p7;
//	s8.par=p8;
//	s9.par=p9;
//	s10.par=p10;	

	/*
	Teacher t1 = new Teacher("Bharat Bhushan" , "B.Ed", "Male", "15/06/1978", "9988305696", "Bhushanbharat30@gmail", "15/06/2009", 
			"Kannada", "9th, 10th", "Class Teacher",30100, "mysore", "Jeyasingh" ,"A primary school teacher with seven years of experience managing a "
					+ "classroom of 35-40 children. A certified child psychologist who can modify teaching plans for students "
					+ "without compromising the performance of their peers. Seeking an opportunity to educate first standard students "
					+ "in all subjects at M.N.M. School of Excellence." );

	Teacher t2 = new Teacher("Naveen Kumar" , "B.Ed", "Male", "15/06/1980", "9649722872", "Naveen74yadav@gmail.com", "15/06/2012", 
			"Kannada", "6th, 7th, 8th", "Class Teacher",30100, "mysore", "magadeera" ,"Bachelor of Arts in History\r\n"
					+ "XYZ University, Delhi, India\r\n"
					+ "Completion: 2016" );

	Teacher t3 = new Teacher("R Srinivasan" , "MA, B.Ed", "Male", "15/06/1970", "9445889560", "Srinivasan.chemi@gmail.com", "15/06/2000", 
			"Science", "10th", "Principal",70000, "Mandya", "Thimmegowda" ,"A High school teacher with seven years of experience managing a "
					+ "classroom of 50-200 children. A certified child psychologist who can modify teaching plans for students "
					+ "without compromising the performance of their peers. Seeking an opportunity to educate High School students "
					+ "in all subjects at M.N.M. School of Excellence." );


	Teacher t4 = new Teacher("Madhavi Goswami" , "B.Ed", "Female", "13/07/1982", "8860876246", "Madhavigoswami121@gmail.com", "15/06/2010", 
			"English", "9th, 10th", "Class Teacher",29550, "Bangalore", "Bahubali" ,"Highly enthusiastic Biology Teacher specialized in "
					+ "managing students and maximizing learning opportunities in diverse classroom settings. Dedicated to continuous "
					+ "professional development communication with parents accurate student assessment and providing relevant course materials "
					+ "for effective learning." );

	Teacher t5 = new Teacher("Reeja Chandran" , "MA, B.Ed", "Female", "11/03/1985", "9846740432", "Reejachandran33@gmail.com", "15/06/2011", 
			"English", "6th, 7th, 8th", "Class Teacher",29550, "Bangalore", "kattappa" ,"Dedicated, creative and multi-lingual biology teacher "
					+ "with a passion for ensuring all students experience science as an engaging and intriguing area of study. Adept "
					+ "at developing and delivering highl." );

	Teacher t6 = new Teacher("Sushma Yadav" , "MA, B.Ed", "Female", "15/06/1992", "9654692369", "Oceanvidya2127@gmail.com", "15/06/2012", 
			"Hindi", "9th, 10th", "Class Teacher",28000, "Bangalore", "Rocky bhai" ,"Dependable Biology Teacher with over 12 years of experience "
					+ "teaching in different classroom settings around the world. Polished in curriculum mapping and providing detailed lessons"
					+ " to help students " );

	Teacher t7 = new Teacher("Akashdeep" , "MA, B.Ed", "Male", "15/06/1990", "6395427756", "Akashdeep@purkal.org", "15/06/2013", 
			"Hindi", "6th, 7th, 8th", "Class Teacher",28000, "Bangalore", "ballaladeva" ,"Conscientious and flexible middle school English teacher well-versed in using social skills and empathy to manage student behavior; utilizes feedback from students to create compelling lesson plans that take into account the strengths and weaknesses of students." );

	Teacher t8 = new Teacher("Kalpesh Narendra" , "MA, B.Ed", "Male", "15/06/1991", "9766333047", "Kalpeshkothale@gmail.com", "15/06/2014", 
			"Computer Science", "9th, 10th", "Class Teacher",28500, "Bangalore", "Ram" ,"Elementary school teacher with experience "
					+ "instructing grades one, two and three, and class sizes of up to 23 students; created unique activities that "
					+ "enhanced student literacy and mathematical ability; trained a newly-hired teacher’s aide." );

	Teacher t9 = new Teacher("Sandip Sudhakarrao" , "MA, B.Ed", "Male", "15/06/1994", "9730760981", "Technosankalp@gmail.com", "15/06/2015", 
			"Computer Science", "6th, 7th, 8th", "Class Teacher",28500, "Chikkaballapura", "saaho" ,"High school chemistry teacher"
					+ " with more than three years of experience teaching high school students. Introduced standardized testing and "
					+ "state curriculum; helped 42 out of 50 students to get scores of 3 or higher on the AP Chemistry Exam." );

	Teacher t10 = new Teacher("Saritha Vijayachandran" , "MA, B.Ed", "Female", "15/06/19", "9961891618", "Saritha2014bvm@gmail.com", "15/06/2016", 
			"Social Science", "9th, 10th", "Class Teacher",31500, "Chikkaballapura", "Shiva" ,"Boston College art teacher and education "
					+ "degree graduate with more than two years of art teaching experience in Boston public schools; received a ‘Teacher "
					+ "of the Year’ award in 2018; interested in leveraging 400 hours of teaching experience to take on a new art teacher role." );

	Teacher t11 = new Teacher("Madhavankutty" , "MA, B.Ed", "Male", "15/06/1978", "9400718933", "Arjun.madhavankutty@gmail.com", "15/06/2022", 
			"Social Science", "6th, 7th, 8th", "Class Teacher",32000, "Chikkaballapura", "Kantara" ,"Excited to provide an inspiring learning"
					+ " experience to students." );

	Teacher t12 = new Teacher("Pallav Sah" , "MA, B.Ed", "Male", "15/06/1978", "9761738304", "Pallav.sah@gmail.com", "15/06/2018", 
			"Science", "8th, 9th", "Class Teacher",38000, "Chikkaballapura", "Shashthri" ,"Fluent in verbal and written English and"
					+ " Kannada. Able to use interactive whiteboards in the classroom." );

	Teacher t13 = new Teacher("Kanchan Khurana" , "MA, B.Ed", "Female", "15/06/1978", "9873063100", "Kanchan.khurana@gmail.com", "15/06/2021", 
			"Science", "6th, 7th", "Class Teacher",38000, "Mandya", "Ramachari" ,"Longtime local resident with detailed knowledge of district"
					+ " educational requirements. Actively participate in all aspects of education from parent-teacher organized activities"
					+ " to district curriculum policies." );

	Teacher t14 = new Teacher("Prasanna Kumara M" , "MA, B.Ed", "Male", "15/06/1978", "8147300337", "Prasanna.kumara@vidyashilp.com", "15/06/2020", 
			"Mathematics", "6th, 7th, 8th", "Class Teacher",37500, "Mandya", "Modi" ,"created unique activities that enhanced student literacy "
					+ "and mathematical ability; trained a newly-hired teacher’s aide." );

	Teacher t15 = new Teacher("Partha Chatterjee" , "MA, B.Ed", "Male", "15/06/1978", "9333033319", "Partha.pc23@gmail.com", "15/06/2021", 
			"Drawing", "6th, 7th, 8th, 9th", "Class Teacher",38500, "Mandya", "Amith Shaw" ,"To obtain a position as an elementary school"
					+ " teacher that will utilize my dedication to children's educational needs and development.\r\n"
					+ "To encourage creativity and higher-order thinking in a way that increases student performance." );

	Teacher t16 = new Teacher("Himani Kohli" , "MA, B.Ed", "Female", "15/06/1978", "9899704453", "Email4himani@gmail.com", "15/06/2022", 
			"Mathematics", "9th, 10th", "Class Teacher",39000, "Mandya", "Kohli" ,"To obtain a position at ABC School where I can maximize "
					+ "my high school teaching experience, training abilities, and student developmental skills.\r\n"
					+ "To obtain a teaching position that utilizes advanced teaching methods, including team learning and e-learning." );

	Teacher t17 = new Teacher("Sunny Yadav" , "MA, B.Ed", "Male", "15/06/1978", "9466022970", "Sdsmsdagar31@gmail.com", "15/06/2021", 
			"Sports", "6th, 7th, 8th, 9th, 10th", "Class Teacher",25000, "Tumkur", "Rohit" ,"To obtain a position in special education "
					+ "teaching that will allow me to use my strong passion for student development coupled with skills and experience"
					+ " that will enable me to make a difference at ABC School." );


	Teacher t18 = new Teacher("Anjali Sharma" , "MA, B.Ed", "Female", "15/06/1978", "9971009321", "Anjalisharma281077@gmail.com", "15/06/2022", 
			"Sanskrit", "9th, 10th", "Class Teacher",25000, "Tumkur", "Dhoni" ,"To build a long-term career as a middle school teacher in a "
					+ "position that offers opportunities for career growth, and to keep up with cutting-edge teaching technologies." );


	Teacher t19 = new Teacher("Ekta Soni" , "MA, B.Ed", "Female", "15/06/1978", "9811265265", "Esoni@aisv6.amity.edu", "15/06/2017", 
			"Sanskrit", "6th, 7th, 8th", "Class Teacher",25000, "Tumkur", "Rahul" ,"ompassionate, student minded high-school educator,"
					+ " with 4 years experience in teaching mathematics to teenagers in 6th to 8th grade. Certified career counselor with a background of working for non-profit organizations to offer the less privileged a chance to educate themselves. " );

	Teacher t20 = new Teacher("Chintamani " , "MA, B.Ed", "Male", "15/06/1978", "9579200467", "Ckshirodkar@outlook.com", "15/06/2022", 
			"Yoga", "6th, 7th, 8th, 9th, 10th", "Class Teacher",30000, "Tumkur", "Appu" ,"ompassionate, student minded high-school educator,"
					+ " with 4 years experience in teaching mathematics to teenagers in 6th to 8th grade. Certified career counselor with a"
					+ " background of working for non-profit organizations to offer the less privileged a chance to educate themselves. " );
	
	*/
	
		
//		Student [] student= {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20};
//		Teacher [] teacher = {t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20 };  	
//	System.out.println(s1);
//	System.out.println(s1.getPar());
//	System.out.println(s2);
//	System.out.println(s2.getPar());
//	System.out.println(s3);
//	System.out.println(s3.getPar());
//	System.out.println(s4);
//	System.out.println(s4.getPar());
//	System.out.println(s5);
//	System.out.println(s5.getPar());
//	System.out.println(s6);
//	System.out.println(s6.getPar());
//	System.out.println(s7);
//	System.out.println("Father Name of " + s7.getFirst_name() +  s7.getLast_name() + " " + "is " + s7.getPar().father_name);
//	System.out.println(s8);
//	System.out.println(s8.getPar());
//	System.out.println(s9);
//	System.out.println(s9.getPar());
//	System.out.println(s10);
//	System.out.println(s10.getPar());
//	System.out.println("Father Income of " + s10.getFirst_name() +  s10.getLast_name() + " " + "is " + s7.getPar().income);
//	getStudentFatherPh(String name )
	
//String name1 = "Soundarya";
//for (int i = 0; i < student.length; i++) {
//		
//	if (student[i].getFirst_name().equalsIgnoreCase(name1)) {
//			System.out.println( "Phone num of  "+student[i].getFirst_name()+  student[i].getLast_name()+ "'s Father is " 
//	+student[i].getPar().getPhone_no());
//		}	
//	}
//	
//System.out.println("The Total num Students in School is  "   +   student.length);
//	
//int count=0;
//for (int i = 0; i < student.length; i++) {
//	
//	if (student[i].getGrade()=="6th") {
//		count++;
//		}
//		
//	}
//System.out.println( "Total num of Students in Class 6th is  " + count);
//
//int total_income=0;
//int no_of_items=student.length;
//for (int i = 0; i < student.length; i++) {
//	int i_i = student[i].getPar().getIncome();
//	total_income=i_i+total_income;	
//}
//System.out.println( "Total income of all Student's Father is  "  + total_income);
//double average_income= (total_income/no_of_items);
//System.out.println( "The average income of all Student's Father is  "+"  is  "+average_income );



// all teachers
//for (int i = 0; i < teacher.length; i++) {
//	System.out.println(teacher[i]);
//}

//for (int i = 0; i < teacher.length; i++) {
//	System.out.println(teacher[i].getName()+ "  takes  " + teacher[i].getClass_assigned() );
//}
//for (int i = 0; i < teacher.length; i++) {
//	System.out.println(teacher[i].getName()+ "  takes  " + teacher[i].getSubjects_taken() );
//}
