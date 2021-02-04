@file:Suppress(
	"INLINE_EXTERNAL_DECLARATION",
	"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
	"NOTHING_TO_INLINE",
	"WRONG_BODY_OF_EXTERNAL_DECLARATION",
)

package io.fluidsonic.css


public external interface Gap : CssValue {

	public companion object {

		@CssDsl
		public inline val normal: Gap
			get() = Axis.normal


		public inline fun of(row: Axis, column: Axis): Gap =
			unsafe("$row $column")


		public inline fun unsafe(value: String): Gap =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Axis : Gap {

		public companion object {

			@CssDsl
			public inline val normal: Axis
				get() = unsafe("normal")


			public inline fun unsafe(value: String): Axis =
				CssValue.unsafe(value)


			public inline fun variable(name: String): Variable =
				CssVariable.unsafe(name)
		}


		public interface Variable : Axis, CssVariable<Axis>
	}


	public interface Variable : Gap, CssVariable<Gap>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.columnGap(value: Gap.Axis) {
	property(columnGap, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gap(value: Gap) {
	property(gap, value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.gap(row: Gap.Axis, column: Gap.Axis) {
	gap(Gap.of(row = row, column = column))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.rowGap(value: Gap.Axis) {
	property(rowGap, value)
}


@Suppress("unused")
public inline val CssProperties.columnGap: CssProperty<Gap>
	get() = CssProperty.unsafe("column-gap")


@Suppress("unused")
public inline val CssProperties.gap: CssProperty<Gap>
	get() = CssProperty.unsafe("gap")


@Suppress("unused")
public inline val CssProperties.rowGap: CssProperty<Gap>
	get() = CssProperty.unsafe("row-gap")
