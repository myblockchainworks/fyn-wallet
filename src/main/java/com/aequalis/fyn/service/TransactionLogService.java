/**
 * 
 */
package com.aequalis.fyn.service;

import java.util.List;

import com.aequalis.fyn.model.TransactionLog;


/**
 * @author anand
 *
 */
public interface TransactionLogService {
	
	public void addTransactionLog(TransactionLog transactionLog);
	
	public List<TransactionLog> findMyTransactions(String useraddress);
}
