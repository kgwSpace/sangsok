package 김건우;
//직장 동료 (이름, 과목, 전화번호)
public class CompFriend extends FriendInfo{
	private String name;
	private String Dept;
	private String phone;
	
	public CompFriend() {
		this.name = null;
		this.Dept = null;
		this.phone = null;
	}
	
	public CompFriend(String name,String Dept,String phone) {
		this.name = name;
		this.Dept = Dept;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void Dept(String Dept) {
		this.Dept = Dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("이름 :" + name);
		System.out.println("부서 :" + Dept);
		System.out.println("전번 :" + phone);
		System.out.println();
	}
	public void CallInfo() {
		showInfo();
	}
	
}

