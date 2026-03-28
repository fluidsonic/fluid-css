@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


/** DSL builder for constructing [CssDeclarationBlock] instances. */
@CssDsl
public interface CssDeclarationBlockBuilder : CssProperties {

	/** Adds a [CssDeclaration] to the block being built. */
	@JsName("d")
	public fun declaration(value: CssDeclaration)


	// Not inlined b/c inlined code `builder.d(["property","value"])` would be longer than `builder.p("property","value")`.
	// Not an extension b/c it would be imported as a local variable `xx` and invocations emitted as `xx(builder,"property","value")`.
	/** Adds a CSS property declaration with the given [name] and [value]. */
	@CssDsl
	@JsName("p")
	public fun property(name: String, value: String) {
		declaration(CssDeclaration.of(property = name, value = value))
	}

	/** Builds the [CssDeclarationBlock] from accumulated declarations. */
	public fun Unit.build(): CssDeclarationBlock


	/** DSL builder for hierarchical [CssDeclarationBlock] instances with nested rules. */
	public interface Hierarchical : CssDeclarationBlockBuilder {

		/** Adds a nested [CssRule] as a child of this block. */
		public fun child(value: CssRule)

		/** Nests declarations under this [CssSelector]. */
		@CssDsl
		public operator fun CssSelector.invoke(declarations: Hierarchical.() -> Unit) {
			child(CssRule.default(
				selector = this,
				declarations = with(Default().apply(declarations)) { Unit.build() }
			))
		}

		// TODO Move to extension once we have multiple receivers.
		/** Nests declarations under a raw CSS selector string. */
		@CssDsl
		public operator fun String.invoke(declarations: Hierarchical.() -> Unit) {
			CssSelector.unsafe(this)(declarations)
		}

		/** Builds the hierarchical [CssDeclarationBlock.Hierarchical] from accumulated declarations and children. */
		override fun Unit.build(): CssDeclarationBlock.Hierarchical
	}


	public companion object {

		/** Creates a default [Hierarchical] builder instance. */
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


/** Sets a CSS property with a [CssValue]. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.property(property: String, value: CssValue) {
	property(property, value.asString())
}


/** Sets a CSS property with a [Double] value. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.property(property: String, value: Double) {
	property(property, "$value")
}


/** Sets a CSS property with an [Int] value. */
@CssDsl
public inline fun CssDeclarationBlockBuilder.property(property: String, value: Int) {
	property(property, "$value")
}


/** Sets a typed [CssProperty] with its corresponding [CssValue]. */
@CssDsl
public inline fun <Value : CssValue> CssDeclarationBlockBuilder.property(property: CssProperty<in Value>, value: Value) {
	property(property.name, value.asString())
}


/** Sets a typed [CssProperty] with a [Double] value. */
@CssDsl
public inline fun <Value : CssValue.DoubleConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: Double,
) {
	property(property.name, "$value")
}


/** Sets a typed [CssProperty] with an [Int] value. */
@CssDsl
public inline fun <Value : CssValue.IntConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: Int,
) {
	property(property.name, "$value")
}


/** Sets a typed [CssProperty] with a [String] value. */
@CssDsl
public inline fun <Value : CssValue.StringConstructable> CssDeclarationBlockBuilder.property(
	property: CssProperty<Value>,
	value: String,
) {
	property(property.name, value)
}


/** Sets a [CssVariable] with its corresponding [CssValue]. */
@CssDsl
public inline fun <Value : CssValue> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Value,
) {
	property(variable.propertyName, value.asString())
}


/** Sets a [CssVariable] with a [Double] value. */
@CssDsl
public inline fun <Value : CssValue.DoubleConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Double,
) {
	property(variable.propertyName, "$value")
}


/** Sets a [CssVariable] with an [Int] value. */
@CssDsl
public inline fun <Value : CssValue.IntConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: Int,
) {
	property(variable.propertyName, "$value")
}


/** Sets a [CssVariable] with a [String] value. */
@CssDsl
public inline fun <Value : CssValue.StringConstructable> CssDeclarationBlockBuilder.property(
	variable: CssVariable<in Value>,
	value: String,
) {
	property(variable.propertyName, value)
}
