package io.fluidsonic.css

import kotlin.test.*

class CssSelectorTests {

	@Test
	fun createsFromUnsafe() {
		val selector = CssSelector.unsafe(".foo")
		assertEquals(actual = selector.asString(), expected = ".foo")
	}

	@Test
	fun createsComplexSelector() {
		val selector = CssSelector.unsafe("div > .foo:first-child")
		assertEquals(actual = selector.asString(), expected = "div > .foo:first-child")
	}
}
