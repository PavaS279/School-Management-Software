package studets_details;

public class Teacher {
	
	private String name; 
	private String teacher_qualification;
	private String gender;
	private String date_of_birth;
	private String phone_no;
	private String email_id;
	private String date_of_joining;
	private String subjects_taken;
	private String class_assigned;
	private String designation;
	private int salary;
	private String city;
	private String father_name_or_spouse_name;
	private String teacher_bio;
	
	public Teacher() {
		super();
	}

	

	/**
	 * @param name
	 * @param teacher_qualification
	 * @param gender
	 * @param date_of_birth
	 * @param phone_no
	 * @param email_id
	 * @param date_of_joining
	 * @param subjects_taken
	 * @param class_assigned
	 * @param designation
	 * @param salary
	 * @param city
	 * @param father_name_or_spouse_name
	 * @param teacher_bio
	 */
	public Teacher(String name, String teacher_qualification, String gender, String date_of_birth, String phone_no,
			String email_id, String date_of_joining, String subjects_taken, String class_assigned, String designation,
			int salary, String city, String father_name_or_spouse_name, String teacher_bio) {
		super();
		this.name = name;
		this.teacher_qualification = teacher_qualification;
		this.gender = gender;
		this.date_of_birth = date_of_birth;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.date_of_joining = date_of_joining;
		this.subjects_taken = subjects_taken;
		this.class_assigned = class_assigned;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
		this.father_name_or_spouse_name = father_name_or_spouse_name;
		this.teacher_bio = teacher_bio;
	}



	@Override
	public String toString() {
		return "Teacher [name=" + name + ", teacher_qualification=" + teacher_qualification + ", gender=" + gender
				+ ", date_of_birth=" + date_of_birth + ", phone_no=" + phone_no + ", email_id=" + email_id
				+ ", date_of_joining=" + date_of_joining + ", subjects_taken=" + subjects_taken + ", class_assigned="
				+ class_assigned + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ ", father_name_or_spouse_name=" + father_name_or_spouse_name + ", teacher_bio=" + teacher_bio + "]";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the teacher_qualification
	 */
	public String getTeacher_qualification() {
		return teacher_qualification;
	}

	/**
	 * @param teacher_qualification the teacher_qualification to set
	 */
	public void setTeacher_qualification(String teacher_qualification) {
		this.teacher_qualification = teacher_qualification;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the date_of_birth
	 */
	public String getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * @param date_of_birth the date_of_birth to set
	 */
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	/**
	 * @return the phone_no
	 */
	public String getPhone_no() {
		return phone_no;
	}

	/**
	 * @param phone_no the phone_no to set
	 */
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	/**
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}

	/**
	 * @param email_id the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	/**
	 * @return the date_of_joining
	 */
	public String getDate_of_joining() {
		return date_of_joining;
	}

	/**
	 * @param date_of_joining the date_of_joining to set
	 */
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	/**
	 * @return the subjects_taken
	 */
	public String getSubjects_taken() {
		return subjects_taken;
	}

	/**
	 * @param subjects_taken the subjects_taken to set
	 */
	public void setSubjects_taken(String subjects_taken) {
		this.subjects_taken = subjects_taken;
	}

	/**
	 * @return the class_assigned
	 */
	public String getClass_assigned() {
		return class_assigned;
	}

	/**
	 * @param class_assigned the class_assigned to set
	 */
	public void setClass_assigned(String class_assigned) {
		this.class_assigned = class_assigned;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the father_name_or_spouse_name
	 */
	public String getFather_name_or_spouse_name() {
		return father_name_or_spouse_name;
	}

	/**
	 * @param father_name_or_spouse_name the father_name_or_spouse_name to set
	 */
	public void setFather_name_or_spouse_name(String father_name_or_spouse_name) {
		this.father_name_or_spouse_name = father_name_or_spouse_name;
	}

	/**
	 * @return the teacher_bio
	 */
	public String getTeacher_bio() {
		return teacher_bio;
	}

	/**
	 * @param teacher_bio the teacher_bio to set
	 */
	public void setTeacher_bio(String teacher_bio) {
		this.teacher_bio = teacher_bio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
