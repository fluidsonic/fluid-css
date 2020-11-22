package io.fluidsonic.css


public interface ColorStop {

	public companion object {

		public fun of(color: Color, position: LengthOrPercentage?): ColorStop =
			raw("$color $position")


		public fun raw(value: String): ColorStop =
			GenericValue(value)
	}
}
