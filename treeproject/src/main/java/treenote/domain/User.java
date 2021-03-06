package treenote.domain;

import java.io.Serializable;

public class User implements Serializable {
	private int userNo;
	private String email;
	private String password;
	private String name;
	private String phone;
	private String photo;
	private String snsUser;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	

	public String getSnsUser() {
		return snsUser;
	}

	public void setSnsUser(String snsUser) {
		this.snsUser = snsUser;
	}

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", email=" + email + ", password=" + password + ", name=" + name + ", phone="
				+ phone + ", photo=" + photo + ", snsUser=" + snsUser + "]";
	}
	
	
	
}