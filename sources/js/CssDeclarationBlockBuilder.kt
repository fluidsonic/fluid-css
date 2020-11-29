@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


@CssDsl
public interface CssDeclarationBlockBuilder : CssProperties {

	@JsName("d")
	public fun declaration(value: CssDeclaration)


	// Not inlined b/c inlined code `builder.d(["property","value"])` would be longer than `builder.p("property","value")`.
	// Not an extension b/c it would be imported as a local variable `xx` and invocations emitted as `xx(builder,"property","value")`.
	@CssDsl
	@JsName("p")
	public fun property(name: String, value: String) {
		declaration(CssDeclaration.of(property = name, value = value))
	}

	public fun Unit.build(): CssDeclarationBlock


	public interface Hierarchical : CssDeclarationBlockBuilder {

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
			CssSelector.unsafe(this)(declarations)
		}

		override fun Unit.build(): CssDeclarationBlock.Hierarchical
	}


	public companion object {

		public fun default(): Hierarchical =
			Default()
	}


	private class Default : Hierarchical {

		private val children = arrayOf<CssRule>() // FIXME
		private val declarations = arrayOf<CssDeclaration>()


		override fun child(value: CssRule) {
			children.push(value)
		}


		override fun declaration(value: CssDeclaration) {
			declarations.push(value)
		}


		override fun Unit.build() =
			CssDeclarationBlock.default(
				children = children,
				declarations = declarations,
			)
	}
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(property: String, value: CssValue) {
	property(property, value.asString())
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(property: String, value: Double) {
	property(property, "$value")
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.property(property: String, value: Int) {
	property(property, "$value")
}


@CssDsl
public inline fun <Value : CssValue> CssDeclarationBlockBuilder.property(property: CssProperty<in Value>, value: Value) {
	property(property.name, value.asString())
}


@CssDsl
public inline fun <Value : CssValue.DoubleConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: Double,
) {
	property(property.name, "$value")
}


@CssDsl
public inline fun <Value : CssValue.IntConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: Int,
) {
	property(property.name, "$value")
}


@CssDsl
public inline fun <Value : CssValue.StringConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: String,
) {
	property(property.name, value)
}


@CssDsl
public inline fun <Value : CssValue> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Value,
) {
	property(variable.propertyName, value.asString())
}


@CssDsl
public inline fun <Value : CssValue.DoubleConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Double,
) {
	property(variable.propertyName, "$value")
}


@CssDsl
public inline fun <Value : CssValue.IntConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Int,
) {
	property(variable.propertyName, "$value")
}


@CssDsl
public inline fun <Value : CssValue.StringConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: String,
) {
	property(variable.propertyName, value)
}
