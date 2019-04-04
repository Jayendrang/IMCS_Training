package com.app.services;

import java.util.HashMap;
import java.util.function.BiFunction;

import com.app.bean.UserInfo;
import com.app.dao.UserManagement;

public class UserManagementImpl implements UserManagement {

	private static HashMap<String, UserInfo> userCreds = new HashMap();

	@Override
	public UserInfo validateUser(String userName, String password) {
		UserInfo user = new UserInfo();
		if (userCreds.containsKey(userName)) {
			user = userCreds.get(userName);
		}
		return user;
	}

	@Override
	public boolean modifyUserInfo(UserInfo userinfo) {
		if (userCreds.containsKey(userinfo.getUserName())) {
			UserInfo user = userCreds.get(userinfo.getUserName());
			userCreds.remove(user.getUserName());
			userCreds.putIfAbsent(user.getUserName(), user);
			return true;
		}
		return false;
	}

}
