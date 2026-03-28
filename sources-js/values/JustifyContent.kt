@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Represents a CSS `justify-content` value. */
@JsName("0;0")
public external interface JustifyContent : CssValue {

	public companion object;


	/** A [JustifyContent] backed by a [CssVariable]. */
	@JsName("0;0")
	public interface Variable : JustifyContent, CssVariable<JustifyContent>
}


/** The CSS `center` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.center: JustifyContent
	get() = unsafe("center")

/** The CSS `flex-end` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.flexEnd: JustifyContent
	get() = unsafe("flex-end")

/** The CSS `flex-start` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.flexStart: JustifyContent
	get() = unsafe("flex-start")

/** The CSS `end` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.end: JustifyContent
	get() = unsafe("end")

/** The CSS `left` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.left: JustifyContent
	get() = unsafe("left")

/** The CSS `right` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.right: JustifyContent
	get() = unsafe("right")

/** The CSS `normal` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.normal: JustifyContent
	get() = unsafe("normal")

/** The CSS `space-around` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.spaceAround: JustifyContent
	get() = unsafe("space-around")

/** The CSS `space-between` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.spaceBetween: JustifyContent
	get() = unsafe("space-between")

/** The CSS `space-evenly` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.spaceEvenly: JustifyContent
	get() = unsafe("space-evenly")

/** The CSS `start` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.start: JustifyContent
	get() = unsafe("start")

/** The CSS `stretch` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.stretch: JustifyContent
	get() = unsafe("stretch")


/** The CSS `safe center` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeCenter: JustifyContent
	get() = unsafe("safe center")

/** The CSS `safe end` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeEnd: JustifyContent
	get() = unsafe("safe end")

/** The CSS `safe left` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeLeft: JustifyContent
	get() = unsafe("safe left")

/** The CSS `safe flex-end` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeFlexEnd: JustifyContent
	get() = unsafe("safe flex-end")

/** The CSS `safe flex-start` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeFlexStart: JustifyContent
	get() = unsafe("safe flex-start")

/** The CSS `safe right` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeRight: JustifyContent
	get() = unsafe("safe right")

/** The CSS `safe start` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.safeStart: JustifyContent
	get() = unsafe("safe start")


/** The CSS `unsafe center` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeCenter: JustifyContent
	get() = unsafe("unsafe center")

/** The CSS `unsafe end` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeEnd: JustifyContent
	get() = unsafe("unsafe end")

/** The CSS `unsafe left` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeLeft: JustifyContent
	get() = unsafe("unsafe left")

/** The CSS `unsafe flex-end` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeFlexEnd: JustifyContent
	get() = unsafe("unsafe flex-end")

/** The CSS `unsafe flex-start` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeFlexStart: JustifyContent
	get() = unsafe("unsafe flex-start")

/** The CSS `unsafe right` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeRight: JustifyContent
	get() = unsafe("unsafe right")

/** The CSS `unsafe start` justify-content value. */
@CssDsl
public inline val JustifyContent.Companion.unsafeStart: JustifyContent
	get() = unsafe("unsafe start")


/** Creates a [JustifyContent] from an unchecked string [value]. */
public inline fun JustifyContent.Companion.unsafe(value: String): JustifyContent =
	CssValue.unsafe(value)


/** Creates a [JustifyContent] backed by a CSS variable with the given [name]. */
public inline fun JustifyContent.Companion.variable(name: String): JustifyContent.Variable =
	CssVariable.unsafe(name)


/** Sets the `justify-content` CSS property. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.justifyContent(value: JustifyContent) {
	property(justifyContent, value)
}


/** The `justify-content` CSS property. */
@Suppress("unused")
public inline val CssProperties.justifyContent: CssProperty<JustifyContent>
	get() = CssProperty.unsafe("justify-content")
