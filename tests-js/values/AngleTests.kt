package io.fluidsonic.css

import kotlin.test.*

class AngleTests {

	@Test
	fun createsFromFactory() {
		assertEquals(actual = Angle.of(90, "deg").asString(), expected = "90deg")
		assertEquals(actual = Angle.of(1.5, "rad").asString(), expected = "1.5rad")
	}

	@Test
	fun createsZero() {
		assertEquals(actual = Angle.zero.asString(), expected = "0")
	}

	@Test
	fun createsCalc() {
		assertEquals(actual = Angle.calc("360deg - 90deg").asString(), expected = "calc(360deg - 90deg)")
	}

	@Test
	fun createsFromUnitExtensions() {
		assertEquals(actual = 90.deg.asString(), expected = "90deg")
		assertEquals(actual = 100.grad.asString(), expected = "100grad")
		assertEquals(actual = 3.14.rad.asString(), expected = "3.14rad")
		assertEquals(actual = 0.5.turn.asString(), expected = "0.5turn")
	}

	@Test
	fun addsSameUnit() {
		assertEquals(actual = (90.deg + 45.deg).asString(), expected = "135deg")
	}

	@Test
	fun addsDifferentUnits() {
		assertEquals(actual = (90.deg + 1.rad).asString(), expected = "calc(90deg + 1rad)")
	}

	@Test
	fun subtractsSameUnit() {
		assertEquals(actual = (90.deg - 45.deg).asString(), expected = "45deg")
	}

	@Test
	fun multipliesByInt() {
		assertEquals(actual = (90.deg * 2).asString(), expected = "180deg")
	}

	@Test
	fun dividesByInt() {
		assertEquals(actual = (180.deg / 2).asString(), expected = "90deg")
	}

	@Test
	fun unaryPlusReturnsThis() {
		val angle = 90.deg
		assertSame(actual = +angle, expected = angle)
	}

	@Test
	fun unaryMinusNegates() {
		assertEquals(actual = (-(90.deg)).asString(), expected = "-90deg")
	}
}
