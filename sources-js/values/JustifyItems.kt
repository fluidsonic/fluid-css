@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface JustifyItems : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : JustifyItems, CssVariable<JustifyItems>
}


@CssDsl
public inline val JustifyItems.Companion.baseline: JustifyItems
	get() = unsafe("baseline")

@CssDsl
public inline val JustifyItems.Companion.center: JustifyItems
	get() = unsafe("center")

@CssDsl
public inline val JustifyItems.Companion.end: JustifyItems
	get() = unsafe("end")

@CssDsl
public inline val JustifyItems.Companion.firstBaseline: JustifyItems
	get() = unsafe("first baseline")

@CssDsl
public inline val JustifyItems.Companion.flexEnd: JustifyItems
	get() = unsafe("flex-end")

@CssDsl
public inline val JustifyItems.Companion.flexStart: JustifyItems
	get() = unsafe("flex-start")

@CssDsl
public inline val JustifyItems.Companion.lastBaseline: JustifyItems
	get() = unsafe("last baseline")

@CssDsl
public inline val JustifyItems.Companion.left: JustifyItems
	get() = unsafe("left")

@CssDsl
public inline val JustifyItems.Companion.normal: JustifyItems
	get() = unsafe("normal")

@CssDsl
public inline val JustifyItems.Companion.right: JustifyItems
	get() = unsafe("right")

@CssDsl
public inline val JustifyItems.Companion.selfEnd: JustifyItems
	get() = unsafe("self-end")

@CssDsl
public inline val JustifyItems.Companion.selfStart: JustifyItems
	get() = unsafe("self-start")

@CssDsl
public inline val JustifyItems.Companion.start: JustifyItems
	get() = unsafe("start")

@CssDsl
public inline val JustifyItems.Companion.stretch: JustifyItems
	get() = unsafe("stretch")


@CssDsl
public inline val JustifyItems.Companion.legacy: JustifyItems
	get() = unsafe("legacy")


@CssDsl
public inline val JustifyItems.Companion.legacyCenter: JustifyItems
	get() = unsafe("legacy center")


@CssDsl
public inline val JustifyItems.Companion.legacyLeft: JustifyItems
	get() = unsafe("legacy left")


@CssDsl
public inline val JustifyItems.Companion.legacyRight: JustifyItems
	get() = unsafe("legacy right")


@CssDsl
public inline val JustifyItems.Companion.safeCenter: JustifyItems
	get() = unsafe("safe center")

@CssDsl
public inline val JustifyItems.Companion.safeEnd: JustifyItems
	get() = unsafe("safe end")

@CssDsl
public inline val JustifyItems.Companion.safeFlexEnd: JustifyItems
	get() = unsafe("safe flex-end")

@CssDsl
public inline val JustifyItems.Companion.safeFlexStart: JustifyItems
	get() = unsafe("safe flex-start")

@CssDsl
public inline val JustifyItems.Companion.safeSelfEnd: JustifyItems
	get() = unsafe("safe self-end")

@CssDsl
public inline val JustifyItems.Companion.safeSelfStart: JustifyItems
	get() = unsafe("safe self-start")

@CssDsl
public inline val JustifyItems.Companion.safeStart: JustifyItems
	get() = unsafe("safe start")


@CssDsl
public inline val JustifyItems.Companion.unsafeCenter: JustifyItems
	get() = unsafe("unsafe center")

@CssDsl
public inline val JustifyItems.Companion.unsafeEnd: JustifyItems
	get() = unsafe("unsafe end")

@CssDsl
public inline val JustifyItems.Companion.unsafeFlexEnd: JustifyItems
	get() = unsafe("unsafe flex-end")

@CssDsl
public inline val JustifyItems.Companion.unsafeFlexStart: JustifyItems
	get() = unsafe("unsafe flex-start")

@CssDsl
public inline val JustifyItems.Companion.unsafeSelfEnd: JustifyItems
	get() = unsafe("unsafe self-end")

@CssDsl
public inline val JustifyItems.Companion.unsafeSelfStart: JustifyItems
	get() = unsafe("unsafe self-start")

@CssDsl
public inline val JustifyItems.Companion.unsafeStart: JustifyItems
	get() = unsafe("unsafe start")


public inline fun JustifyItems.Companion.unsafe(value: String): JustifyItems =
	CssValue.unsafe(value)


public inline fun JustifyItems.Companion.variable(name: String): JustifyItems.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.justifyItems(value: JustifyItems) {
	property(justifyItems, value)
}


@Suppress("unused")
public inline val CssProperties.justifyItems: CssProperty<JustifyItems>
	get() = CssProperty.unsafe("justify-items")
