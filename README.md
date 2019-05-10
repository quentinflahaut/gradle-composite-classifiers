
This is a project to demonstrate how Gradle Composite builds have issue with classifiers.

Project A provides abstract test classes that project B wants to use in its tests.

With the composite builds turned off (projectB/settings.gradle includeBuild being commented out), we can first publish projectA to maven local

`cd projectA && ./gradlew publishToMavenLocal`

and project B will build fine

`cd ../projectB && ./gradlew build`

However if we uncomment the line in `projectB/settings.gradle`, and try to build projectB, we will see:

```
~/gradle-composite-classifiers/projectB:$ gw build

> Task :compileTestJava FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileTestJava'.
> Could not resolve all files for configuration ':testCompileClasspath'.
   > Could not find projectA-tests.jar (project :projectA).

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 0s
3 actionable tasks: 1 executed, 2 up-to-date
```