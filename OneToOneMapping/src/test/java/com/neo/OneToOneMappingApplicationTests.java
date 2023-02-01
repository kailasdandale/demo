package com.neo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.neo.service.PersonService;

@SpringBootTest
class OneToOneMappingApplicationTests {

	@Mock
	private PersonService personService;

	@Test
	void savaUser() {

		int a[] = { 66, 34, 56, 12 };
		Arrays.sort(a);
		int[] expected = { 12, 34, 56, 66 };
		assertArrayEquals(expected, a);
	}

}
