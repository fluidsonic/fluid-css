@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface BackgroundAttachment : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : BackgroundAttachment, CssVariable<BackgroundAttachment>
}


@CssDsl
public inline val BackgroundAttachment.Companion.fixed: BackgroundAttachment
	get() = unsafe("fixed")

@CssDsl
public inline val BackgroundAttachment.Companion.local: BackgroundAttachment
	get() = unsafe("local")

@CssDsl
public inline val BackgroundAttachment.Companion.scroll: BackgroundAttachment
	get() = unsafe("scroll")


public inline fun BackgroundAttachment.Companion.unsafe(value: String): BackgroundAttachment =
	CssValue.unsafe(value)


public inline fun BackgroundAttachment.Companion.variable(name: String): BackgroundAttachment.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.backgroundAttachment(value: BackgroundAttachment) {
	property(backgroundAttachment, value)
}


@Suppress("unused")
public inline val CssProperties.backgroundAttachment: CssProperty<BackgroundAttachment>
	get() = CssProperty.unsafe("background-attachment")
