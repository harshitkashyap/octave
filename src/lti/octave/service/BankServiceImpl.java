
package lti.octave.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lti.octave.bean.AadharBean;
import lti.octave.bean.AccountBean;
import lti.octave.bean.ForgetBean;
import lti.octave.bean.LoginBean;
import lti.octave.repo.AccountAlreadyExistException;
import lti.octave.repo.BankRepository;

import lti.octave.repo.PasswordDoesnotExistException;

/**
 * @author Vanita, Ashish,Yash,Pradyuman
 *
 */
@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepository repo;

	/* Validating Aadhar Number from the Database through Exception Handling */
	@Override
	public AadharBean validate(long aadharNo) throws AccountAlreadyExistException {
		AadharBean registerUser = repo.validate(aadharNo);
		return registerUser;
	}

	/* Fetching Details from Aadhar Table */
	@Override
	public List<AadharBean> getDetails(int aadharNo) {
		return repo.getDetails(aadharNo);
	}

	/* Saving Details in the Account Table */
	@Override
	public boolean save(AccountBean account) {
		boolean flag = repo.save(account);
		return flag;
	}

	/* Validating Login Process through Exception Handling */
	@Override
	public AccountBean authenticate(LoginBean login) throws PasswordDoesnotExistException {
		AccountBean user = repo.validate(login);
		return user;
	}

	/* Updating Password in the Database */
	@Override
	public void updatePassword(String newPassword, ForgetBean forget) {
		repo.upadatePassword(newPassword, forget);
	}

	/* Checking Email and MobileNo during ForgetPassword Process */
	@Override
	public boolean check(ForgetBean forgetBean) {

		if (repo.check(forgetBean)) {
			return true;
		} else {
			return false;
		}
	}

}