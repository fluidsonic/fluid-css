package io.fluidsonic.css

import kotlin.test.*

class TimeTests {

	@Test
	fun createsFromFactory() {
		assertEquals(actual = Time.of(300, "ms").asString(), expected = "300ms")
		assertEquals(actual = Time.of(1.5, "s").asString(), expected = "1.5s")
	}

	@Test
	fun createsZero() {
		assertEquals(actual = Time.zero.asString(), expected = "0")
	}

	@Test
	fun createsFromUnitExtensions() {
		assertEquals(actual = 300.ms.asString(), expected = "300ms")
		assertEquals(actual = 1.s.asString(), expected = "1s")
		assertEquals(actual = 0.5.s.asString(), expected = "0.5s")
		assertEquals(actual = 200.0.ms.asString(), expected = "200ms")
	}

	@Test
	fun addsSameUnit() {
		assertEquals(actual = (300.ms + 200.ms).asString(), expected = "500ms")
	}

	@Test
	fun addsDifferentUnits() {
		assertEquals(actual = (1.s + 500.ms).asString(), expected = "calc(1s + 500ms)")
	}

	@Test
	fun subtractsSameUnit() {
		assertEquals(actual = (500.ms - 200.ms).asString(), expected = "300ms")
	}

	@Test
	fun multipliesByInt() {
		assertEquals(actual = (300.ms * 2).asString(), expected = "600ms")
	}

	@Test
	fun dividesByInt() {
		assertEquals(actual = (600.ms / 2).asString(), expected = "300ms")
	}
}
