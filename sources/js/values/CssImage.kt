package io.fluidsonic.css

// FIXME support more types


public interface CssImageOrGlobal : CssValue
public interface CssImage :
	BackgroundImage,
	CssImageOrGlobal {

	public companion object {

		public fun raw(value: String): CssImage =
			Default(value)

		public fun url(value: String): CssImage =
			raw("url('$value')") // FIXME escaping
	}


	private class Default(value: String) : CssValueBase(value), CssImage
}
