package io.fluidsonic.css


public interface GlobalValue :
	AlignItemsOrGlobal,
	AnimationIterationCountOrGlobal,
	AnimationNameOrGlobal,
	AnimationPlayStateOrGlobal,
	AngleOrGlobal,
	AppearanceOrGlobal,
	BackgroundClipOrGlobal,
	BackgroundImageOrGlobal,
	BackgroundOriginOrGlobal,
	BackgroundRepeatOrGlobal,
	BorderCollapse,
	BorderOrGlobal,
	BorderStyleOrGlobal,
	BorderWidthOrGlobal,
	BoxShadowOrGlobal,
	BoxSizing,
	ColorOrGlobal,
	Content,
	CounterIncrement,
	CounterReset,
	Cursor,
	DisplayOrGlobal,
	Flex,
	FlexBasisOrGlobal,
	FlexDirectionOrGlobal,
	FlexGrowOrGlobal,
	FlexShrinkOrGlobal,
	FontFamily,
	FontSizeOrGlobal,
	FontStyleOrGlobal,
	FontWeightOrGlobal,
	GridArea,
	GridTemplate,
	GridTemplateRows,
	HeightOrAutoOrGlobal,
	HeightOrNoneOrGlobal,
	JustifyContentOrGlobal,
	LengthOrPercentageOrGlobal,
	LineHeightOrGlobal,
	ListStyleTypeOrGlobal,
	OpacityOrGlobal,
	OverflowOrGlobal,
	PointerEventsOrGlobal,
	Resize,
	TableLayout,
	TextAlignOrGlobal,
	TextDecorationOrGlobal,
	TextDecorationLineOrGlobal,
	TextDecorationStyleOrGlobal,
	TextDecorationThicknessOrGlobal,
	TextOverflow,
	TextRendering,
	TimeOrGlobal,
	TimingFunctionOrGlobal,
	TransformOrigin,
	TransitionOrGlobal,
	UserSelectOrGlobal,
	WidthOrAutoOrGlobal,
	WidthOrNoneOrGlobal,
	VerticalAlign,
	VisibilityOrGlobal,
	WhiteSpaceOrGlobal,
	ZIndexOrGlobal {

	public companion object {

		public val inherit: GlobalValue = GlobalValue("inherit")
		public val initial: GlobalValue = GlobalValue("initial")
		public val unset: GlobalValue = GlobalValue("unset")
	}
}


private class GlobalValueImpl(value: String) : CssValueImpl(value), GlobalValue


public fun GlobalValue(value: String): GlobalValue =
	GlobalValueImpl(value)
