package io.fluidsonic.css

import kotlin.test.*

class CssDeclarationBlockBuilderTests {

	private val printer = CssPrinter.default()

	@Test
	fun buildsSimpleBlock() {
		val builder = CssDeclarationBlockBuilder.default()
		builder.property("color", "red")
		builder.property("font-size", "16px")
		val block = with(builder) { Unit.build() }
		assertEquals(actual = printer.print(block), expected = "color:red;font-size:16px;")
	}

	@Test
	fun buildsBlockWithCssValue() {
		val builder = CssDeclarationBlockBuilder.default()
		builder.property("width", 10.px)
		val block = with(builder) { Unit.build() }
		assertEquals(actual = printer.print(block), expected = "width:10px;")
	}

	@Test
	fun buildsHierarchicalBlock() {
		val builder = CssDeclarationBlockBuilder.default()
		builder.property("color", "red")
		builder.apply {
			"&:hover" {
				property("color", "blue")
			}
		}
		val block = with(builder) { Unit.build() }
		assertEquals(actual = printer.print(block), expected = "color:red;\n&:hover{color:blue;}")
	}

	@Test
	fun buildsEmptyBlock() {
		val builder = CssDeclarationBlockBuilder.default()
		val block = with(builder) { Unit.build() }
		assertEquals(actual = printer.print(block), expected = "")
	}
}
