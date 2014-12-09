/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.model.EmployeeCommand;
import com.sample.mvc.service.EmployeeService;

@Controller
public class EmployeeController {public static class __CLR3_1_1200i3h86b93{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0041\u004c\u004d\u005f\u0045\u004d\u0053\u005c\u005c\u0065\u006d\u0073\u005c\u005c\u0045\u006d\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1418126957073L,8589935092L,19,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String viewHome() {try{__CLR3_1_1200i3h86b93.R.inc(0);
		__CLR3_1_1200i3h86b93.R.inc(1);return "home";
	}finally{__CLR3_1_1200i3h86b93.R.flushNeeded();}}
	
	@RequestMapping("/list")
	public String listContacts(Map<String, Object> map) {try{__CLR3_1_1200i3h86b93.R.inc(2);
	    __CLR3_1_1200i3h86b93.R.inc(3);map.put("contact", new EmployeeCommand());
	    __CLR3_1_1200i3h86b93.R.inc(4);map.put("contactList", employeeService.listContact());
	    __CLR3_1_1200i3h86b93.R.inc(5);return "list";
	}finally{__CLR3_1_1200i3h86b93.R.flushNeeded();}}
	 
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addEmployee(
			@ModelAttribute EmployeeCommand employeeCommand) {try{__CLR3_1_1200i3h86b93.R.inc(6);
		__CLR3_1_1200i3h86b93.R.inc(7);employeeService.addEmployee(employeeCommand);
		__CLR3_1_1200i3h86b93.R.inc(8);return new ModelAndView("redirect:list");
	}finally{__CLR3_1_1200i3h86b93.R.flushNeeded();}}
	 
	@RequestMapping(value = "/edit/{code}")
	public String getEmployeeById(@PathVariable ("code") Integer empCode, Model model) {try{__CLR3_1_1200i3h86b93.R.inc(9);
		__CLR3_1_1200i3h86b93.R.inc(10);EmployeeCommand employee = employeeService.getEmployeebyId(empCode);
		__CLR3_1_1200i3h86b93.R.inc(11);model.addAttribute("employee", employee);
		__CLR3_1_1200i3h86b93.R.inc(12);return "edit";
	}finally{__CLR3_1_1200i3h86b93.R.flushNeeded();}}
	
	@RequestMapping(value = "/edit/update", method = RequestMethod.POST)
	public String updateEmployee(
			@ModelAttribute EmployeeCommand employeeCommand) {try{__CLR3_1_1200i3h86b93.R.inc(13);
		__CLR3_1_1200i3h86b93.R.inc(14);employeeService.updateEmployee(employeeCommand);
		__CLR3_1_1200i3h86b93.R.inc(15);return "redirect:/list";
	}finally{__CLR3_1_1200i3h86b93.R.flushNeeded();}}
	
    @RequestMapping(value = "/delete/{employeeId}")
    public String deleteEmplyee(@PathVariable ("employeeId") Integer employeeId)
    {try{__CLR3_1_1200i3h86b93.R.inc(16);
        __CLR3_1_1200i3h86b93.R.inc(17);employeeService.deleteEmployee(employeeId);
        __CLR3_1_1200i3h86b93.R.inc(18);return "redirect:/list";
    }finally{__CLR3_1_1200i3h86b93.R.flushNeeded();}}
}
