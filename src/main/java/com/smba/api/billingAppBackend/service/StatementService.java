package com.smba.api.billingAppBackend.service;

import java.util.List;

import com.smba.api.billingAppBackend.model.Statements;

public interface StatementService {

	Statements saveStatements(Statements statements);
	Statements updateStatement(Statements statements);
	List<Statements> getAllStatements();
	
}
