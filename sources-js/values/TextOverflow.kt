@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface TextOverflow : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val clip: Single
			get() = Single.unsafe("clip")

		@CssDsl
		public inline val ellipsis: Single
			get() = Single.unsafe("ellipsis")


		public inline fun unsafe(value: String): TextOverflow =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)


		public inline fun with(left: Single, right: Single): TextOverflow =
			unsafe("$left $right")
	}


	public interface Single : TextOverflow {

		@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
		public companion object {

			public inline fun unsafe(value: String): Single =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Single, CssVariable<Single>
	}


	public interface Variable : TextOverflow, CssVariable<TextOverflow>
}


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
