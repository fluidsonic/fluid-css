@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `align-items` value. */
@JsName("0;0")
public external interface AlignItems : CssValue {

	public companion object;


	/** A [AlignItems] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : AlignItems, CssVariable<AlignItems>
}


/** The CSS `baseline` align-items value. */
@CssDsl
public inline val AlignItems.Companion.baseline: AlignItems
	get() = unsafe("baseline")

/** The CSS `center` align-items value. */
@CssDsl
public inline val AlignItems.Companion.center: AlignItems
	get() = unsafe("center")

/** The CSS `end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.end: AlignItems
	get() = unsafe("end")

/** The CSS `first baseline` align-items value. */
@CssDsl
public inline val AlignItems.Companion.firstBaseline: AlignItems
	get() = unsafe("first baseline")

/** The CSS `flex-end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.flexEnd: AlignItems
	get() = unsafe("flex-end")

/** The CSS `flex-start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.flexStart: AlignItems
	get() = unsafe("flex-start")

/** The CSS `last baseline` align-items value. */
@CssDsl
public inline val AlignItems.Companion.lastBaseline: AlignItems
	get() = unsafe("last baseline")

/** The CSS `normal` align-items value. */
@CssDsl
public inline val AlignItems.Companion.normal: AlignItems
	get() = unsafe("normal")

/** The CSS `self-end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.selfEnd: AlignItems
	get() = unsafe("self-end")

/** The CSS `self-start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.selfStart: AlignItems
	get() = unsafe("self-start")

/** The CSS `start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.start: AlignItems
	get() = unsafe("start")

/** The CSS `stretch` align-items value. */
@CssDsl
public inline val AlignItems.Companion.stretch: AlignItems
	get() = unsafe("stretch")


/** The CSS `safe center` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeCenter: AlignItems
	get() = unsafe("safe center")

/** The CSS `safe end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeEnd: AlignItems
	get() = unsafe("safe end")

/** The CSS `safe flex-end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeFlexEnd: AlignItems
	get() = unsafe("safe flex-end")

/** The CSS `safe flex-start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeFlexStart: AlignItems
	get() = unsafe("safe flex-start")

/** The CSS `safe self-end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeSelfEnd: AlignItems
	get() = unsafe("safe self-end")

/** The CSS `safe self-start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeSelfStart: AlignItems
	get() = unsafe("safe self-start")

/** The CSS `safe start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.safeStart: AlignItems
	get() = unsafe("safe start")


/** The CSS `unsafe center` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeCenter: AlignItems
	get() = unsafe("unsafe center")

/** The CSS `unsafe end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeEnd: AlignItems
	get() = unsafe("unsafe end")

/** The CSS `unsafe flex-end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeFlexEnd: AlignItems
	get() = unsafe("unsafe flex-end")

/** The CSS `unsafe flex-start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeFlexStart: AlignItems
	get() = unsafe("unsafe flex-start")

/** The CSS `unsafe self-end` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeSelfEnd: AlignItems
	get() = unsafe("unsafe self-end")

/** The CSS `unsafe self-start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeSelfStart: AlignItems
	get() = unsafe("unsafe self-start")

/** The CSS `unsafe start` align-items value. */
@CssDsl
public inline val AlignItems.Companion.unsafeStart: AlignItems
	get() = unsafe("unsafe start")


/** Creates a [AlignItems] from an unchecked string [value]. */
public inline fun AlignItems.Companion.unsafe(value: String): AlignItems =
	CssValue.unsafe(value)


/** Creates a [AlignItems] backed by a CSS variable with the given [name]. */
public inline fun AlignItems.Companion.variable(name: String): AlignItems.Variable =
	CssVariable.unsafe(name)


/** Sets the `align-items` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.alignItems(value: AlignItems) {
	property(alignItems, value)
}


/** The `align-items` CSS property. */
@Suppress("unused")
public inline val CssProperties.alignItems: CssProperty<AlignItems>
	get() = CssProperty.unsafe("align-items")
