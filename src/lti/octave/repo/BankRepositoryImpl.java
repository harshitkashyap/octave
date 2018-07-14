package lti.octave.repo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lti.octave.bean.AadharBean;
import lti.octave.bean.AccountBean;
import lti.octave.bean.ForgetBean;
import lti.octave.bean.LoginBean;

/**
 * 
 * @author Ashish,Yash,Pradyuman,Vanita
 *
 */

@Repository
public class BankRepositoryImpl implements BankRepository {

	@Autowired
	private SessionFactory factory;

	@Override
	public AadharBean validate(long aadharNo) throws AccountAlreadyExistException {
		Session session = factory.openSession();

		/* Checking if the aadhar number is a valid aadhar number */
		String sql = "select acnt_no from account where aadharNo=" + aadharNo;
		SQLQuery query = session.createSQLQuery(sql);

		/* Validating Aadhar Number with the help of Exception Handling */
		if (query.uniqueResult() != null) {
			throw new AccountAlreadyExistException("Existing account found with same aadhar");
		} else {
			AadharBean aadharBean = (AadharBean) session.get(AadharBean.class, aadharNo);

			if (aadharBean != null) {

				return aadharBean;
			} else
				return null;
		}
	}

	/* Getting User Details from Aadhar Table */
	@Override
	public List<AadharBean> getDetails(int aadharNo) {
		String hql = "from AadharBean where aadharNo = :id";
		Session session = factory.openSession();
		AadharBean register = (AadharBean) session.get(AadharBean.class, aadharNo);

		Query query = session.createQuery(hql);
		query.setParameter("id", register.getAadharNo());
		return null;
	}

	/* Storing Registration Details in the Database */
	@Override
	public boolean save(AccountBean account) {

		Session session = factory.openSession();
		Transaction txn = session.getTransaction();

		try {
			txn.begin();
			session.save(account);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		}
	}

	/*
	 * Validating Email and Password during Login Process with the help of Exception
	 * Handling
	 */
	@Override
	public AccountBean validate(LoginBean login) throws PasswordDoesnotExistException {
		Session session = factory.openSession();

		AccountBean user = (AccountBean) session.bySimpleNaturalId(AccountBean.class).load(login.getEmail());
		if (user != null && user.getPassword().equals(login.getPassword())) {
			return user;
		}

		else if (user != null && user.getPassword() != login.getPassword()) {
			throw new PasswordDoesnotExistException("Incorrect password, Please try again!!!");
		} else {
			return null;
		}
	}

	/* Validating Email and MobileNo during ForgetPassword Process */
	@Override
	public boolean check(ForgetBean forget) {

		Session session = factory.openSession();

		System.out.println("readched repo");
		List<Object> list = session.createSQLQuery(
				"SELECT account.email FROM account	INNER JOIN aadhar ON account.aadharNo = aadhar.aadharNo	WHERE email = '"
						+ forget.getEmail() + "' AND mobileNo = " + forget.getMobileNo())
				.list();
		if (list.size() != 0) {

			System.out.println("true repo");
			return true;
		} else {
			System.out.println("false repo");
			return false;
		}
	}

	/* Updating New Password in the Database */
	@Override
	public void upadatePassword(String newPassword, ForgetBean forget) {
		Session session = factory.openSession();
		Transaction txn = session.getTransaction();

		String sql = "UPDATE account SET password = '" + newPassword + "' WHERE email='" + forget.getEmail() + "'";

		SQLQuery query = session.createSQLQuery(sql);
		query.executeUpdate();

	}

}
