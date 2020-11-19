@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Cursor : CssValue, Internal {

	public companion object {

		@CssDsl
		public val auto: Cursor = raw("auto")

		@CssDsl
		public val none: Cursor = raw("none")


		@CssDsl
		public val alias: Cursor = raw("alias")

		@CssDsl
		public val allScroll: Cursor = raw("all-scroll")

		@CssDsl
		public val cell: Cursor = raw("cell")

		@CssDsl
		public val colResize: Cursor = raw("col-resize")

		@CssDsl
		public val contextMenu: Cursor = raw("context-menu")

		@CssDsl
		public val copy: Cursor = raw("copy")

		@CssDsl
		public val crosshair: Cursor = raw("crosshair")

		@CssDsl
		public val default: Cursor = raw("default")

		@CssDsl
		public val eResize: Cursor = raw("e-resize")

		@CssDsl
		public val ewResize: Cursor = raw("ew-resize")

		@CssDsl
		public val grab: Cursor = raw("grab")

		@CssDsl
		public val grabbing: Cursor = raw("grabbing")

		@CssDsl
		public val help: Cursor = raw("help")

		@CssDsl
		public val move: Cursor = raw("move")

		@CssDsl
		public val nResize: Cursor = raw("n-resize")

		@CssDsl
		public val neResize: Cursor = raw("ne-resize")

		@CssDsl
		public val neswResize: Cursor = raw("nesw-resize")

		@CssDsl
		public val noDrop: Cursor = raw("no-drop")

		@CssDsl
		public val notAllowed: Cursor = raw("not-allowed")

		@CssDsl
		public val nsResize: Cursor = raw("ns-resize")

		@CssDsl
		public val nwResize: Cursor = raw("nw-resize")

		@CssDsl
		public val nwseResize: Cursor = raw("nwse-resize")

		@CssDsl
		public val pointer: Cursor = raw("pointer")

		@CssDsl
		public val progress: Cursor = raw("progress")

		@CssDsl
		public val rowResize: Cursor = raw("row-resize")

		@CssDsl
		public val sResize: Cursor = raw("s-resize")

		@CssDsl
		public val seResize: Cursor = raw("se-resize")

		@CssDsl
		public val swResize: Cursor = raw("sw-resize")

		@CssDsl
		public val text: Cursor = raw("text")

		@CssDsl
		public val verticalText: Cursor = raw("vertical-text")

		@CssDsl
		public val wResize: Cursor = raw("w-resize")

		@CssDsl
		public val wait: Cursor = raw("wait")

		@CssDsl
		public val zooIn: Cursor = raw("zoom-in")

		@CssDsl
		public val zoomOut: Cursor = raw("zoom-out")


		public fun raw(value: String): Cursor =
			GenericValue(value)


		public fun variable(name: String): Variable =
			GenericVariable(name)
	}


	public interface Variable : Cursor, CssVariable<Cursor>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.cursor(value: Cursor) {
	property(cursor, value)
}


@Suppress("unused")
public inline val CssProperties.cursor: CssProperty<Cursor>
	get() = CssProperty("cursor")
