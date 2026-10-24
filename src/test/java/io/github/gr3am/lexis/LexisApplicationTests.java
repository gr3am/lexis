package io.github.gr3am.lexis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class LexisApplicationTests {

	@Test
	void contextLoads() {}
}
