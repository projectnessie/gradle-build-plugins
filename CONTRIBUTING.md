# Contributing to Nessie
## How to contribute
Everyone is encouraged to contribute to this project. We welcome of course code changes, 
but we are also grateful for bug reports, feature suggestions, helping with testing and 
documentation, or simply spreading the word about [projectnessie](https://github.com/projectnessie/).

Please use [GitHub issues](https://github.com/projectnessie/gradle-build-plugins/issues) for bug reports and
feature requests and [GitHub Pull Requests](https://github.com/projectnessie/gradle-build-plugins/pulls) for code
contributions.

More information are available at https://projectnessie.org/develop/

## Code of conduct
You must agree to abide by the Project Nessie [Code of Conduct](CODE_OF_CONDUCT.md).

## Reporting issues
Issues can be filed on GitHub. Please add as much detail as possible. Including the 
version and a reproducer. The more the community knows the more it can help :-)

### Feature Requests

If you have a feature request or questions about the direction of the project please as via a 
GitHub issue.

### Large changes or improvements

We are excited to accept new contributors and larger changes. Please post a proposal 
before submitting a large change. This helps avoid double work and allows the community to arrive at a consensus
on the new feature or improvement.

## Code changes

### Developing changes to the plugins

There are no integration tests in all the plugins in this repository.

To verify that changes to the plugins in this repository work, add an `includeBuild()` to for example
the [Nessie's `settings.gradle.kts`](https://github.com/projectnessie/nessie) file like this above
the `pluginManagement` section.

```kotlin
// Adjust the path in the includeBuild directive to point to your local clone of the
// gradle-build-plugins repository.
includeBuild("../../gradle-build-plugins/")

pluginManagement {
```

### Development process

The development process doesn't contain many surprises. As most projects on github anyone can contribute by
forking the repo and posting a pull request. See 
[GitHub's documentation](https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request-from-a-fork) 
for more information. Small changes don't require an issue. However, it is good practice to open up an issue for
larger changes.

### Style guide

Changes must adhere to the style guide and this will be verified by the continuous integration build.

* Java code style is [Google style](https://google.github.io/styleguide/javaguide.html).
* Kotlin code style is [ktfmt w/ Google style](https://github.com/facebookincubator/ktfmt#ktfmt-vs-ktlint-vs-intellij).

Java + Kotlin code style is checked by [Spotless](https://github.com/diffplug/spotless)
with [google-java-format](https://github.com/google/google-java-format) during build.

#### Configuring the Code Formatter for Intellij IDEA and Eclipse

Follow the instructions for [Eclipse](https://github.com/google/google-java-format#eclipse) or
[IntelliJ](https://github.com/google/google-java-format#intellij-android-studio-and-other-jetbrains-ides),
note the required manual actions for IntelliJ.

#### Automatically fixing code style issues

Java and Kotlin code style issues can be fixed from the command line using
`./gradlew spotlessApply`.

### Submitting a pull request

Anyone can take part in the review process and once the community is happy and the build actions are passing a
Pull Request will be merged. Support must be unanimous for a change to be merged.

### Reporting security issues

Please see our [Security Policy](SECURITY.md)
