@file:Suppress("NAME_CONTAINS_ILLEGAL_CHARS", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE")

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssSelector`. */
@JsName("0;0")
public external interface CssSelector {

	public companion object
}


/** Returns the string representation of this [CssSelector]. */
public inline fun CssSelector.asString(): String =
	unsafeCast<String>()


/** Creates a [CssSelector] from an unchecked [selector] string. */
public inline fun CssSelector.Companion.unsafe(selector: String): CssSelector =
	selector.unsafeCast<CssSelector>()


// FIXME refactor
/** Sets the `&:active` pseudo-class styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.active(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:active"(declarations)
}


/** Sets the `&::after` pseudo-element styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.after(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::after"(declarations)
}


/** Sets the `&::before` pseudo-element styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.before(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::before"(declarations)
}


/** Sets styles for all direct children (`& > *`). */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.children(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"& > *"(declarations)
}


/** Sets styles for direct children matching the given [selector]. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.children(
	selector: String,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"& > $selector"(declarations)
}


/** Sets the `&:focus` pseudo-class styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.focus(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:focus"(declarations)
}


/** Sets the `&:hover` pseudo-class styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.hover(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:hover"(declarations)
}


/** Sets the `&:nth-child()` pseudo-class styles for the given [index]. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.nthChild(
	index: Int,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&:nth-child($index)"(declarations)
}


/** Sets the `&::placeholder` pseudo-element styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.placeholder(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::placeholder"(declarations)
}


/** Sets the `&::selection` pseudo-element styles. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.selection(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::selection, & ::selection"(declarations)
}


// FIXME test
/** Increases selector specificity by repeating the `&` selector. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.specific(
	specificity: Int = 1,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&".repeat(specificity + 1)(declarations)
}
