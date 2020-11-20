@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface CssDeclarationBlockBuilder : CssProperties {

	public fun declaration(value: CssDeclaration)

	public fun property(name: String, value: String) {
		declaration(CssDeclaration(property = name, value = value))
	}

	public fun Unit.build(): CssDeclarationBlock


	public interface Hierarchical : CssDeclarationBlockBuilder {

		@CssDsl
		public fun child(value: CssRule)

		@CssDsl
		public operator fun CssSelector.invoke(declarations: Hierarchical.() -> Unit) {
			child(CssRule.default(
				selector = this,
				declarations = with(Default().apply(declarations)) { Unit.build() }
			))
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
public fun CssDeclarationBlockBuilder.property(property: String, value: Int) {
	property(property, value.toString())
}


@CssDsl
public fun CssDeclarationBlockBuilder.property(property: String, value: Number) {
	property(property, value.toString())
}


@CssDsl
public fun CssDeclarationBlockBuilder.property(property: String, value: CssValue) {
	property(property, value.toString())
}


@CssDsl
public fun <Value : CssValue> CssDeclarationBlockBuilder.property(property: CssProperty<in Value>, value: Value) {
	property(property.name, value.toString())
}


@CssDsl
public fun <Value : CssValue.IntConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: Int,
) {
	property(property.name, value.toString())
}


@CssDsl
public fun <Value : CssValue.NumberConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: Number,
) {
	property(property.name, value.toString())
}


@CssDsl
public fun <Value : CssValue.StringConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: String,
) {
	property(property.name, value)
}


@CssDsl
public fun <Value : CssValue> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Value,
) {
	property(variable.propertyName, value.toString())
}


@CssDsl
public fun <Value : CssValue.IntConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Int,
) {
	property(variable.propertyName, value.toString())
}


@CssDsl
public fun <Value : CssValue.NumberConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Number,
) {
	property(variable.propertyName, value.toString())
}


@CssDsl
public fun <Value : CssValue.StringConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: String,
) {
	property(variable.propertyName, value)
}
