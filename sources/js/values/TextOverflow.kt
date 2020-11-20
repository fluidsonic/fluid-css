@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TextOverflow : CssValue, Internal {

	public companion object {

		@CssDsl
		public val clip: Single = GenericValue("clip")

		@CssDsl
		public val ellipsis: Single = GenericValue("ellipsis")


		public fun raw(value: String): TextOverflow =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)


		public fun with(left: Single, right: Single): TextOverflow =
			raw("$left $right")
	}


	public interface Single : TextOverflow


	public interface Variable : TextOverflow, CssVariable<TextOverflow>
}


@CssDsl
public fun CssDeclarationBlockBuilder.textOverflow(value: TextOverflow) {
	property(textOverflow, value)
}


@CssDsl
public fun CssDeclarationBlockBuilder.textOverflow(left: TextOverflow.Single, right: TextOverflow.Single) {
	textOverflow(TextOverflow.with(left = left, right = right))
}


@Suppress("unused")
public val CssProperties.textOverflow: CssProperty<TextOverflow>
	get() = CssProperty("text-overflow")
