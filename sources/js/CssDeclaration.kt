package io.fluidsonic.css


public class CssDeclaration(
	public val property: String,
	public val value: String,
) {

	override fun toString(): String =
		CssPrinter.default().print(this)
}
