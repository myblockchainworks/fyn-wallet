/**
 * 
 */
package com.aequalis.fyn.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.aequalis.fyn.model.TransactionLog;
import com.aequalis.fyn.repository.TransactionLogRepository;
import com.aequalis.fyn.service.TransactionLogService;

/**
 * @author anand
 *
 */
@Service
@Qualifier("transactionLogService")
@Transactional
public class TransactionLogServiceImpl implements TransactionLogService {

	@Autowired
	TransactionLogRepository transactionLogRepository;
	
	@Override
	public void addTransactionLog(TransactionLog transactionLog) {
		transactionLogRepository.saveAndFlush(transactionLog);
	}

	@Override
	public List<TransactionLog> findMyTransactions(String useraddress) {
		return transactionLogRepository.findMyTransactions(useraddress);
	}

}
