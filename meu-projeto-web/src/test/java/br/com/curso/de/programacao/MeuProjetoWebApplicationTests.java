package br.com.curso.de.programacao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class MeuProjetoWebApplicationTests {

	private final BigDecimal myEmployeeSalary = new BigDecimal("10.00");

	@Test
	 void contextLoads() {
		System.out.println("Starting debug");
		System.out.println("The salary of a programmer is: " + myEmployeeSalary );
		System.out.println("End of debug");
	}

}
