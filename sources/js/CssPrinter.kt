package io.fluidsonic.css


public interface CssPrinter {

	public fun print(destination: Appendable, declaration: CssDeclaration)
	public fun print(destination: Appendable, declarationBlock: CssDeclarationBlock)
	public fun print(destination: Appendable, fontFace: FontFace)
	public fun print(destination: Appendable, keyframe: Keyframe)
	public fun print(destination: Appendable, keyframes: Keyframes)
	public fun print(destination: Appendable, rule: CssRule)
	public fun print(destination: Appendable, selector: CssSelector)


	public companion object {

		public fun default(): CssPrinter =
			Default
	}


	private object Default : CssPrinter {

		override fun print(destination: Appendable, declaration: CssDeclaration) {
			destination.append(declaration.property)
			destination.append(":")
			destination.append(declaration.value)
		}


		override fun print(destination: Appendable, declarationBlock: CssDeclarationBlock) {
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


		override fun print(destination: Appendable, fontFace: FontFace) {
			destination.append("@font-face {")
			print(destination, fontFace.declarations)
			destination.append("}")
		}


		override fun print(destination: Appendable, keyframe: Keyframe) {
			destination.append(keyframe.key)
			destination.append("{")
			print(destination, keyframe.style)
			destination.append("}")
		}


		override fun print(destination: Appendable, keyframes: Keyframes) {
			destination.append("@keyframes ")
			destination.append(keyframes.name)
			destination.append("{")
			for (keyframe in keyframes.frames)
				print(destination, keyframe)
			destination.append("}")
		}


		override fun print(destination: Appendable, rule: CssRule) {
			print(destination, rule.selector)
			destination.append("{")
			print(destination, rule.declarations)
			destination.append("}")
		}


		override fun print(destination: Appendable, selector: CssSelector) {
			destination.append(selector.value)
		}
	}
}


public fun CssPrinter.print(declaration: CssDeclaration): String =
	buildString { print(this, declaration) }


public fun CssPrinter.print(declarations: CssDeclarationBlock): String =
	buildString { print(this, declarations) }


public fun CssPrinter.print(fontFace: FontFace): String =
	buildString { print(this, fontFace) }


public fun CssPrinter.print(keyframe: Keyframe): String =
	buildString { print(this, keyframe) }


public fun CssPrinter.print(keyframes: Keyframes): String =
	buildString { print(this, keyframes) }


public fun CssPrinter.print(rule: CssRule): String =
	buildString { print(this, rule) }


public fun CssPrinter.print(selector: CssSelector): String =
	buildString { print(this, selector) }
