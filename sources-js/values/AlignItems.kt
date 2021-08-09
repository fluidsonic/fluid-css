@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


@JsName("0;0")
public external interface AlignItems : CssValue {

	public companion object;


	@JsName("0;0")
	public interface Variable : AlignItems, CssVariable<AlignItems>
}


@CssDsl
public inline val AlignItems.Companion.baseline: AlignItems
	get() = unsafe("baseline")

@CssDsl
public inline val AlignItems.Companion.center: AlignItems
	get() = unsafe("center")

@CssDsl
public inline val AlignItems.Companion.end: AlignItems
	get() = unsafe("end")

@CssDsl
public inline val AlignItems.Companion.firstBaseline: AlignItems
	get() = unsafe("first baseline")

@CssDsl
public inline val AlignItems.Companion.flexEnd: AlignItems
	get() = unsafe("flex-end")

@CssDsl
public inline val AlignItems.Companion.flexStart: AlignItems
	get() = unsafe("flex-start")

@CssDsl
public inline val AlignItems.Companion.lastBaseline: AlignItems
	get() = unsafe("last baseline")

@CssDsl
public inline val AlignItems.Companion.normal: AlignItems
	get() = unsafe("normal")

@CssDsl
public inline val AlignItems.Companion.selfEnd: AlignItems
	get() = unsafe("self-end")

@CssDsl
public inline val AlignItems.Companion.selfStart: AlignItems
	get() = unsafe("self-start")

@CssDsl
public inline val AlignItems.Companion.start: AlignItems
	get() = unsafe("start")

@CssDsl
public inline val AlignItems.Companion.stretch: AlignItems
	get() = unsafe("stretch")


@CssDsl
public inline val AlignItems.Companion.safeCenter: AlignItems
	get() = unsafe("safe center")

@CssDsl
public inline val AlignItems.Companion.safeEnd: AlignItems
	get() = unsafe("safe end")

@CssDsl
public inline val AlignItems.Companion.safeFlexEnd: AlignItems
	get() = unsafe("safe flex-end")

@CssDsl
public inline val AlignItems.Companion.safeFlexStart: AlignItems
	get() = unsafe("safe flex-start")

@CssDsl
public inline val AlignItems.Companion.safeSelfEnd: AlignItems
	get() = unsafe("safe self-end")

@CssDsl
public inline val AlignItems.Companion.safeSelfStart: AlignItems
	get() = unsafe("safe self-start")

@CssDsl
public inline val AlignItems.Companion.safeStart: AlignItems
	get() = unsafe("safe start")


@CssDsl
public inline val AlignItems.Companion.unsafeCenter: AlignItems
	get() = unsafe("unsafe center")

@CssDsl
public inline val AlignItems.Companion.unsafeEnd: AlignItems
	get() = unsafe("unsafe end")

@CssDsl
public inline val AlignItems.Companion.unsafeFlexEnd: AlignItems
	get() = unsafe("unsafe flex-end")

@CssDsl
public inline val AlignItems.Companion.unsafeFlexStart: AlignItems
	get() = unsafe("unsafe flex-start")

@CssDsl
public inline val AlignItems.Companion.unsafeSelfEnd: AlignItems
	get() = unsafe("unsafe self-end")

@CssDsl
public inline val AlignItems.Companion.unsafeSelfStart: AlignItems
	get() = unsafe("unsafe self-start")

@CssDsl
public inline val AlignItems.Companion.unsafeStart: AlignItems
	get() = unsafe("unsafe start")


public inline fun AlignItems.Companion.unsafe(value: String): AlignItems =
	CssValue.unsafe(value)


public inline fun AlignItems.Companion.variable(name: String): AlignItems.Variable =
	CssVariable.unsafe(name)


@CssDsl
public inline fun CssDeclarationBlockBuilder.alignItems(value: AlignItems) {
	property(alignItems, value)
}


@Suppress("unused")
public inline val CssProperties.alignItems: CssProperty<AlignItems>
	get() = CssProperty.unsafe("align-items")
