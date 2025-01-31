package al.assu.trust.GestionImageSinistre.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
public class User implements Serializable {

	private int id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private String Phone_Number;
	private String job_title;
	private String Department;
	private String Floor;
	public String login;
	private boolean verified;
	private String emailPwd;
	private String Theme;
	private String password;
	private boolean Blocked;
	private int loginAttempts;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
		this.Theme = "null";
		this.Blocked = false;
		this.loginAttempts=5;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_Name() {
		return this.First_Name;
	}

	public void setFirst_Name(String First_Name) {
		this.First_Name = First_Name;
	}

	public String getLast_Name() {
		return this.Last_Name;
	}

	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getPhone_Number() {
		return this.Phone_Number;
	}

	public void setPhone_Number(String Phone_Number) {
		this.Phone_Number = Phone_Number;
	}

	public String getJob_title() {
		return this.job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getEmailPwd() {
		return emailPwd;
	}

	public void setEmailPwd(String emailPwd) {
		this.emailPwd = emailPwd;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public boolean isBlocked() {
		return Blocked;
	}

	public void setBlocked(boolean blocked) {
		Blocked = blocked;
	}

	public int getLoginAttempts() {
		return loginAttempts;
	}

	public void setLoginAttempts(int loginAttempts) {
		this.loginAttempts = loginAttempts;
	}

}
