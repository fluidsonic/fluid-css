@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `justify-items` value. */
@JsName("0;0")
public external interface JustifyItems : CssValue {

	public companion object;


	/** A [JustifyItems] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : JustifyItems, CssVariable<JustifyItems>
}


/** The CSS `baseline` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.baseline: JustifyItems
	get() = unsafe("baseline")

/** The CSS `center` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.center: JustifyItems
	get() = unsafe("center")

/** The CSS `end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.end: JustifyItems
	get() = unsafe("end")

/** The CSS `first baseline` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.firstBaseline: JustifyItems
	get() = unsafe("first baseline")

/** The CSS `flex-end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.flexEnd: JustifyItems
	get() = unsafe("flex-end")

/** The CSS `flex-start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.flexStart: JustifyItems
	get() = unsafe("flex-start")

/** The CSS `last baseline` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.lastBaseline: JustifyItems
	get() = unsafe("last baseline")

/** The CSS `left` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.left: JustifyItems
	get() = unsafe("left")

/** The CSS `normal` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.normal: JustifyItems
	get() = unsafe("normal")

/** The CSS `right` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.right: JustifyItems
	get() = unsafe("right")

/** The CSS `self-end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.selfEnd: JustifyItems
	get() = unsafe("self-end")

/** The CSS `self-start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.selfStart: JustifyItems
	get() = unsafe("self-start")

/** The CSS `start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.start: JustifyItems
	get() = unsafe("start")

/** The CSS `stretch` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.stretch: JustifyItems
	get() = unsafe("stretch")


/** The CSS `legacy` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.legacy: JustifyItems
	get() = unsafe("legacy")


/** The CSS `legacy center` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.legacyCenter: JustifyItems
	get() = unsafe("legacy center")


/** The CSS `legacy left` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.legacyLeft: JustifyItems
	get() = unsafe("legacy left")


/** The CSS `legacy right` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.legacyRight: JustifyItems
	get() = unsafe("legacy right")


/** The CSS `safe center` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeCenter: JustifyItems
	get() = unsafe("safe center")

/** The CSS `safe end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeEnd: JustifyItems
	get() = unsafe("safe end")

/** The CSS `safe flex-end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeFlexEnd: JustifyItems
	get() = unsafe("safe flex-end")

/** The CSS `safe flex-start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeFlexStart: JustifyItems
	get() = unsafe("safe flex-start")

/** The CSS `safe self-end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeSelfEnd: JustifyItems
	get() = unsafe("safe self-end")

/** The CSS `safe self-start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeSelfStart: JustifyItems
	get() = unsafe("safe self-start")

/** The CSS `safe start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.safeStart: JustifyItems
	get() = unsafe("safe start")


/** The CSS `unsafe center` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeCenter: JustifyItems
	get() = unsafe("unsafe center")

/** The CSS `unsafe end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeEnd: JustifyItems
	get() = unsafe("unsafe end")

/** The CSS `unsafe flex-end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeFlexEnd: JustifyItems
	get() = unsafe("unsafe flex-end")

/** The CSS `unsafe flex-start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeFlexStart: JustifyItems
	get() = unsafe("unsafe flex-start")

/** The CSS `unsafe self-end` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeSelfEnd: JustifyItems
	get() = unsafe("unsafe self-end")

/** The CSS `unsafe self-start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeSelfStart: JustifyItems
	get() = unsafe("unsafe self-start")

/** The CSS `unsafe start` justify-items value. */
@CssDsl
public inline val JustifyItems.Companion.unsafeStart: JustifyItems
	get() = unsafe("unsafe start")


/** Creates a [JustifyItems] from an unchecked string [value]. */
public inline fun JustifyItems.Companion.unsafe(value: String): JustifyItems =
	CssValue.unsafe(value)


/** Creates a [JustifyItems] backed by a CSS variable with the given [name]. */
public inline fun JustifyItems.Companion.variable(name: String): JustifyItems.Variable =
	CssVariable.unsafe(name)


/** Sets the `justify-items` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.justifyItems(value: JustifyItems) {
	property(justifyItems, value)
}


/** The `justify-items` CSS property. */
@Suppress("unused")
public inline val CssProperties.justifyItems: CssProperty<JustifyItems>
	get() = CssProperty.unsafe("justify-items")
