@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME support fully


public interface Content : CssValue, Internal {

	public companion object {

		@CssDsl
		public inline fun counter(name: String): Content =
			raw("counter($name)")


		public fun raw(value: String): Content =
			GenericValue(value)


		public inline fun string(value: String): Content =
			raw("'$value'") // FIXME escaping


		public fun variable(name: String): Variable =
			GenericVariable(name)
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
	get() = CssProperty("content")
