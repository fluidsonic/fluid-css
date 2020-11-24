@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public external interface TransformBuilder {

	@Suppress(
		"EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
		"INLINE_EXTERNAL_DECLARATION",
		"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
		"WRONG_BODY_OF_EXTERNAL_DECLARATION"
	)
	public companion object {

		public inline fun build(action: TransformBuilder.() -> Unit): Transform =
			complete(create().apply(action))


		public inline fun complete(builder: TransformBuilder): Transform =
			if (builder.asDynamic().length == 0)
				Transform.none
			else
				Transform.unsafe(builder.asDynamic().join(" ").unsafeCast<String>())


		public inline fun create(): TransformBuilder =
			js("[]").unsafeCast<TransformBuilder>()
	}
}


@CssDsl
public inline fun TransformBuilder.add(function: String) {
	asDynamic().push(function)
}


@CssDsl
public inline fun TransformBuilder.matrix(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double) {
	add("matrix($a,$b,$c,$d,$tx,$ty)")
}

public inline fun TransformBuilder.matrix3d(
	a1: Double, b1: Double, c1: Double, d1: Double,
	a2: Double, b2: Double, c2: Double, d2: Double,
	a3: Double, b3: Double, c3: Double, d3: Double,
	a4: Double, b4: Double, c4: Double, d4: Double,
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
public inline fun TransformBuilder.rotate3d(x: Double, y: Double, z: Double, angle: Angle) {
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
public inline fun TransformBuilder.scale(xy: Double) {
	add("scale($xy)")
}


@CssDsl
public inline fun TransformBuilder.scale(x: Double, y: Double) {
	add("scale($x, $y)")
}


@CssDsl
public inline fun TransformBuilder.scale(xy: Int) {
	add("scale($xy)")
}


@CssDsl
public inline fun TransformBuilder.scale(x: Int, y: Int) {
	add("scale($x, $y)")
}


@CssDsl
public inline fun TransformBuilder.scale3d(x: Double, y: Double, z: Double) {
	add("scale3d($x,$y,$z)")
}


@CssDsl
public inline fun TransformBuilder.scale3d(x: Int, y: Int, z: Int) {
	add("scale3d($x,$y,$z)")
}


@CssDsl
public inline fun TransformBuilder.scaleX(x: Double) {
	add("scaleX($x)")
}


@CssDsl
public inline fun TransformBuilder.scaleX(x: Int) {
	add("scaleX($x)")
}


@CssDsl
public inline fun TransformBuilder.scaleY(y: Double) {
	add("scaleY($y)")
}


@CssDsl
public inline fun TransformBuilder.scaleY(y: Int) {
	add("scaleY($y)")
}


@CssDsl
public inline fun TransformBuilder.scaleZ(z: Double) {
	add("scaleZ($z)")
}


@CssDsl
public inline fun TransformBuilder.scaleZ(z: Int) {
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
