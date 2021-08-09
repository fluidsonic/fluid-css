@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface JustifyContent : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : JustifyContent, CssVariable<JustifyContent>
}


@CssDsl
public inline val JustifyContent.Companion.center: JustifyContent
	get() = unsafe("center")

@CssDsl
public inline val JustifyContent.Companion.flexEnd: JustifyContent
	get() = unsafe("flex-end")

@CssDsl
public inline val JustifyContent.Companion.flexStart: JustifyContent
	get() = unsafe("flex-start")

@CssDsl
public inline val JustifyContent.Companion.end: JustifyContent
	get() = unsafe("end")

@CssDsl
public inline val JustifyContent.Companion.left: JustifyContent
	get() = unsafe("left")

@CssDsl
public inline val JustifyContent.Companion.right: JustifyContent
	get() = unsafe("right")

@CssDsl
public inline val JustifyContent.Companion.normal: JustifyContent
	get() = unsafe("normal")

@CssDsl
public inline val JustifyContent.Companion.spaceAround: JustifyContent
	get() = unsafe("space-around")

@CssDsl
public inline val JustifyContent.Companion.spaceBetween: JustifyContent
	get() = unsafe("space-between")

@CssDsl
public inline val JustifyContent.Companion.spaceEvenly: JustifyContent
	get() = unsafe("space-evenly")

@CssDsl
public inline val JustifyContent.Companion.start: JustifyContent
	get() = unsafe("start")

@CssDsl
public inline val JustifyContent.Companion.stretch: JustifyContent
	get() = unsafe("stretch")


@CssDsl
public inline val JustifyContent.Companion.safeCenter: JustifyContent
	get() = unsafe("safe center")

@CssDsl
public inline val JustifyContent.Companion.safeEnd: JustifyContent
	get() = unsafe("safe end")

@CssDsl
public inline val JustifyContent.Companion.safeLeft: JustifyContent
	get() = unsafe("safe left")

@CssDsl
public inline val JustifyContent.Companion.safeFlexEnd: JustifyContent
	get() = unsafe("safe flex-end")

@CssDsl
public inline val JustifyContent.Companion.safeFlexStart: JustifyContent
	get() = unsafe("safe flex-start")

@CssDsl
public inline val JustifyContent.Companion.safeRight: JustifyContent
	get() = unsafe("safe right")

@CssDsl
public inline val JustifyContent.Companion.safeStart: JustifyContent
	get() = unsafe("safe start")


@CssDsl
public inline val JustifyContent.Companion.unsafeCenter: JustifyContent
	get() = unsafe("unsafe center")

@CssDsl
public inline val JustifyContent.Companion.unsafeEnd: JustifyContent
	get() = unsafe("unsafe end")

@CssDsl
public inline val JustifyContent.Companion.unsafeLeft: JustifyContent
	get() = unsafe("unsafe left")

@CssDsl
public inline val JustifyContent.Companion.unsafeFlexEnd: JustifyContent
	get() = unsafe("unsafe flex-end")

@CssDsl
public inline val JustifyContent.Companion.unsafeFlexStart: JustifyContent
	get() = unsafe("unsafe flex-start")

@CssDsl
public inline val JustifyContent.Companion.unsafeRight: JustifyContent
	get() = unsafe("unsafe right")

@CssDsl
public inline val JustifyContent.Companion.unsafeStart: JustifyContent
	get() = unsafe("unsafe start")


public inline fun JustifyContent.Companion.unsafe(value: String): JustifyContent =
	CssValue.unsafe(value)


public inline fun JustifyContent.Companion.variable(name: String): JustifyContent.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.justifyContent(value: JustifyContent) {
	property(justifyContent, value)
}


@Suppress("unused")
public inline val CssProperties.justifyContent: CssProperty<JustifyContent>
	get() = CssProperty.unsafe("justify-content")
