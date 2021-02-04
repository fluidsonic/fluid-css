@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


public external interface Content : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline fun counter(name: String): Content =
			unsafe("counter($name)")


		public inline fun string(value: String): Content =
			unsafe("'$value'") // FIXME escaping


		public inline fun unsafe(value: String): Content =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Content, CssVariable<Content>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.content(value: Content) {
	property(content, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.content(value: String = "") {
	content(Content.string(value))
}


@Suppress("unused")
public inline val CssProperties.content: CssProperty<Content>
	get() = CssProperty.unsafe("content")
