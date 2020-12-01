@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION"
)

package io.fluidsonic.css


public external interface CssMath {

	public companion object {

		@CssDsl
		public inline fun <Value : CssValue.Numeric> clamp(min: Value, value: Value, max: Value): Value =
			CssValue.Numeric.unsafe("clamp($min,$value,$max)")


		@CssDsl
		public inline fun <Value : CssValue.Numeric> max(a: Value, b: Value): Value =
			CssValue.Numeric.unsafe("max($a,$b)")


		@CssDsl
		public inline fun <Value : CssValue.Numeric> min(a: Value, b: Value): Value =
			CssValue.Numeric.unsafe("min($a,$b)")
	}
}


@CssDsl
public /* no-inline */ fun <Value : CssValue.Numeric> CssMath.Companion.max(vararg values: Value): Value =
	CssValue.Numeric.unsafe("max(${values.join()})")


@CssDsl
public /* no-inline */ fun <Value : CssValue.Numeric> CssMath.Companion.min(vararg values: Value): Value =
	CssValue.Numeric.unsafe("min(${values.join()})")
