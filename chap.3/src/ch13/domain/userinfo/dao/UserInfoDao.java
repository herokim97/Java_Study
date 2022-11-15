package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userInfo); //구현해야 할 기능들
	void updateUserInfo(UserInfo userInfo);
	void deleteUsesrInfo(UserInfo userInfo);
	

}
