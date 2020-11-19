package io.fluidsonic.css


@Suppress("INCONSISTENT_TYPE_PARAMETER_VALUES")
internal class GenericVariable(override val name: String) :
	CssVariable<CssValue>,
	AlignItems.Variable,
	AnimationIterationCount.Variable,
	AnimationName.Variable,
	AnimationPlayState.Variable,
	Angle.Variable,
	Appearance.Variable,
	Background.Variable,
	BackgroundAttachment.Variable,
	BackgroundClip.Variable,
	BackgroundImage.Variable,
	BackgroundOrigin.Variable,
	BackgroundPosition.Variable,
	BackgroundPositionX.Variable,
	BackgroundPositionY.Variable,
	BackgroundRepeat.Variable,
	BackgroundSize.Variable,
	Border.Variable,
	BorderCollapse.Variable,
	BorderColor.Variable,
	BorderRadius.Variable,
	BorderStyle.Variable,
	BorderWidth.Variable,
	BoxOffset.Variable,
	BoxShadow.Variable,
	BoxSizing.Variable,
	CaretColor.Variable,
	Color.Variable,
	Content.Variable,
	CounterIncrement.Variable,
	CounterReset.Variable,
	CssImage.Variable,
	CssUrl.Variable,
	Cursor.Variable,
	Display.Variable,
	Flex.Variable,
	FlexBasis.Variable,
	FlexDirection.Variable,
	FlexGrow.Variable,
	FlexShrink.Variable,
	FontFamily.Variable,
	FontSize.Variable,
	FontStyle.Variable,
	FontVariantNumeric.Variable,
	FontWeight.Variable,
	GridArea.Variable,
	GridTemplate.Variable,
	GridTemplateRows.Variable,
	JustifyContent.Variable,
	Length.Variable,
	LengthOrPercentage.Variable,
	LineHeight.Variable,
	ListStyleType.Variable,
	Margin.Variable,
	Opacity.Variable,
	Outline.Variable,
	OutlineColor.Variable,
	OutlineStyle.Variable,
	OutlineWidth.Variable,
	Overflow.Variable,
	Padding.Variable,
	Percentage.Variable,
	PointerEvents.Variable,
	Position.Variable,
	Resize.Variable,
	Size.Variable,
	SizeLimit.Variable,
	StrokeWidth.Variable,
	TableLayout.Variable,
	TextAlign.Variable,
	TextDecoration.Variable,
	TextDecorationLine.Variable,
	TextDecorationStyle.Variable,
	TextDecorationThickness.Variable,
	TextOverflow.Variable,
	TextRendering.Variable,
	Time.Variable,
	TimingFunction.Variable,
	Transform.Variable,
	TransformOrigin.Variable,
	Transition.Variable,
	UserSelect.Variable,
	VerticalAlign.Variable,
	Visibility.Variable,
	WhiteSpace.Variable,
	ZIndex.Variable {

	init {
		require(name.isNotBlank()) { "CSS variable name must not be empty or blank." }
	}


	val value = "var(--$name)"


	override fun equals(other: Any?) =
		other === this || (other is CssValue && value == other.toString())


	override fun hashCode() =
		value.hashCode()


	override fun toString() =
		value
}
