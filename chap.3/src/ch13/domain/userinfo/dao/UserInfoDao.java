package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userInfo); //�����ؾ� �� ��ɵ�
	void updateUserInfo(UserInfo userInfo);
	void deleteUsesrInfo(UserInfo userInfo);
	

}
