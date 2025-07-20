package io.github.singhalmradul.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(Array("test"))
class DemoApplicationTests:

	@Test
	def contextLoads(): Unit =
		assert(true)
