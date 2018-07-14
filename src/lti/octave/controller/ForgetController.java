package lti.octave.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lti.octave.bean.ForgetBean;
import lti.octave.service.BankService;


/**
 * 
 * @author Ashish
 *
 */
@Controller
public class ForgetController {
	@Autowired
	private BankService service;

	private HttpSession session;

	/* Validating the Email and MobileNo exist in the Database */
	@RequestMapping(value = "forget.bank", method = RequestMethod.POST)
	public ModelAndView check(ForgetBean forget, HttpSession session) {
		ModelAndView mav = new ModelAndView();

		if (service.check(forget)) {
			session.setAttribute("forget", forget);
			mav.setViewName("newpassword");
			return mav;
		} else {
			mav.addObject("invalidPhone", "Both do not match");
			mav.setViewName("forgetpassword");
			return mav;
		}
	}

	/* Fetching the New Password for Updating in the Database */
	@RequestMapping(value = "newPasssword.bank", method = RequestMethod.POST)
	public ModelAndView reset(ForgetBean forget, @RequestParam("password") String newPassword, HttpSession session) {

		ModelAndView mav = new ModelAndView();
		forget = (ForgetBean) session.getAttribute("forget");
		service.updatePassword(newPassword, forget);
		mav.setViewName("Home");
		return mav;
	}
}
