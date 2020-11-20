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
public fun CssDeclarationBlockBuilder.Hierarchical.active(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:active"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.after(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::after"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.before(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::before"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.children(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"& > *"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.children(
	selector: String,
	declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"& > $selector"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.focus(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:focus"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.hover(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:hover"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.nthChild(
	index: Int,
	declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&:nth-child($index)"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.placeholder(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::placeholder"(declarations)
}


// FIXME test
@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.specific(
	specificity: Int = 1,
	declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit,
) {
	"&".repeat(specificity + 1)(declarations)
}
