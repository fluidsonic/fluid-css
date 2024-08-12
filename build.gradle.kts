import io.fluidsonic.gradle.*

plugins {
	id("io.fluidsonic.gradle") version "1.3.2"
}

fluidLibrary(name = "css", version = "0.12.0")

fluidLibraryModule(description = "FIXME") {
	targets {
		js {
			dependencies {
				implementation(npm("@emotion/stylis", "~0.8.5"))
			}

			custom {
				useCommonJs()
			}
		}
	}
}
