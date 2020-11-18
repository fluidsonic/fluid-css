@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface FlexBasisOrGlobal : CssValue
public interface FlexBasis : FlexBasisOrGlobal {

	public companion object {

		public val auto: AutoValue = AutoValue.auto
		public val content: FlexBasis = FlexBasis("content")
		public val fill: FlexBasis = FlexBasis("fill")
		public val fitContent: FlexBasis = FlexBasis("fit-content")
		public val maxContent: FlexBasis = FlexBasis("max-content")
		public val minContent: FlexBasis = FlexBasis("min-content")
	}
}


private class FlexBasisImpl(value: String) : CssValueBase(value), FlexBasis


@Suppress("FunctionName")
public fun FlexBasis(value: String): FlexBasis =
	FlexBasisImpl(value)


public inline fun CssDeclarationBlockBuilder.flexBasis(value: AutoValue) {
	property(CssProperty.flexBasis, value)
}


public inline fun CssDeclarationBlockBuilder.flexBasis(value: FlexBasis) {
	property(CssProperty.flexBasis, value)
}


public inline fun CssDeclarationBlockBuilder.flexBasis(value: FlexBasisOrGlobal) {
	property(CssProperty.flexBasis, value)
}


public inline fun CssDeclarationBlockBuilder.flexBasis(value: GlobalValue) {
	property(CssProperty.flexBasis, value)
}


public inline fun CssDeclarationBlockBuilder.flexBasis(value: CustomCssProperty<out FlexBasisOrGlobal>) {
	property(CssProperty.flexBasis, value)
}


public inline val CssProperty.Companion.flexBasis: CssProperty get() = CssProperty("flex-basis")
