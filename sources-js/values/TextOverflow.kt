@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `text-overflow` value. */
@JsName("0;0")
public external interface TextOverflow : CssValue {

	public companion object;


	/** A single `text-overflow` value. */
	@JsName("0;0")
	public interface Single : TextOverflow {

		public companion object;


		/** A [Single] backed by a [CssVariable]. */
		public interface Variable : Single, CssVariable<Single>
	}


	/** A [TextOverflow] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : TextOverflow, CssVariable<TextOverflow>
}


/** The CSS `clip` text-overflow value. */
@CssDsl
public inline val TextOverflow.Companion.clip: TextOverflow.Single
	get() = TextOverflow.Single.unsafe("clip")

/** The CSS `ellipsis` text-overflow value. */
@CssDsl
public inline val TextOverflow.Companion.ellipsis: TextOverflow.Single
	get() = TextOverflow.Single.unsafe("ellipsis")


/** Creates a [TextOverflow] from an unchecked string [value]. */
public inline fun TextOverflow.Companion.unsafe(value: String): TextOverflow =
	CssValue.unsafe(value)


/** Creates a [TextOverflow] backed by a CSS variable with the given [name]. */
public inline fun TextOverflow.Companion.variable(name: String): TextOverflow.Variable =
	CssVariable.unsafe(name)


/** Creates a [TextOverflow] shorthand value. */
public inline fun TextOverflow.Companion.with(left: TextOverflow.Single, right: TextOverflow.Single): TextOverflow =
	unsafe("$left $right")


/** Creates a [Single] from an unchecked string [value]. */
public inline fun TextOverflow.Single.Companion.unsafe(value: String): TextOverflow.Single =
	CssValue.unsafe(value)


/** Creates a [Single] backed by a CSS variable with the given [name]. */
public inline fun TextOverflow.Single.Companion.variable(name: String): TextOverflow.Single.Variable =
	CssVariable.unsafe(name)


/** Sets the `text-overflow` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textOverflow(value: TextOverflow) {
	property(textOverflow, value)
}


/** Sets the `text-overflow` CSS property with individual side values. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.textOverflow(left: TextOverflow.Single, right: TextOverflow.Single) {
	textOverflow(TextOverflow.with(left = left, right = right))
}


/** The `text-overflow` CSS property. */
@Suppress("unused")
public inline val CssProperties.textOverflow: CssProperty<TextOverflow>
	get() = CssProperty.unsafe("text-overflow")
