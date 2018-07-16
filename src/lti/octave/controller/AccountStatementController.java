package lti.octave.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lti.octave.bean.AccountBean;
import lti.octave.bean.TransactionBean;
import lti.octave.service.BankService;

@Controller
public class AccountStatementController {
	
	@Autowired
	private BankService service;
	
	@RequestMapping(value = "txndetails.bank", method = RequestMethod.GET)
	public ModelAndView accountSummary(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		AccountBean user = (AccountBean) session.getAttribute("User");
		System.out.println(user);
		List<TransactionBean> summarytxn = service.getTxnDetails(user);

		if (summarytxn.size() > 0) {
			mav.setViewName("transaction");
			mav.addObject("Txn", summarytxn);
			return mav;
		} else {
			mav.setViewName("notxn");
			return mav;
		}

	}
	
	
	

}