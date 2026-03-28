package io.fluidsonic.css

import kotlin.test.*

class PercentageTests {

	@Test
	fun createsFromFactory() {
		assertEquals(actual = Percentage.of(50).asString(), expected = "50%")
		assertEquals(actual = Percentage.of(33.3).asString(), expected = "33.3%")
	}

	@Test
	fun createsFromExtension() {
		assertEquals(actual = 50.percent.asString(), expected = "50%")
		assertEquals(actual = 33.3.percent.asString(), expected = "33.3%")
	}

	@Test
	fun createsCalc() {
		assertEquals(actual = Percentage.calc("100% - 50%").asString(), expected = "calc(100% - 50%)")
	}

	@Test
	fun adds() {
		assertEquals(actual = (50.percent + 25.percent).asString(), expected = "75%")
	}

	@Test
	fun subtracts() {
		assertEquals(actual = (75.percent - 25.percent).asString(), expected = "50%")
	}

	@Test
	fun multiplies() {
		assertEquals(actual = (50.percent * 2).asString(), expected = "100%")
	}

	@Test
	fun divides() {
		assertEquals(actual = (100.percent / 2).asString(), expected = "50%")
	}

	@Test
	fun unaryMinusNegates() {
		assertEquals(actual = (-(50.percent)).asString(), expected = "-50%")
	}
}
