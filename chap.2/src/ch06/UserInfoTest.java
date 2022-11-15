package ch06;

public class UserInfoTest {
	
	public static void main(String[] args)
	{
		UserInfo userLee = new UserInfo();
		userLee.userId = "ghkfud6545";
		userLee.userPassWord = "rladuddnd1";
		userLee.userName = "±è¿µ¿õ";
		userLee.phoneNumber = "010-2791-1600";
		userLee.userAddress = "ÇÏ¾ç, °æºÏ";
		
		System.out.println(userLee.showUserInfo());
		
		
		UserInfo userKim = new UserInfo("Redbull", "123456", "±è", "´ë±¸ µÎ·ù", "010-4198-2128");
		System.out.println(userKim.showUserInfo());
	}

}
