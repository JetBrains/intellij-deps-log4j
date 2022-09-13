**Update[Sep 13, 2022]**: Log4j is no longer used in the IntelliJ platform.
For a drop-in replacement, please look at [reload4j](https://github.com/qos-ch/reload4j).

---

The repository contains a fork of [Apache Log4j 1.2](https://logging.apache.org/log4j/1.2/) library
with just a single change on top: removal of potentially problematic `org.apache.log4j.net` package.

Artifacts are published to the [IntelliJ dependencies](https://packages.jetbrains.team/maven/p/ij/intellij-dependencies/)
repository with coordinates `org.jetbrains.intellij.deps:log4j`. The first build from this repository has the version
`1.2.17.3`; earlier versions are manual patches of the stock .jar.
