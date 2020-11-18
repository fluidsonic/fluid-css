@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface HeightOrAutoOrGlobal : CssValue
public interface HeightOrNoneOrGlobal : CssValue
public interface Height : HeightOrAutoOrGlobal, HeightOrNoneOrGlobal {

	public companion object {

		public val auto: AutoValue = AutoValue.auto
		public val maxContent: Height = Height("max-content")
		public val minContent: Height = Height("min-content")
		public val none: NoneValue = NoneValue.none

		public fun fitContent(height: LengthOrPercentage): Height =
			Height("fit-content($height)")
	}
}


private class HeightImpl(value: String) : CssValueBase(value), Height


@Suppress("FunctionName")
public fun Height(value: String): Height =
	HeightImpl(value)


public inline fun CssDeclarationBlockBuilder.maxHeight(value: GlobalValue) {
	property(CssProperty.maxHeight, value)
}


public inline fun CssDeclarationBlockBuilder.maxHeight(value: NoneValue) {
	property(CssProperty.maxHeight, value)
}


public inline fun CssDeclarationBlockBuilder.maxHeight(value: Height) {
	property(CssProperty.maxHeight, value)
}


public inline fun CssDeclarationBlockBuilder.maxHeight(value: HeightOrNoneOrGlobal) {
	property(CssProperty.maxHeight, value)
}


public inline fun CssDeclarationBlockBuilder.maxHeight(value: CustomCssProperty<out HeightOrNoneOrGlobal>) {
	property(CssProperty.maxHeight, value)
}


public inline fun CssDeclarationBlockBuilder.minHeight(value: GlobalValue) {
	property(CssProperty.minHeight, value)
}


public inline fun CssDeclarationBlockBuilder.minHeight(value: NoneValue) {
	property(CssProperty.minHeight, value)
}


public inline fun CssDeclarationBlockBuilder.minHeight(value: Height) {
	property(CssProperty.minHeight, value)
}


public inline fun CssDeclarationBlockBuilder.minHeight(value: HeightOrNoneOrGlobal) {
	property(CssProperty.minHeight, value)
}


public inline fun CssDeclarationBlockBuilder.minHeight(value: CustomCssProperty<out HeightOrNoneOrGlobal>) {
	property(CssProperty.minHeight, value)
}


public inline fun CssDeclarationBlockBuilder.height(value: AutoValue) {
	property(CssProperty.height, value)
}


public inline fun CssDeclarationBlockBuilder.height(value: Height) {
	property(CssProperty.height, value)
}


public inline fun CssDeclarationBlockBuilder.height(value: HeightOrAutoOrGlobal) {
	property(CssProperty.height, value)
}


public inline fun CssDeclarationBlockBuilder.height(value: GlobalValue) {
	property(CssProperty.height, value)
}


public inline fun CssDeclarationBlockBuilder.height(value: CustomCssProperty<out HeightOrAutoOrGlobal>) {
	property(CssProperty.height, value)
}


public inline val CssProperty.Companion.height: CssProperty get() = CssProperty("height")
public inline val CssProperty.Companion.maxHeight: CssProperty get() = CssProperty("maxHeight")
public inline val CssProperty.Companion.minHeight: CssProperty get() = CssProperty("minHeight")
