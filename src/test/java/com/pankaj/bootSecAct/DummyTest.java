package com.pankaj.bootSecAct;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class DummyTest {

	@Autowired
	WebApplicationContext wac;
	
	private MockMvc mvc;
	
	@Before
	public void setMvc() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.wac).apply(SecurityMockMvcConfigurers.springSecurity()).build();
	}
	
	@Test
//	@WithMockUser(username="pankajManual1", password="pankajManual")
	public void test() throws Exception {
		ResultActions result = this.mvc.perform(get("/"));
		System.out.println(result.andReturn().getResponse().getContentAsString());
	}

}
