package io.github.gr3am.lexis;

import org.springframework.boot.SpringApplication;

public class TestLexisApplication {
	public static void main(String[] args) {
		SpringApplication.from(LexisApplication::main).with(TestcontainersConfiguration.class).run(args);
	}
}
