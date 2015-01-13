package com.spring.validation;

import java.text.SimpleDateFormat;
import java.util.Date;




import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.xml.internal.bind.v2.runtime.Name;


@Controller
public class SpringController {


	@RequestMapping(value = "/register.html", method = RequestMethod.GET)
	public ModelAndView Register(Model model)
	{
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Model model)
	{
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}
	

	@RequestMapping(value = "/submitregister.html", method = RequestMethod.POST)
	public ModelAndView submitregister(@Valid @ModelAttribute("student1") Student student ,BindingResult result )
	{
		if(result.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("register");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("success");
		return modelAndView;
	}


}
