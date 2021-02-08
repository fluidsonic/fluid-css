import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "1.1.21"
}

fluidLibrary(name = "css", version = "0.9.1")

fluidLibraryModule(description = "FIXME") {
	targets {
		js {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))
			}

			custom {
				compilations.all {
					kotlinOptions.moduleKind = "commonjs"
				}
			}
		}
	}
}
