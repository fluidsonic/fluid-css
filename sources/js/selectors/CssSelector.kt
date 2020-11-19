@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface CssSelector {

	public val value: String
}


private class CssSelectorImpl(override val value: String) : CssSelector {

	override fun toString() =
		CssPrinter.default().print(this)
}


@Suppress("FunctionName")
public fun CssSelector(value: String): CssSelector =
	CssSelectorImpl(value)


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


// FIXME test
@CssDsl
public inline fun CssDeclarationBlockBuilder.Hierarchical.specific(
	specificity: Int = 1,
	noinline declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&".repeat(specificity + 1)(declarations)
}
