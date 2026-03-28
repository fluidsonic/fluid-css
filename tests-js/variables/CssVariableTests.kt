package io.fluidsonic.css

import kotlin.test.*

class CssVariableTests {

	@Test
	fun createsFromUnsafe() {
		val variable = CssVariable.unsafe<Color, Color.Variable>("myColor")
		assertEquals(actual = variable.asString(), expected = "var(--myColor)")
	}

	@Test
	fun extractsName() {
		val variable = CssVariable.unsafe<Color, Color.Variable>("myColor")
		assertEquals(actual = variable.name, expected = "myColor")
	}

	@Test
	fun extractsPropertyName() {
		val variable = CssVariable.unsafe<Color, Color.Variable>("myColor")
		assertEquals(actual = variable.propertyName, expected = "--myColor")
	}

	@Test
	fun withDefaultsAppendsValues() {
		val variable = CssVariable.unsafe<Length, Length.Variable>("spacing")
		val withDefault = variable.withDefaults(10.px)
		assertEquals(actual = withDefault.asString(), expected = "var(--spacing,10px)")
	}

	@Test
	fun withDefaultsMultipleValues() {
		val variable = CssVariable.unsafe<Length, Length.Variable>("spacing")
		val withDefaults = variable.withDefaults(10.px, 20.px)
		assertEquals(actual = withDefaults.asString(), expected = "var(--spacing,10px,20px)")
	}

	@Test
	fun withDefaultsEmptyReturnsThis() {
		val variable = CssVariable.unsafe<Length, Length.Variable>("spacing")
		assertSame(actual = variable.withDefaults(), expected = variable)
	}
}
