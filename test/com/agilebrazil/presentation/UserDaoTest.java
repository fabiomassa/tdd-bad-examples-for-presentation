package com.agilebrazil.presentation;

import org.junit.Test;

public class UserDaoTest {

	@Test
	public void testUpdate() {

		User user = new User();
		user.setId(10L);
		user.setName("new name for user");

		new UserDao().update(user);
	}
}
