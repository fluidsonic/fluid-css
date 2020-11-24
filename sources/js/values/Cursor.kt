@file:Suppress("NOTHING_TO_INLINE")

package io.fluidsonic.css


public external interface Cursor : CssValue {

	@Suppress("INLINE_EXTERNAL_DECLARATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE", "WRONG_BODY_OF_EXTERNAL_DECLARATION")
	public companion object {

		@CssDsl
		public inline val auto: Cursor
			get() = unsafe("auto")

		@CssDsl
		public inline val none: Cursor
			get() = unsafe("none")


		@CssDsl
		public inline val alias: Cursor
			get() = unsafe("alias")

		@CssDsl
		public inline val allScroll: Cursor
			get() = unsafe("all-scroll")

		@CssDsl
		public inline val cell: Cursor
			get() = unsafe("cell")

		@CssDsl
		public inline val colResize: Cursor
			get() = unsafe("col-resize")

		@CssDsl
		public inline val contextMenu: Cursor
			get() = unsafe("context-menu")

		@CssDsl
		public inline val copy: Cursor
			get() = unsafe("copy")

		@CssDsl
		public inline val crosshair: Cursor
			get() = unsafe("crosshair")

		@CssDsl
		public inline val default: Cursor
			get() = unsafe("default")

		@CssDsl
		public inline val eResize: Cursor
			get() = unsafe("e-resize")

		@CssDsl
		public inline val ewResize: Cursor
			get() = unsafe("ew-resize")

		@CssDsl
		public inline val grab: Cursor
			get() = unsafe("grab")

		@CssDsl
		public inline val grabbing: Cursor
			get() = unsafe("grabbing")

		@CssDsl
		public inline val help: Cursor
			get() = unsafe("help")

		@CssDsl
		public inline val move: Cursor
			get() = unsafe("move")

		@CssDsl
		public inline val nResize: Cursor
			get() = unsafe("n-resize")

		@CssDsl
		public inline val neResize: Cursor
			get() = unsafe("ne-resize")

		@CssDsl
		public inline val neswResize: Cursor
			get() = unsafe("nesw-resize")

		@CssDsl
		public inline val noDrop: Cursor
			get() = unsafe("no-drop")

		@CssDsl
		public inline val notAllowed: Cursor
			get() = unsafe("not-allowed")

		@CssDsl
		public inline val nsResize: Cursor
			get() = unsafe("ns-resize")

		@CssDsl
		public inline val nwResize: Cursor
			get() = unsafe("nw-resize")

		@CssDsl
		public inline val nwseResize: Cursor
			get() = unsafe("nwse-resize")

		@CssDsl
		public inline val pointer: Cursor
			get() = unsafe("pointer")

		@CssDsl
		public inline val progress: Cursor
			get() = unsafe("progress")

		@CssDsl
		public inline val rowResize: Cursor
			get() = unsafe("row-resize")

		@CssDsl
		public inline val sResize: Cursor
			get() = unsafe("s-resize")

		@CssDsl
		public inline val seResize: Cursor
			get() = unsafe("se-resize")

		@CssDsl
		public inline val swResize: Cursor
			get() = unsafe("sw-resize")

		@CssDsl
		public inline val text: Cursor
			get() = unsafe("text")

		@CssDsl
		public inline val verticalText: Cursor
			get() = unsafe("vertical-text")

		@CssDsl
		public inline val wResize: Cursor
			get() = unsafe("w-resize")

		@CssDsl
		public inline val wait: Cursor
			get() = unsafe("wait")

		@CssDsl
		public inline val zooIn: Cursor
			get() = unsafe("zoom-in")

		@CssDsl
		public inline val zoomOut: Cursor
			get() = unsafe("zoom-out")


		public inline fun unsafe(value: String): Cursor =
			CssValue.unsafe(value)


		public inline fun variable(name: String): Variable =
			CssVariable.unsafe(name)
	}


	public interface Variable : Cursor, CssVariable<Cursor>
}


@CssDsl
public inline fun CssDeclarationBlockBuilder.cursor(value: Cursor) {
	property(cursor, value)
}


@Suppress("unused")
public inline val CssProperties.cursor: CssProperty<Cursor>
	get() = CssProperty.unsafe("cursor")
