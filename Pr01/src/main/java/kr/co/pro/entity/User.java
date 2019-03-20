package kr.co.pro.entity;

public class User {
	String id;
	String pwd;
	String irum;
	String pNumber;
	String email;
	public User() {
	}
	
	public User(String id, String pwd, String irum, String pNumber, String email) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.irum = irum;
		this.pNumber = pNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", irum=" + irum + ", pNumber=" + pNumber + ", email=" + email + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
