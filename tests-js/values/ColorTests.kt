package io.fluidsonic.css

import kotlin.test.*

class ColorTests {

	@Test
	fun createsRgbFromInt() {
		assertEquals(actual = 0xFF0000.rgb.asString(), expected = "rgb(255,0,0)")
	}

	@Test
	fun createsRgbWithAlpha() {
		assertEquals(actual = 0xFF0000.rgbWithAlpha(0.5).asString(), expected = "rgba(255,0,0,0.5)")
	}

	@Test
	fun createsRgbFromComponents() {
		assertEquals(actual = Color.rgb(255, 0, 0).asString(), expected = "rgb(255,0,0)")
	}

	@Test
	fun createsRgbWithAlphaFromComponents() {
		assertEquals(actual = Color.rgb(255, 0, 0, alpha = 0.5).asString(), expected = "rgba(255,0,0,0.5)")
	}

	@Test
	fun createsHsl() {
		assertEquals(actual = Color.hsl(180.deg, 50.percent, 50.percent).asString(), expected = "hsl(180deg,50%,50%)")
	}

	@Test
	fun createsHslWithAlpha() {
		assertEquals(
			actual = Color.hsl(180.deg, 50.percent, 50.percent, alpha = 0.5).asString(),
			expected = "hsla(180deg,50%,50%,0.5)",
		)
	}

	@Test
	fun createsTransparent() {
		assertEquals(actual = Color.transparent.asString(), expected = "transparent")
	}

	@Test
	fun createsCurrentColor() {
		assertEquals(actual = Color.currentColor.asString(), expected = "currentColor")
	}

	@Test
	fun namedColorRed() {
		assertEquals(actual = Color.red.asString(), expected = "rgb(255,0,0)")
	}

	@Test
	fun namedColorBlack() {
		assertEquals(actual = Color.black.asString(), expected = "rgb(0,0,0)")
	}

	@Test
	fun namedColorWhite() {
		assertEquals(actual = Color.white.asString(), expected = "rgb(255,255,255)")
	}

	@Test
	fun withAlphaOnRgb() {
		val color = Color.rgb(100, 200, 50)
		assertEquals(actual = color.withAlpha(0.5).asString(), expected = "rgba(100,200,50,0.5)")
	}

	@Test
	fun withAlphaFullOpacityRemovesAlpha() {
		val color = Color.rgb(100, 200, 50, alpha = 0.5)
		assertEquals(actual = color.withAlpha(1.0).asString(), expected = "rgb(100,200,50)")
	}

	@Test
	fun withAlphaOnHsl() {
		val color = Color.hsl(180.deg, 50.percent, 50.percent)
		assertEquals(actual = color.withAlpha(0.5).asString(), expected = "hsla(180deg,50%,50%,0.5)")
	}
}
