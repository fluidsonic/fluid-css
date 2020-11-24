@file:Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "NOTHING_TO_INLINE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")

package io.fluidsonic.css


/** Only `String` is a valid subtype of `CssSelector`. */
public external interface CssSelector {

	public companion object {

		public inline fun unsafe(selector: String): CssSelector =
			selector.unsafeCast<CssSelector>()
	}
}


public inline fun CssSelector.asString(): String =
	unsafeCast<String>()


// FIXME refactor
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.active(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:active"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.after(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::after"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.before(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::before"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.children(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"& > *"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.children(
	selector: String,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"& > $selector"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.focus(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:focus"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.hover(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:hover"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.nthChild(
	index: Int,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&:nth-child($index)"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.placeholder(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::placeholder"(declarations)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.selection(noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::selection, & ::selection"(declarations)
}


// FIXME test
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.specific(
	specificity: Int = 1,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&".repeat(specificity + 1)(declarations)
}
