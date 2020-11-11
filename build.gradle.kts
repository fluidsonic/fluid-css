import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "1.1.12"
}

fluidLibrary(name = "css", version = "0.9.0")

fluidLibraryModule(description = "FIXME") {
	targets {
		js {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))

				api("org.jetbrains:kotlin-css:1.0.0-pre.129-kotlin-1.4.10")
			}
		}
	}
}
