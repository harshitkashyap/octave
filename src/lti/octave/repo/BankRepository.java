package lti.octave.repo;

import java.util.List;

import lti.octave.bean.AadharBean;
import lti.octave.bean.AccountBean;
import lti.octave.bean.ForgetBean;
import lti.octave.bean.FundTransferBean;
import lti.octave.bean.LoginBean;
import lti.octave.bean.TransactionBean;

public interface BankRepository {

	// Method to validate aadhar number
	AadharBean validate(long aadharNo) throws AccountAlreadyExistException;

	// Method to fetch user personal details
	List<AadharBean> getDetails(int aadharNo);

	// Method to save pan and email details to database
	boolean save(AccountBean account);

	// Method to validate login and password
	AccountBean validate(LoginBean login) throws PasswordDoesnotExistException;

	// Method to check email and mobileNo from database
	boolean check(ForgetBean forget);

	// Method to Update Password
	void upadatePassword(String newPassword, ForgetBean forget);

	void depositAmount(FundTransferBean fund) throws InvalidAccountException;

	void withdrawAmount(FundTransferBean fund, long acntNo) throws BalanceException;

	// Method to fetch details
	List<TransactionBean> fetchDetails(AccountBean user);
	
	AadharBean getUserDetails(AccountBean user);
}
