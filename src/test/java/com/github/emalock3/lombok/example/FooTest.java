package com.github.emalock3.lombok.example;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FooTest {

	@Test
	public void testBuilder() {
		Foo expected = new Foo("abc123", "nameAAA", 1234);
		Foo foo = Foo.builder()
				.id(expected.getId())
				.name(expected.getName())
				.price(expected.getPrice())
				.build();
		assertThat(foo, is(not(nullValue())));
		assertThat(foo, is(expected));
	}

}
