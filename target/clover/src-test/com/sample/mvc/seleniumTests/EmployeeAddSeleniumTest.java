/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.seleniumTests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeAddSeleniumTest {static class __CLR3_1_122121i3k4359f{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0041\u004c\u004d\u005f\u0045\u004d\u0053\u005c\u005c\u0065\u006d\u0073\u005c\u005c\u0045\u006d\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1418301489449L,8589935092L,88,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {try{__CLR3_1_122121i3k4359f.R.inc(73);
		__CLR3_1_122121i3k4359f.R.inc(74);driver = new FirefoxDriver();
		__CLR3_1_122121i3k4359f.R.inc(75);baseUrl = "http://localhost:8090/EMS_Hibernate11/add.jsp";
		__CLR3_1_122121i3k4359f.R.inc(76);driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}finally{__CLR3_1_122121i3k4359f.R.flushNeeded();}}

	@Test
	public void testCheck() throws Exception {__CLR3_1_122121i3k4359f.R.globalSliceStart(getClass().getName(),77);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12y5602r25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122121i3k4359f.R.rethrow($CLV_t2$);}finally{__CLR3_1_122121i3k4359f.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.seleniumTests.EmployeeAddSeleniumTest.testCheck",77,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12y5602r25() throws Exception{try{__CLR3_1_122121i3k4359f.R.inc(77);
		__CLR3_1_122121i3k4359f.R.inc(78);driver.get(baseUrl + "");
	    __CLR3_1_122121i3k4359f.R.inc(79);driver.findElement(By.name("code")).clear();
	    __CLR3_1_122121i3k4359f.R.inc(80);driver.findElement(By.name("code")).sendKeys("112");
	    __CLR3_1_122121i3k4359f.R.inc(81);driver.findElement(By.name("name")).clear();
	    __CLR3_1_122121i3k4359f.R.inc(82);driver.findElement(By.name("name")).sendKeys("Rahul");
	    __CLR3_1_122121i3k4359f.R.inc(83);driver.findElement(By.name("city")).clear();
	    __CLR3_1_122121i3k4359f.R.inc(84);driver.findElement(By.name("city")).sendKeys("Pune");
	    __CLR3_1_122121i3k4359f.R.inc(85);driver.findElement(By.id("SubmitEmployee")).click();

	}finally{__CLR3_1_122121i3k4359f.R.flushNeeded();}}

	@After
	public void tearDown() throws Exception {try{__CLR3_1_122121i3k4359f.R.inc(86);
		__CLR3_1_122121i3k4359f.R.inc(87);driver.quit();

	}finally{__CLR3_1_122121i3k4359f.R.flushNeeded();}}

}
