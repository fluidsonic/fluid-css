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
