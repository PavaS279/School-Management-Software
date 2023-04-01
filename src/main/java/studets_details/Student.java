package studets_details;

public class Student extends Parent{
	private int sdnt_roll_no;
	private String first_name;
	private String last_name;
	private String grade;
	private int fees;
	private String dob;
	private String gender;
	
	
	public Student() {
		super();
	}
	
	/**
	 * @param sdnt_roll_no
	 * @param first_name
	 * @param last_name
	 * @param grade
	 * @param fees
	 * @param dob
	 * @param gender
	 */
	
	public Student(int sdnt_roll_no, String first_name, String last_name, String grade, int fees, String dob,
			String gender) {
		super();
		this.sdnt_roll_no = sdnt_roll_no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.grade = grade;
		this.fees = fees;
		this.dob = dob;
		this.gender = gender;
	}


	
	@Override
	public String toString() {
		return "Student [sdnt_roll_no=" + sdnt_roll_no + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", grade=" + grade + ", fees=" + fees + ", dob=" + dob + ", gender=" + gender + "]";
	}

	/**
	 * @return the sdnt_roll_no
	 */
	public int getSdnt_roll_no() {
		return sdnt_roll_no;
	}

	/**
	 * @param sdnt_roll_no the sdnt_roll_no to set
	 */
	public void setSdnt_roll_no(int sdnt_roll_no) {
		this.sdnt_roll_no = sdnt_roll_no;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}

	/**
	 * @param fees the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
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

	

}
