package lti.octave.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lti.octave.bean.AccountBean;
import lti.octave.bean.LoginBean;
import lti.octave.repo.PasswordDoesnotExistException;
import lti.octave.service.BankService;

/**
 * 
 * @author Pradyuman,Yash
 *
 */
@Controller
public class LoginController {

	@Autowired
	private BankService service;

	/* Validating the Email and Password for Login Purpose */
	@RequestMapping(value = "Signin.bank", method = RequestMethod.POST)
	public ModelAndView signin(LoginBean login, HttpSession session) {
		ModelAndView mav = new ModelAndView();

		/* Validating Password is Correct with Corresponding Email */
		AccountBean user = null;
		try {
			user = service.authenticate(login);

		} catch (PasswordDoesnotExistException e1) {
			e1.printStackTrace();
			mav.addObject("wrongpass", e1.getMessage());
			mav.setViewName("login");
			System.out.println("no");
			return mav;
		}

		/* Proceed if Email and Password is Correct */
		if (user != null) {
			session.setAttribute("User", user);
			mav.setViewName("profile");
			return mav;
		}

		/* Validating Email is Correct */
		else {
			mav.addObject("invalid", "Email does not exist");
			mav.setViewName("login");
			System.out.println("no");
			return mav;
		}

	}

}
