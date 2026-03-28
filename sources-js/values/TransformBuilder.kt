@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** DSL builder for CSS `transform` values. */
@CssDsl
@JsName("0;0")
public external interface TransformBuilder {

	public companion object;
}


/** Adds a raw transform function string. */
@CssDsl
public inline fun TransformBuilder.add(function: String) {
	asDynamic().push(function)
}


/** Applies a `matrix()` transform. */
@CssDsl
public inline fun TransformBuilder.matrix(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double) {
	add("matrix($a,$b,$c,$d,$tx,$ty)")
}

/** Applies a `matrix3d()` transform. */
public inline fun TransformBuilder.matrix3d(
	a1: Double, b1: Double, c1: Double, d1: Double,
	a2: Double, b2: Double, c2: Double, d2: Double,
	a3: Double, b3: Double, c3: Double, d3: Double,
	a4: Double, b4: Double, c4: Double, d4: Double,
) {
	add("matrix3d($a1,$b1,$c1,$d1,$a2,$b2,$c2,$d2,$a3,$b3,$c3,$d3,$a4,$b4,$c4,$d4)")
}


/** Applies a `perspective()` transform. */
@CssDsl
public inline fun TransformBuilder.perspective(distance: Length) {
	add("perspective($distance)")
}


/** Applies a `rotate()` transform. */
@CssDsl
public inline fun TransformBuilder.rotate(xy: Angle) {
	add("rotate($xy)")
}


/** Applies a `rotate3d()` transform. */
@CssDsl
public inline fun TransformBuilder.rotate3d(x: Double, y: Double, z: Double, angle: Angle) {
	add("rotate3d($x,$y,$z,$angle)")
}


/** Applies a `rotateX()` transform. */
@CssDsl
public inline fun TransformBuilder.rotateX(x: Angle) {
	add("rotateX($x)")
}


/** Applies a `rotateY()` transform. */
@CssDsl
public inline fun TransformBuilder.rotateY(y: Angle) {
	add("rotateY($y)")
}


/** Applies a `rotateZ()` transform. */
@CssDsl
public inline fun TransformBuilder.rotateZ(z: Angle) {
	add("rotateZ($z)")
}


/** Applies a `scale()` transform. */
@CssDsl
public inline fun TransformBuilder.scale(xy: Double) {
	add("scale($xy)")
}


/** Applies a `scale()` transform. */
@CssDsl
public inline fun TransformBuilder.scale(x: Double, y: Double) {
	add("scale($x,$y)")
}


/** Applies a `scale()` transform. */
@CssDsl
public inline fun TransformBuilder.scale(xy: Int) {
	add("scale($xy)")
}


/** Applies a `scale()` transform. */
@CssDsl
public inline fun TransformBuilder.scale(x: Int, y: Int) {
	add("scale($x,$y)")
}


/** Applies a `scale3d()` transform. */
@CssDsl
public inline fun TransformBuilder.scale3d(x: Double, y: Double, z: Double) {
	add("scale3d($x,$y,$z)")
}


/** Applies a `scale3d()` transform. */
@CssDsl
public inline fun TransformBuilder.scale3d(x: Int, y: Int, z: Int) {
	add("scale3d($x,$y,$z)")
}


/** Applies a `scaleX()` transform. */
@CssDsl
public inline fun TransformBuilder.scaleX(x: Double) {
	add("scaleX($x)")
}


/** Applies a `scaleX()` transform. */
@CssDsl
public inline fun TransformBuilder.scaleX(x: Int) {
	add("scaleX($x)")
}


/** Applies a `scaleY()` transform. */
@CssDsl
public inline fun TransformBuilder.scaleY(y: Double) {
	add("scaleY($y)")
}


/** Applies a `scaleY()` transform. */
@CssDsl
public inline fun TransformBuilder.scaleY(y: Int) {
	add("scaleY($y)")
}


/** Applies a `scaleZ()` transform. */
@CssDsl
public inline fun TransformBuilder.scaleZ(z: Double) {
	add("scaleZ($z)")
}


/** Applies a `scaleZ()` transform. */
@CssDsl
public inline fun TransformBuilder.scaleZ(z: Int) {
	add("scaleZ($z)")
}


/** Applies a `skew()` transform. */
@CssDsl
public inline fun TransformBuilder.skew(xy: Angle) {
	add("skew($xy)")
}


/** Applies a `skew()` transform. */
@CssDsl
public inline fun TransformBuilder.skew(x: Angle, y: Angle) {
	add("skew($x,$y)")
}


/** Applies a `skewX()` transform. */
@CssDsl
public inline fun TransformBuilder.skewX(x: Angle) {
	add("skewX($x)")
}


/** Applies a `skewY()` transform. */
@CssDsl
public inline fun TransformBuilder.skewY(y: Angle) {
	add("skewY($y)")
}


/** Applies a `translate()` transform. */
@CssDsl
public inline fun TransformBuilder.translate(x: LengthOrPercentage, y: LengthOrPercentage) {
	add("translate($x,$y)")
}


/** Applies a `translate3d()` transform. */
@CssDsl
public inline fun TransformBuilder.translate3d(x: LengthOrPercentage, y: LengthOrPercentage, z: Length) {
	add("translate3d($x,$y,$z)")
}


/** Applies a `translateX()` transform. */
@CssDsl
public inline fun TransformBuilder.translateX(x: LengthOrPercentage) {
	add("translateX($x)")
}


/** Applies a `translateY()` transform. */
@CssDsl
public inline fun TransformBuilder.translateY(y: LengthOrPercentage) {
	add("translateY($y)")
}


/** Applies a `translateZ()` transform. */
@CssDsl
public inline fun TransformBuilder.translateZ(z: LengthOrPercentage) {
	add("translateZ($z)")
}


/** Builds a [TransformBuilder] using the given builder [action]. */
public inline fun TransformBuilder.Companion.build(action: TransformBuilder.() -> Unit): Transform =
	complete(create().apply(action))


/** Completes the [TransformBuilder] builder and returns the result. */
public inline fun TransformBuilder.Companion.complete(builder: TransformBuilder): Transform =
	if (builder.asDynamic().length == 0)
		Transform.none
	else
		Transform.unsafe(builder.asDynamic().join(" ").unsafeCast<String>())


/** Creates a new [TransformBuilder] builder. */
public inline fun TransformBuilder.Companion.create(): TransformBuilder =
	js("[]").unsafeCast<TransformBuilder>()

