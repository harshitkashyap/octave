package lti.octave.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "account")
@SequenceGenerator(name = "accountNo", sequenceName = "ACCOUNTSEQ")
public class AccountBean {

	/*Linking AadharBean with AccountBean using AadharNo*/
	@OneToOne
	@JoinColumn(name="aadharNo")
	private AadharBean aadhar;
	
	/*@OneToMany(cascade={CascadeType.ALL})
	  @JoinColumn(name="acnt_no")
	  private Set transactions;*/
	
	/*Auto Generated Sequence for Account Number*/
	@Id
	@Column(name = "acnt_no")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accountNo")
	private long accountNo;
	
	@Column
	private String panNo;
	
	@Column
	@NaturalId
	private String email;
	
	
	@Column
	private String password;
	
	@Column
	private double currentBalance;

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public AadharBean getAadhar() {
		return aadhar;
	}

	public void setAadhar(AadharBean aadhar) {
		this.aadhar = aadhar;
	}

	public Set getTransactions() {
		return transactions;
	}

	public void setTransactions(Set transactions) {
		this.transactions = transactions;
	}
	

}