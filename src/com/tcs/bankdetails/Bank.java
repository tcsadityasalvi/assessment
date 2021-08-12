package com.tcs.bankdetails;

import java.util.Date;
import java.util.Scanner;

public class Bank {
	private int accountNumber;
	private Double balance;
	private Date createDate;
	private String type;
	private String status;

	public Bank(int accountNumber, Double balance, Date createDate, String type, String status) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.createDate = createDate;
		this.type = type;
		this.status = status;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
