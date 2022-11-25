package com.smba.api.billingAppBackend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smba.api.billingAppBackend.model.Statements;
import com.smba.api.billingAppBackend.repository.StatementsRepository;
import com.smba.api.billingAppBackend.service.StatementService;

@Service
public class StatementServiceImpl implements StatementService {

	
private StatementsRepository statementsRepository;
	
	public StatementServiceImpl(StatementsRepository statementsRepository) {
		super();
		this.statementsRepository= statementsRepository;
	}
	
	@Override
	public Statements saveStatements(Statements statements) {
		return statementsRepository.save(statements);
	}

	@Override
	public Statements updateStatement(Statements statements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Statements> getAllStatements() {
		return statementsRepository.findAll();
	}

}
