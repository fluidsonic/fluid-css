package io.fluidsonic.css

import kotlin.test.*

class LengthTests {

	@Test
	fun createsFromFactory() {
		assertEquals(actual = Length.of(10, "px").asString(), expected = "10px")
		assertEquals(actual = Length.of(2.5, "em").asString(), expected = "2.5em")
	}

	@Test
	fun createsZero() {
		assertEquals(actual = Length.zero.asString(), expected = "0")
	}

	@Test
	fun createsCalc() {
		assertEquals(actual = Length.calc("100% - 20px").asString(), expected = "calc(100% - 20px)")
	}

	@Test
	fun createsFromUnitExtensions() {
		assertEquals(actual = 10.px.asString(), expected = "10px")
		assertEquals(actual = 2.5.em.asString(), expected = "2.5em")
		assertEquals(actual = 100.vw.asString(), expected = "100vw")
		assertEquals(actual = 50.vh.asString(), expected = "50vh")
		assertEquals(actual = 1.rem.asString(), expected = "1rem")
		assertEquals(actual = 10.cm.asString(), expected = "10cm")
		assertEquals(actual = 10.mm.asString(), expected = "10mm")
		assertEquals(actual = 1.inch.asString(), expected = "1in")
		assertEquals(actual = 12.pt.asString(), expected = "12pt")
		assertEquals(actual = 6.pc.asString(), expected = "6pc")
		assertEquals(actual = 2.ch.asString(), expected = "2ch")
		assertEquals(actual = 1.ex.asString(), expected = "1ex")
		assertEquals(actual = 10.vmin.asString(), expected = "10vmin")
		assertEquals(actual = 10.vmax.asString(), expected = "10vmax")
	}

	@Test
	fun addsSameUnit() {
		assertEquals(actual = (10.px + 5.px).asString(), expected = "15px")
	}

	@Test
	fun addsDifferentUnits() {
		assertEquals(actual = (10.px + 5.em).asString(), expected = "calc(10px + 5em)")
	}

	@Test
	fun subtractsSameUnit() {
		assertEquals(actual = (10.px - 3.px).asString(), expected = "7px")
	}

	@Test
	fun subtractsDifferentUnits() {
		assertEquals(actual = (10.px - 3.em).asString(), expected = "calc(10px - 3em)")
	}

	@Test
	fun multipliesByInt() {
		assertEquals(actual = (10.px * 2).asString(), expected = "20px")
	}

	@Test
	fun multipliesByDouble() {
		assertEquals(actual = (10.px * 2.0).asString(), expected = "20px")
	}

	@Test
	fun dividesByInt() {
		assertEquals(actual = (10.px / 2).asString(), expected = "5px")
	}

	@Test
	fun dividesByDouble() {
		assertEquals(actual = (10.px / 2.0).asString(), expected = "5px")
	}

	@Test
	fun multiplyByOneReturnsThis() {
		val length = 10.px
		assertSame(actual = length * 1, expected = length)
		assertSame(actual = length * 1.0, expected = length)
	}

	@Test
	fun divideByOneReturnsThis() {
		val length = 10.px
		assertSame(actual = length / 1, expected = length)
		assertSame(actual = length / 1.0, expected = length)
	}

	@Test
	fun multiplyZeroByOtherReturnsZero() {
		val zero = Length.of(0, "px")
		assertSame(actual = zero * 5, expected = zero)
	}

	@Test
	fun unaryPlusReturnsThis() {
		val length = 10.px
		assertSame(actual = +length, expected = length)
	}

	@Test
	fun unaryMinusNegates() {
		assertEquals(actual = (-(10.px)).asString(), expected = "-10px")
	}

	@Test
	fun intTimesLength() {
		assertEquals(actual = (2 * 10.px).asString(), expected = "20px")
	}

	@Test
	fun doubleTimesLength() {
		assertEquals(actual = (2.0 * 10.px).asString(), expected = "20px")
	}

	@Test
	fun nonNumericMultiplyFallsBackToCalc() {
		val calcLength = Length.calc("100% - 20px")
		assertEquals(actual = (calcLength * 2).asString(), expected = "calc(calc(100% - 20px) * 2)")
	}

	@Test
	fun nonNumericDivideFallsBackToCalc() {
		val calcLength = Length.calc("100% - 20px")
		assertEquals(actual = (calcLength / 2).asString(), expected = "calc(calc(100% - 20px) / 2)")
	}
}
