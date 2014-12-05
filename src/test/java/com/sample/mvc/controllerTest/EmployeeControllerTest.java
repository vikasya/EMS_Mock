package com.sample.mvc.controllerTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.sample.mvc.init.BaseTestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes=BaseTestConfig.class)
/*@ContextConfiguration(locations = {
		 "classpath:test-context.xml",
		"classpath*:/WEB-INF/employee-servlet.xml"})
*/
@Transactional
public class EmployeeControllerTest {
	
	@Autowired
	private WebApplicationContext wac;
	
	
	/* @Mock
	 private EmployeeService employeeService;
	 
	    @InjectMocks
	    private EmployeeController employeeController;
	 */
	    private MockMvc mockMvc;
	 
	    @Before
	    public void setup() {
	 
	        // Process mock annotations
	        MockitoAnnotations.initMocks(this);
	 
	        // Setup Spring test in standalone mode
	        this.mockMvc = MockMvcBuilders.standaloneSetup(wac).build();
}
	    
	    @Test
	    public void testAddEmployee() throws Exception {
	     
	       
	     
	        this.mockMvc.perform(post("/add")
	                .param("code", "101")
	                .param("name", "mvcfirst")
	                .param("city", "mvclastname"))
	                .andExpect(status().isOk())
	                .andExpect(view().name("list"))
	                .andExpect(model().attributeExists("employeeCommand"));
	     
	    }
}
