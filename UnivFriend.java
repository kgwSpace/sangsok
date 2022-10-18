package 김건우;
//학교 동료 (이름, 과목, 전화번호)
public class UnivFriend extends FriendInfo{
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend() {
		this.name = null;
		this.major = null;
		this.phone = null;
	}
	
	public UnivFriend(String name,String major,String phone) {
		this.name = name;
		this.major = major;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("이름 :" + name);
		System.out.println("과목 :" + major);
		System.out.println("전번 :" + phone);
		System.out.println();
	}
	public void CallInfo() {
		showInfo();
	}
	
}
