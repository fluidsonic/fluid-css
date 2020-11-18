@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface TransformOrGlobal : CssValue
public interface Transform : TransformOrGlobal {

	public companion object {

		public val none: Transform = NoneValue.none
	}
}


private class TransformImpl(value: String) : CssValueImpl(value), Transform


@Suppress("FunctionName")
public fun Transform(value: String): Transform =
	TransformImpl(value)


public inline fun CssDeclarationBlockBuilder.transform(transforms: TransformBuilder.() -> Unit) {
	with(TransformBuilder.default()) {
		transforms()
		this@transform.transform(Unit.build())
	}
}


public inline fun CssDeclarationBlockBuilder.transform(value: Transform) {
	property(CssProperty.transform, value)
}


public inline fun CssDeclarationBlockBuilder.transform(value: TransformOrGlobal) {
	property(CssProperty.transform, value)
}


public inline fun CssDeclarationBlockBuilder.transform(value: GlobalValue) {
	property(CssProperty.transform, value)
}


public inline fun CssDeclarationBlockBuilder.transform(value: CustomCssProperty<out TransformOrGlobal>) {
	property(CssProperty.transform, value)
}


@CssDsl
public interface TransformBuilder {

	public fun add(function: String)

	public fun Unit.build(): Transform


	public companion object {

		public fun default(): TransformBuilder =
			Default()
	}


	private class Default : TransformBuilder {

		private var value = ""


		override fun add(function: String) {
			if (this.value.isNotEmpty())
				this.value += ","

			this.value += function
		}


		override fun Unit.build(): Transform =
			Transform(value)
	}
}


public fun TransformBuilder.matrix(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number) {
	add("matrix($a,$b,$c,$d,$tx,$ty)")
}

public fun TransformBuilder.matrix3d(
	a1: Number, b1: Number, c1: Number, d1: Number,
	a2: Number, b2: Number, c2: Number, d2: Number,
	a3: Number, b3: Number, c3: Number, d3: Number,
	a4: Number, b4: Number, c4: Number, d4: Number,
) {
	add("matrix3d($a1,$b1,$c1,$d1,$a2,$b2,$c2,$d2,$a3,$b3,$c3,$d3,$a4,$b4,$c4,$d4)")
}

public fun TransformBuilder.perspective(distance: Length) {
	add("perspective($distance)")
}

public fun TransformBuilder.rotate(xy: Angle) {
	add("rotate($xy)")
}

public fun TransformBuilder.rotate3d(x: Number, y: Number, z: Number, angle: Angle) {
	add("rotate3d($x,$y,$z,$angle)")
}

public fun TransformBuilder.rotateX(x: Angle) {
	add("rotateX($x)")
}

public fun TransformBuilder.rotateY(y: Angle) {
	add("rotateY($y)")
}

public fun TransformBuilder.rotateZ(z: Angle) {
	add("rotateZ($z)")
}

public fun TransformBuilder.scale(xy: Number) {
	add("scale($xy)")
}

public fun TransformBuilder.scale(x: Number, y: Number) {
	add("scale($x, $y)")
}

public fun TransformBuilder.scale3d(x: Number, y: Number, z: Number) {
	add("scale3d($x,$y,$z)")
}

public fun TransformBuilder.scaleX(x: Number) {
	add("scaleX($x)")
}

public fun TransformBuilder.scaleY(y: Number) {
	add("scaleY($y)")
}

public fun TransformBuilder.scaleZ(z: Number) {
	add("scaleZ($z)")
}

public fun TransformBuilder.skew(xy: Angle) {
	add("skew($xy)")
}

public fun TransformBuilder.skew(x: Angle, y: Angle) {
	add("skew($x, $y)")
}

public fun TransformBuilder.skewX(x: Angle) {
	add("skewX($x)")
}

public fun TransformBuilder.skewY(y: Angle) {
	add("skewY($y)")
}

public fun TransformBuilder.translate(xy: LengthOrPercentage) {
	add("translate($xy)")
}

public fun TransformBuilder.translate(x: LengthOrPercentage, y: LengthOrPercentage) {
	add("translate($x, $y)")
}

public fun TransformBuilder.translate3d(x: LengthOrPercentage, y: LengthOrPercentage, z: Length) {
	add("translate3d($x,$y,$z)")
}

public fun TransformBuilder.translateX(x: LengthOrPercentage) {
	add("translateX($x)")
}

public fun TransformBuilder.translateY(y: LengthOrPercentage) {
	add("translateY($y)")
}

public fun TransformBuilder.translateZ(z: LengthOrPercentage) {
	add("translateZ($z)")
}


public inline val CssProperty.Companion.transform: CssProperty get() = CssProperty("transform")
