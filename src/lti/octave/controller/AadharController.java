package lti.octave.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lti.octave.bean.AadharBean;
import lti.octave.repo.AccountAlreadyExistException;
import lti.octave.service.BankService;

/**
 * 
 * @author Ashish,Pradyumna and Yash
 *
 */

@Controller
public class AadharController {

	@Autowired
	private BankService service;

	/* Validating Aadhar Number */

	@RequestMapping(value = "doAadharRegister.bank", method = RequestMethod.POST)
	public ModelAndView validate(@RequestParam("aadharNo") long aadharNo, HttpSession session) {
		ModelAndView mav = new ModelAndView();

		/* Checking if Account of Aadhar Already Exist in the Database */
		AadharBean aadhar = null;

		try {
			aadhar = service.validate(aadharNo);
		} catch (AccountAlreadyExistException e) {
			e.printStackTrace();
			mav.addObject("existing", e.getMessage());
			mav.setViewName("aadhar");
			return mav;

		}

		/* Checking Aadhar exist in the Aadhar Database */
		if (aadhar != null) {
			session.setAttribute("Aadhar", aadhar);
			mav.setViewName("register");
			return mav;
		}

		/* Aadhar does not exist in the Database */
		else {
			mav.addObject("invalid", "Aadhar No is Invalid");
			mav.setViewName("aadhar");
			return mav;
		}
	}

	/* Proceed from aadhar to Account Deatils */
	@RequestMapping(value = "Details.bank", method = RequestMethod.POST)
	public String details() {
		return "pan";
	}
}