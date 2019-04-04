package com.app.dao;

import com.app.bean.UserInfo;

public interface UserManagement {

	public UserInfo validateUser(String userName,String password);

	public boolean modifyUserInfo(UserInfo userinfo);
	
}
