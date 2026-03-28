package io.fluidsonic.css


/** Prints CSS constructs to string form. */
public interface CssPrinter {

	/** Prints a [CssDeclaration] to [destination]. */
	public fun print(destination: StringBuilder, declaration: CssDeclaration)

	/** Prints a [CssDeclarationBlock] to [destination]. */
	public fun print(destination: StringBuilder, declarationBlock: CssDeclarationBlock)

	/** Prints a [FontFace] to [destination]. */
	public fun print(destination: StringBuilder, fontFace: FontFace)

	/** Prints a [Keyframe] to [destination]. */
	public fun print(destination: StringBuilder, keyframe: Keyframe)

	/** Prints a [Keyframes] to [destination]. */
	public fun print(destination: StringBuilder, keyframes: Keyframes)

	/** Prints a [CssRule] to [destination]. */
	public fun print(destination: StringBuilder, rule: CssRule)

	/** Prints a [CssSelector] to [destination]. */
	public fun print(destination: StringBuilder, selector: CssSelector)


	public companion object {

		/** Creates a [CssPrinter] with default formatting. */
		public fun default(): CssPrinter =
			Default
	}


	private object Default : CssPrinter {

		override fun print(destination: StringBuilder, declaration: CssDeclaration) {
			destination.append(declaration.property)
			destination.append(":")
			destination.append(declaration.value)
		}


		override fun print(destination: StringBuilder, declarationBlock: CssDeclarationBlock) {
			for (declaration in declarationBlock.declarations) {
				print(destination, declaration)
				destination.append(";")
			}

			if (declarationBlock is CssDeclarationBlock.Hierarchical && declarationBlock.children.isNotEmpty()) {
				if (declarationBlock.declarations.isNotEmpty())
					destination.append("\n")

				declarationBlock.children.forEachIndexed { index, child ->
					if (index > 0)
						destination.append("\n")

					print(destination, child)
				}
			}
		}


		override fun print(destination: StringBuilder, fontFace: FontFace) {
			destination.append("@font-face {")
			print(destination, fontFace.declarations)
			destination.append("}")
		}


		override fun print(destination: StringBuilder, keyframe: Keyframe) {
			destination.append(keyframe.key)
			destination.append("{")
			print(destination, keyframe.style)
			destination.append("}")
		}


		override fun print(destination: StringBuilder, keyframes: Keyframes) {
			destination.append("@keyframes ")
			destination.append(keyframes.name)
			destination.append("{")
			for (keyframe in keyframes.frames)
				print(destination, keyframe)
			destination.append("}")
		}


		override fun print(destination: StringBuilder, rule: CssRule) {
			print(destination, rule.selector)
			destination.append("{")
			print(destination, rule.declarations)
			destination.append("}")
		}


		override fun print(destination: StringBuilder, selector: CssSelector) {
			destination.append(selector.asString())
		}
	}
}


/** Returns the string representation of a [CssDeclaration]. */
public fun CssPrinter.print(declaration: CssDeclaration): String =
	buildString { print(this, declaration) }


/** Returns the string representation of a [CssDeclarationBlock]. */
public fun CssPrinter.print(declarations: CssDeclarationBlock): String =
	buildString { print(this, declarations) }


/** Returns the string representation of a [FontFace]. */
public fun CssPrinter.print(fontFace: FontFace): String =
	buildString { print(this, fontFace) }


/** Returns the string representation of a [Keyframe]. */
public fun CssPrinter.print(keyframe: Keyframe): String =
	buildString { print(this, keyframe) }


/** Returns the string representation of a [Keyframes]. */
public fun CssPrinter.print(keyframes: Keyframes): String =
	buildString { print(this, keyframes) }


/** Returns the string representation of a [CssRule]. */
public fun CssPrinter.print(rule: CssRule): String =
	buildString { print(this, rule) }


/** Returns the string representation of a [CssSelector]. */
public fun CssPrinter.print(selector: CssSelector): String =
	buildString { print(this, selector) }
