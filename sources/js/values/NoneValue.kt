package io.fluidsonic.css


// FIXME remove
public interface NoneValue :
	Appearance,
	BackgroundImage,
	Border,
	BorderStyle,
	BoxShadow,
	CounterIncrement,
	CounterReset,
	Cursor,
	Display,
	Flex,
	ListStyleType,
	PointerEvents,
	Resize,
	TextDecoration,
	TextDecorationLine,
	Transform,
	UserSelect,
	WidthOrNoneOrGlobal {

	public companion object {

		public val none: NoneValue = NoneValueImpl
	}
}


internal object NoneValueImpl : CssValueImpl("none"), NoneValue
