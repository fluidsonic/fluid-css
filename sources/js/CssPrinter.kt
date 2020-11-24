package io.fluidsonic.css


public interface CssPrinter {

	public fun print(destination: StringBuilder, declaration: CssDeclaration)
	public fun print(destination: StringBuilder, declarationBlock: CssDeclarationBlock)
	public fun print(destination: StringBuilder, fontFace: FontFace)
	public fun print(destination: StringBuilder, keyframe: Keyframe)
	public fun print(destination: StringBuilder, keyframes: Keyframes)
	public fun print(destination: StringBuilder, rule: CssRule)
	public fun print(destination: StringBuilder, selector: CssSelector)


	public companion object {

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
