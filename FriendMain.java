package 김건우;

public class FriendMain {
	public static void FriendInfo() {
		
	}
	
	public static void main(String[] args) {
		FriendInfo[] fi = new FriendInfo[6];
		
		fi[0] = new UnivFriend("홍길동","체육","1111");
		fi[1] = new UnivFriend("이순신","국방","2222");
		fi[2] = new UnivFriend("최순실","철학","3333");
		
		fi[3] = new CompFriend("김대중","총무","4444");
		fi[4] = new CompFriend("노무현","비서","5555");
		fi[5] = new CompFriend("박정희","자재","6666");
		
		for(int i=0;i<fi.length;i++) {
			fi[i].CallInfo(); 
		}
	}
}
