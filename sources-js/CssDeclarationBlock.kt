package io.fluidsonic.css


// FIXME find better name -- see https://developer.mozilla.org/en-US/docs/Web/API/CSSKeyframesRule
/** An ordered collection of CSS declarations. */
public interface CssDeclarationBlock {

	/** The CSS declarations contained in this block. */
	public val declarations: Array<out CssDeclaration>


	/** A [CssDeclarationBlock] that can also contain nested [CssRule] children. */
	public interface Hierarchical : CssDeclarationBlock {

		/** The nested CSS rules within this block. */
		public val children: Array<out CssRule>
	}


	public companion object {

		/** Creates a [CssDeclarationBlock] with the given [declarations]. */
		public fun default(declarations: Array<out CssDeclaration>): CssDeclarationBlock =
			Default(declarations = declarations.copyOf())


		/** Creates a [Hierarchical] block with the given [declarations] and nested [children]. */
		public fun default(declarations: Array<out CssDeclaration>, children: Array<out CssRule>): Hierarchical =
			DefaultHierarchical(children = children.copyOf(), declarations = declarations.copyOf())
	}


	private class Default(
		override val declarations: Array<out CssDeclaration>,
	) : CssDeclarationBlock {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}


	private class DefaultHierarchical(
		override val children: Array<out CssRule>,
		override val declarations: Array<out CssDeclaration>,
	) : Hierarchical {

		override fun toString(): String =
			CssPrinter.default().print(this)
	}
}
