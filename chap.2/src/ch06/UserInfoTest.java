package ch06;

public class UserInfoTest {
	
	public static void main(String[] args)
	{
		UserInfo userLee = new UserInfo();
		userLee.userId = "ghkfud6545";
		userLee.userPassWord = "rladuddnd1";
		userLee.userName = "�迵��";
		userLee.phoneNumber = "010-2791-1600";
		userLee.userAddress = "�Ͼ�, ���";
		
		System.out.println(userLee.showUserInfo());
		
		
		UserInfo userKim = new UserInfo("Redbull", "123456", "��", "�뱸 �η�", "010-4198-2128");
		System.out.println(userKim.showUserInfo());
	}

}
