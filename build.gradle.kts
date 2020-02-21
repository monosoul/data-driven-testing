import org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
import org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED
import org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
import org.gradle.api.tasks.testing.logging.TestLogEvent.SKIPPED

group = "com.github.monosoul"
version = "0.0.1"

subprojects {
    repositories {
        mavenCentral()
    }

    tasks {
        withType<Test> {
            testLogging {
                events(PASSED, SKIPPED, FAILED)
                exceptionFormat = FULL
            }
        }
    }
}