@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface CssDeclarationBlockBuilder {

	@CssDsl
	public fun declaration(value: CssDeclaration)

	@CssDsl
	public fun property(property: CssProperty, value: String) {
		declaration(CssDeclaration(property, value))
	}

	public fun Unit.build(): CssDeclarationBlock


	public interface Hierarchical : CssDeclarationBlockBuilder {

		@CssDsl
		public fun child(value: CssRule)

		@CssDsl
		public operator fun CssSelector.invoke(declarations: Hierarchical.() -> Unit) {
			with(Default()) {
				declarations()

				child(CssRule.default(selector = this@invoke, declarations = Unit.build()))
			}
		}

		// TODO Move to extension once we have multiple receivers.
		@CssDsl
		public operator fun String.invoke(declarations: Hierarchical.() -> Unit) {
			CssSelector(this)(declarations)
		}

		override fun Unit.build(): CssDeclarationBlock.Hierarchical
	}


	public companion object {

		public fun default(): Hierarchical =
			Default()
	}


	private class Default : Hierarchical {

		private val children = mutableListOf<CssRule>() // FIXME
		private val declarations = mutableListOf<CssDeclaration>()


		override fun child(value: CssRule) {
			children += value
		}


		override fun declaration(value: CssDeclaration) {
			declarations += value
		}


		override fun Unit.build() =
			CssDeclarationBlock.default(
				children = children,
				declarations = declarations,
			)
	}
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(
	property: CssProperty,
	value: CssValue,
) {
	property(property, value.toString())
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(
	property: CssProperty,
	value: Number,
) {
	property(property, value.toString())
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(
	property: CssProperty,
	value: CustomCssProperty<*>,
) {
	property(property, value.reference())
}


@CssDsl
public inline fun <Value : Any> CssDeclarationBlockBuilder.property(
	property: CssProperty,
	value: CustomCssProperty<Value>,
	vararg defaultValues: Value?,
) {
	property(property, value.reference(*defaultValues))
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(
	property: CustomCssProperty<*>,
	value: String,
) {
	property(CssProperty(property.toString()), value)
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(
	property: CustomCssProperty<Number>,
	value: Number,
) {
	property(CssProperty(property.toString()), value)
}


@CssDsl
public inline fun <Value : CssValue> CssDeclarationBlockBuilder.property(
	variable: CssVariable<Value>,
	value: Value,
) {
	property(variable.toProperty(), value)
}

// FIXME
//
//@CssDsl
//public inline fun <Value : CssValue> CssDeclarationBlockBuilder.property(
//	property: CustomCssProperty<Value>,
//	value: CustomCssProperty<Value>,
//	vararg defaultValues: Value?,
//) {
//	property(CssProperty(property.toString()), value, *defaultValues)
//}


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
public fun CssDeclarationBlockBuilder.Hierarchical.children(selector: String, declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
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
public fun CssDeclarationBlockBuilder.Hierarchical.nthChild(index: Int, declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&:nth-child($index)"(declarations)
}


@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.placeholder(declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&::placeholder"(declarations)
}


// FIXME test
@CssDsl
public fun CssDeclarationBlockBuilder.Hierarchical.specific(specificity: Int = 1, declarations: CssDeclarationBlockBuilder.Hierarchical.() -> Unit) {
	"&".repeat(specificity + 1)(declarations)
}
