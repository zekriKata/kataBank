package com.softeam.kataBank;

import com.softeam.kataBank.model.Account;
import com.softeam.kataBank.model.Person;
import com.softeam.kataBank.service.BankService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KataBankApplicationTests {

	@Autowired
	BankService bankService;

	@Test
	void testIfDepositIsCorrect() {
		Account account = new Account(new Double(0),new Date());
		Double balance = new Double(0);
		Double amount = new Double(500);

		bankService.deposit(account,amount);
		Double newBalance=  account.getBalance();
		assertEquals(balance+ amount,newBalance);

	}
	@Test
	void testIfWithdrawalIsCorrect() {
		Account account = new Account(new Double(500),new Date());
		Double balance = new Double(500);
		Double amount = new Double(500);

		bankService.withdraw(account,amount);
		Double newBalance=  account.getBalance();
		assertEquals(balance-amount,newBalance);

	}

}
