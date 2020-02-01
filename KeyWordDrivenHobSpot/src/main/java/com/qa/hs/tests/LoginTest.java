package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;

public class LoginTest {
	public KeyWordEngine keyWordEng;
	@Test
	public void loginTest() {
		keyWordEng=new KeyWordEngine();
		keyWordEng.startExecution("login");
	}
}
