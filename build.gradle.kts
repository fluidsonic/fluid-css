import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "1.1.12"
}

fluidLibrary(name = "css", version = "0.9.0")

fluidLibraryModule(description = "FIXME") {
	language {
		withExperimentalApi("io.fluidsonic.css.InternalCssApi")
	}

	targets {
		js {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))
			}
		}
	}
}
