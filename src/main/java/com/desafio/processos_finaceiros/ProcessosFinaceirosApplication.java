package com.desafio.processos_finaceiros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.desafio.processos_financeiros"})
public class ProcessosFinaceirosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessosFinaceirosApplication.class, args);
	}

}
