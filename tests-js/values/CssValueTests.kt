package io.fluidsonic.css

import kotlin.test.*

class CssValueTests {

	@Test
	fun inheritValue() {
		assertEquals(actual = CssValue.inherit.asString(), expected = "inherit")
	}

	@Test
	fun initialValue() {
		assertEquals(actual = CssValue.initial.asString(), expected = "initial")
	}

	@Test
	fun unsetValue() {
		assertEquals(actual = CssValue.unset.asString(), expected = "unset")
	}

	@Test
	fun unsafeFromString() {
		val value: CssValue = CssValue.unsafe("custom-value")
		assertEquals(actual = value.asString(), expected = "custom-value")
	}

	@Test
	fun unsafeFromInt() {
		val value: CssValue = CssValue.unsafe(42)
		assertEquals(actual = value.asString(), expected = "42")
	}

	@Test
	fun eqReturnsTrueForSameValues() {
		val a: CssValue = CssValue.unsafe("hello")
		val b: CssValue = CssValue.unsafe("hello")
		assertTrue(a eq b)
	}

	@Test
	fun eqReturnsFalseForDifferentValues() {
		val a: CssValue = CssValue.unsafe("hello")
		val b: CssValue = CssValue.unsafe("world")
		assertFalse(a eq b)
	}

	@Test
	fun neReturnsTrueForDifferentValues() {
		val a: CssValue = CssValue.unsafe("hello")
		val b: CssValue = CssValue.unsafe("world")
		assertTrue(a ne b)
	}

	@Test
	fun neReturnsFalseForSameValues() {
		val a: CssValue = CssValue.unsafe("hello")
		val b: CssValue = CssValue.unsafe("hello")
		assertFalse(a ne b)
	}

	@Test
	fun coerceAtLeast() {
		assertEquals(actual = 5.px.coerceAtLeast(10.px).asString(), expected = "max(5px,10px)")
	}

	@Test
	fun coerceAtMost() {
		assertEquals(actual = 10.px.coerceAtMost(5.px).asString(), expected = "min(10px,5px)")
	}

	@Test
	fun coerceIn() {
		assertEquals(actual = 10.px.coerceIn(5.px, 20.px).asString(), expected = "max(5px,min(10px,20px))")
	}
}
