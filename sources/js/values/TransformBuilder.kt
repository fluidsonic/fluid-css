@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css

// FIXME single
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
				this.value += " "

			this.value += function
		}


		override fun Unit.build(): Transform =
			Transform.raw(value)
	}
}


@CssDsl
public inline fun TransformBuilder.matrix(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number) {
	add("matrix($a,$b,$c,$d,$tx,$ty)")
}

public inline fun TransformBuilder.matrix3d(
	a1: Number, b1: Number, c1: Number, d1: Number,
	a2: Number, b2: Number, c2: Number, d2: Number,
	a3: Number, b3: Number, c3: Number, d3: Number,
	a4: Number, b4: Number, c4: Number, d4: Number,
) {
	add("matrix3d($a1,$b1,$c1,$d1,$a2,$b2,$c2,$d2,$a3,$b3,$c3,$d3,$a4,$b4,$c4,$d4)")
}


@CssDsl
public inline fun TransformBuilder.perspective(distance: Length) {
	add("perspective($distance)")
}


@CssDsl
public inline fun TransformBuilder.rotate(xy: Angle) {
	add("rotate($xy)")
}


@CssDsl
public inline fun TransformBuilder.rotate3d(x: Number, y: Number, z: Number, angle: Angle) {
	add("rotate3d($x,$y,$z,$angle)")
}


@CssDsl
public inline fun TransformBuilder.rotateX(x: Angle) {
	add("rotateX($x)")
}


@CssDsl
public inline fun TransformBuilder.rotateY(y: Angle) {
	add("rotateY($y)")
}


@CssDsl
public inline fun TransformBuilder.rotateZ(z: Angle) {
	add("rotateZ($z)")
}


@CssDsl
public inline fun TransformBuilder.scale(xy: Number) {
	add("scale($xy)")
}


@CssDsl
public inline fun TransformBuilder.scale(x: Number, y: Number) {
	add("scale($x, $y)")
}


@CssDsl
public inline fun TransformBuilder.scale3d(x: Number, y: Number, z: Number) {
	add("scale3d($x,$y,$z)")
}


@CssDsl
public inline fun TransformBuilder.scaleX(x: Number) {
	add("scaleX($x)")
}


@CssDsl
public inline fun TransformBuilder.scaleY(y: Number) {
	add("scaleY($y)")
}


@CssDsl
public inline fun TransformBuilder.scaleZ(z: Number) {
	add("scaleZ($z)")
}


@CssDsl
public inline fun TransformBuilder.skew(xy: Angle) {
	add("skew($xy)")
}


@CssDsl
public inline fun TransformBuilder.skew(x: Angle, y: Angle) {
	add("skew($x, $y)")
}


@CssDsl
public inline fun TransformBuilder.skewX(x: Angle) {
	add("skewX($x)")
}


@CssDsl
public inline fun TransformBuilder.skewY(y: Angle) {
	add("skewY($y)")
}


@CssDsl
public inline fun TransformBuilder.translate(xy: LengthOrPercentage) {
	add("translate($xy)")
}


@CssDsl
public inline fun TransformBuilder.translate(x: LengthOrPercentage, y: LengthOrPercentage) {
	add("translate($x, $y)")
}


@CssDsl
public inline fun TransformBuilder.translate3d(x: LengthOrPercentage, y: LengthOrPercentage, z: Length) {
	add("translate3d($x,$y,$z)")
}


@CssDsl
public inline fun TransformBuilder.translateX(x: LengthOrPercentage) {
	add("translateX($x)")
}


@CssDsl
public inline fun TransformBuilder.translateY(y: LengthOrPercentage) {
	add("translateY($y)")
}


@CssDsl
public inline fun TransformBuilder.translateZ(z: LengthOrPercentage) {
	add("translateZ($z)")
}
