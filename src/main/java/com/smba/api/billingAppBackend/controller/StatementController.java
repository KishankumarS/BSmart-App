package com.smba.api.billingAppBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smba.api.billingAppBackend.model.Statements;
import com.smba.api.billingAppBackend.repository.StatementsRepository;
import com.smba.api.billingAppBackend.service.StatementService;


@RestController
@RequestMapping("/api/statements")
public class StatementController {
	private StatementService statementService;
	
	public StatementController(StatementService statementService) {
		super();
		this.statementService = statementService;
	}
	
	@Autowired
	StatementsRepository statementsRepository;
	
	@CrossOrigin
	@PostMapping(value = "/", consumes = {"application/json"})
	public ResponseEntity<Statements> saveStatements(@RequestBody Statements statements){
		return new ResponseEntity<Statements>(statementService.saveStatements(statements), HttpStatus.CREATED);	
	}
	
	@CrossOrigin
	@GetMapping
	public List<Statements> getAllStatements(){
		return statementService.getAllStatements();
		
	}
}
