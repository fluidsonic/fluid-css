package io.fluidsonic.css


// FIXME remove
public interface AutoValue :
	Appearance,
	Cursor,
	Flex,
	HeightOrAutoOrGlobal,
	LengthOrAuto,
	Overflow,
	PercentageOrAuto,
	PointerEvents,
	TableLayout,
	TextDecorationThickness,
	UserSelect,
	WidthOrAutoOrGlobal,
	ZIndex {

	public companion object {

		public val auto: AutoValue = AutoValueImpl
	}
}


internal object AutoValueImpl : CssValueBase("auto"), AutoValue
