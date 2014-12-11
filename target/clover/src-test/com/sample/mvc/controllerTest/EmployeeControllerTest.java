/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controllerTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.sample.mvc.controller.EmployeeController;
import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration(classes=BaseTestConfig.class)
@ContextConfiguration(locations = {"classpath*:/WEB-INF/employee-servlet.xml"})

//@Transactional
public class EmployeeControllerTest {static class __CLR3_1_121k1ki3k43583{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0041\u004c\u004d\u005f\u0045\u004d\u0053\u005c\u005c\u0065\u006d\u0073\u005c\u005c\u0045\u006d\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1418301489449L,8589935092L,67,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	
//	@Autowired
//	private WebApplicationContext wac;
	
	
	 @Mock
	 private EmployeeService employeeService;
	    @InjectMocks
	    private EmployeeController employeeController;
	 
	    private MockMvc mockMvc;
	 
	    @Before
	    public void setup() {try{__CLR3_1_121k1ki3k43583.R.inc(56);
	 
	        // Process mock annotations
	        __CLR3_1_121k1ki3k43583.R.inc(57);MockitoAnnotations.initMocks(this);
	 
	        // Setup Spring test in standalone mode
	        __CLR3_1_121k1ki3k43583.R.inc(58);this.mockMvc = MockMvcBuilders.standaloneSetup(employeeController).build();
}finally{__CLR3_1_121k1ki3k43583.R.flushNeeded();}}
	    
	    @Test
	    public void testAddEmployee() throws Exception {__CLR3_1_121k1ki3k43583.R.globalSliceStart(getClass().getName(),59);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_126ln4mc1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_121k1ki3k43583.R.rethrow($CLV_t2$);}finally{__CLR3_1_121k1ki3k43583.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controllerTest.EmployeeControllerTest.testAddEmployee",59,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_126ln4mc1n() throws Exception{try{__CLR3_1_121k1ki3k43583.R.inc(59);
	     
	    	     
	        __CLR3_1_121k1ki3k43583.R.inc(60);this.mockMvc.perform(post("/add")
	                .param("code", "101")
	                .param("name", "mvcfirst")
	                .param("city", "mvclastname"))
	                .andExpect(view().name("redirect:list"))
	                .andExpect(model().attributeExists("employeeCommand"));
	     
	    }finally{__CLR3_1_121k1ki3k43583.R.flushNeeded();}}
	    
	    @Test
		public void findById()
				throws Exception {__CLR3_1_121k1ki3k43583.R.globalSliceStart(getClass().getName(),61);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12mmo6i61p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_121k1ki3k43583.R.rethrow($CLV_t2$);}finally{__CLR3_1_121k1ki3k43583.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controllerTest.EmployeeControllerTest.findById",61,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12mmo6i61p() throws Exception{try{__CLR3_1_121k1ki3k43583.R.inc(61);
	    	
	    	 __CLR3_1_121k1ki3k43583.R.inc(62);EmployeeCommand emp = new EmployeeCommand();
	    	 __CLR3_1_121k1ki3k43583.R.inc(63);emp.setCode(105);
            __CLR3_1_121k1ki3k43583.R.inc(64);emp.setName("vikas");
            __CLR3_1_121k1ki3k43583.R.inc(65);emp.setCity("pune");
			

			__CLR3_1_121k1ki3k43583.R.inc(66);this.mockMvc
					.perform(post("/edit/{code}", 105))
					.andExpect(view().name("edit"))
					.andExpect(forwardedUrl("edit"))
					.andExpect(model().attribute("employee",  105 /*hasProperty("code", is(105))*/))
					;

			
		}finally{__CLR3_1_121k1ki3k43583.R.flushNeeded();}}
}
