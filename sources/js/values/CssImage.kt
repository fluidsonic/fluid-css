@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CssImage :
	BackgroundImage,
	Cursor {

	public companion object {

		public fun raw(value: String): CssImage =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : CssImage, CssVariable<CssImage>
}
