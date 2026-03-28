package io.fluidsonic.css

import kotlin.test.*

class CssPrinterTests {

	private val printer = CssPrinter.default()

	@Test
	fun printsDeclaration() {
		val declaration = CssDeclaration.of("color", "red")
		assertEquals(actual = printer.print(declaration), expected = "color:red")
	}

	@Test
	fun printsDeclarationBlock() {
		val block = CssDeclarationBlock.default(
			declarations = arrayOf(
				CssDeclaration.of("color", "red"),
				CssDeclaration.of("font-size", "16px"),
			)
		)
		assertEquals(actual = printer.print(block), expected = "color:red;font-size:16px;")
	}

	@Test
	fun printsRule() {
		val rule = CssRule.default(
			selector = CssSelector.unsafe(".foo"),
			declarations = CssDeclarationBlock.default(
				declarations = arrayOf(CssDeclaration.of("color", "red"))
			)
		)
		assertEquals(actual = printer.print(rule), expected = ".foo{color:red;}")
	}

	@Test
	fun printsKeyframes() {
		val keyframes = Keyframes.default(
			name = "fadeIn",
			frames = arrayOf(
				Keyframe.default(
					key = "from",
					style = CssDeclarationBlock.default(declarations = arrayOf(CssDeclaration.of("opacity", "0")))
				),
				Keyframe.default(
					key = "to",
					style = CssDeclarationBlock.default(declarations = arrayOf(CssDeclaration.of("opacity", "1")))
				),
			)
		)
		assertEquals(actual = printer.print(keyframes), expected = "@keyframes fadeIn{from{opacity:0;}to{opacity:1;}}")
	}

	@Test
	fun printsSelector() {
		val selector = CssSelector.unsafe(".my-class")
		assertEquals(actual = printer.print(selector), expected = ".my-class")
	}

	@Test
	fun printsHierarchicalBlock() {
		val childRule = CssRule.default(
			selector = CssSelector.unsafe("&:hover"),
			declarations = CssDeclarationBlock.default(declarations = arrayOf(CssDeclaration.of("color", "blue")))
		)
		val block = CssDeclarationBlock.default(
			declarations = arrayOf(CssDeclaration.of("color", "red")),
			children = arrayOf(childRule)
		)
		assertEquals(actual = printer.print(block), expected = "color:red;\n&:hover{color:blue;}")
	}

	@Test
	fun printsHierarchicalBlockWithoutDeclarations() {
		val childRule = CssRule.default(
			selector = CssSelector.unsafe("&:hover"),
			declarations = CssDeclarationBlock.default(declarations = arrayOf(CssDeclaration.of("color", "blue")))
		)
		val block = CssDeclarationBlock.default(
			declarations = arrayOf(),
			children = arrayOf(childRule)
		)
		assertEquals(actual = printer.print(block), expected = "&:hover{color:blue;}")
	}
}
