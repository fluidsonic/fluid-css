import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "3.0.0"
}

fluidLibrary(name = "css", version = "0.14.0")

fluidLibraryModule(description = "Kotlin/JS CSS-in-JS library") {
	targets {
		@Suppress("DEPRECATION")
		js {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))
			}

			custom {
				useEsModules()
			}
		}
	}
}
