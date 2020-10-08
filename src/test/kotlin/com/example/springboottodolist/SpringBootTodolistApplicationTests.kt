package com.example.springboottodolist

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringBootTodolistApplicationTests {

	@Test
	fun successExample() {
		assertEquals(123, 123)
	}
	
	@Test
	fun failExample() {
		assertEquals(123, 444)
	}
	
	@Test
	@DisplayName("This is a test with @DisplayName annotation")
	fun displayNameExample() {
		assertEquals(123, 123)
	}

}
