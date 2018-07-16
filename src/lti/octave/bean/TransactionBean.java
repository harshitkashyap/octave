package lti.octave.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "transaction")
public class TransactionBean {
	
	@ManyToOne
	@JoinColumn(name="acnt_no")
	private AccountBean account;
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int txnId;
	
	@Column
	private String type;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date txnDate;
	
	private double amount;
    private double currentBalance;
    
    public TransactionBean() {
	}
    
	public TransactionBean(String type, double amount, double currentBalance) {
		this.type = type;
		this.amount = amount;
		this.currentBalance = currentBalance;
		this.txnDate = new Date(System.currentTimeMillis());
	}
	
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
}
