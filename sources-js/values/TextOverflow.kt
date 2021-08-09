@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface TextOverflow : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Single : TextOverflow {

		public companion object;


		public interface Variable : Single, CssVariable<Single>
	}


	@JsName("0;0")
	public interface Variable : TextOverflow, CssVariable<TextOverflow>
}


@CssDsl
public inline val TextOverflow.Companion.clip: TextOverflow.Single
	get() = TextOverflow.Single.unsafe("clip")

@CssDsl
public inline val TextOverflow.Companion.ellipsis: TextOverflow.Single
	get() = TextOverflow.Single.unsafe("ellipsis")


public inline fun TextOverflow.Companion.unsafe(value: String): TextOverflow =
	CssValue.unsafe(value)


public inline fun TextOverflow.Companion.variable(name: String): TextOverflow.Variable =
	CssVariable.unsafe(name)


public inline fun TextOverflow.Companion.with(left: TextOverflow.Single, right: TextOverflow.Single): TextOverflow =
	unsafe("$left $right")


public inline fun TextOverflow.Single.Companion.unsafe(value: String): TextOverflow.Single =
	CssValue.unsafe(value)


public inline fun TextOverflow.Single.Companion.variable(name: String): TextOverflow.Single.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.textOverflow(value: TextOverflow) {
	property(textOverflow, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.textOverflow(left: TextOverflow.Single, right: TextOverflow.Single) {
	textOverflow(TextOverflow.with(left = left, right = right))
}


@Suppress("unused")
public inline val CssProperties.textOverflow: CssProperty<TextOverflow>
	get() = CssProperty.unsafe("text-overflow")
