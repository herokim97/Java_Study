package ch06;

public class UserInfo {
	
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {}
	
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber)
	{
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
		
		
		
	}
	public String showUserInfo()
	{
		return "������ ���̵��" + userId + "�̰�, ��ϵ� �̸��� "+ userName + "�Դϴ�. ���� ��ȭ��ȣ��" + phoneNumber + "�̰� �ּҴ� " + userAddress + "�Դϴ�.";
	}
	

}
