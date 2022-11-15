package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;



public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into ORACLE DB userId = " + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("update into ORACLE DB userId = " + userInfo.getUserId());
	}

	@Override
	public void deleteUsesrInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("delete into ORACLE DB userId = " + userInfo.getUserId());
	}

}
