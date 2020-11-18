@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public interface Cursor : CssValue {

	public companion object {

		public val auto: Cursor = AutoValue.auto
		public val none: Cursor = NoneValue.none

		public val alias: Cursor = Cursor("alias")
		public val allScroll: Cursor = Cursor("all-scroll")
		public val cell: Cursor = Cursor("cell")
		public val colResize: Cursor = Cursor("col-resize")
		public val contextMenu: Cursor = Cursor("context-menu")
		public val copy: Cursor = Cursor("copy")
		public val crosshair: Cursor = Cursor("crosshair")
		public val default: Cursor = Cursor("default")
		public val eResize: Cursor = Cursor("e-resize")
		public val ewResize: Cursor = Cursor("ew-resize")
		public val grab: Cursor = Cursor("grab")
		public val grabbing: Cursor = Cursor("grabbing")
		public val help: Cursor = Cursor("help")
		public val move: Cursor = Cursor("move")
		public val nResize: Cursor = Cursor("n-resize")
		public val neResize: Cursor = Cursor("ne-resize")
		public val neswResize: Cursor = Cursor("nesw-resize")
		public val noDrop: Cursor = Cursor("no-drop")
		public val notAllowed: Cursor = Cursor("not-allowed")
		public val nsResize: Cursor = Cursor("ns-resize")
		public val nwResize: Cursor = Cursor("nw-resize")
		public val nwseResize: Cursor = Cursor("nwse-resize")
		public val pointer: Cursor = Cursor("pointer")
		public val progress: Cursor = Cursor("progress")
		public val rowResize: Cursor = Cursor("row-resize")
		public val sResize: Cursor = Cursor("s-resize")
		public val seResize: Cursor = Cursor("se-resize")
		public val swResize: Cursor = Cursor("sw-resize")
		public val text: Cursor = Cursor("text")
		public val verticalText: Cursor = Cursor("vertical-text")
		public val wResize: Cursor = Cursor("w-resize")
		public val wait: Cursor = Cursor("wait")
		public val zooIn: Cursor = Cursor("zoom-in")
		public val zoomOut: Cursor = Cursor("zoom-out")
	}
}


private class CursorImpl(value: String) : CssValueBase(value), Cursor


@Suppress("FunctionName")
public fun Cursor(value: String): Cursor =
	CursorImpl(value)


public inline fun CssDeclarationBlockBuilder.cursor(value: Cursor) {
	property(CssProperty.cursor, value)
}


public inline fun CssDeclarationBlockBuilder.cursor(value: GlobalValue) {
	property(CssProperty.cursor, value)
}


public inline fun CssDeclarationBlockBuilder.cursor(value: CustomCssProperty<out Cursor>) {
	property(CssProperty.cursor, value)
}


public inline val CssProperty.Companion.cursor: CssProperty get() = CssProperty("cursor")
