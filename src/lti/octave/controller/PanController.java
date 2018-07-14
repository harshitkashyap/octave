package lti.octave.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lti.octave.bean.AadharBean;
import lti.octave.bean.AccountBean;
import lti.octave.service.BankService;

/**
 * 
 * @author Vanita
 *
 */
@Controller
public class PanController {

	@Autowired
	private BankService service;

	/* Taking the Regristration Details from the User */
	@RequestMapping(value = "doPanRegister.bank", method = RequestMethod.POST)
	public String pan(AccountBean account, HttpSession session) {
		AadharBean aadhar = (AadharBean) session.getAttribute("Aadhar");
		account.setAadhar(aadhar);

		if (service.save(account)) {
			return "success";
		} else {
			return "pan";
		}
	}

}
