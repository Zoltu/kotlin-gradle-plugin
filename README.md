[![Build Status](https://ci.appveyor.com/api/projects/status/qhrkr8hwohe1lsba?svg=true)](https://ci.appveyor.com/project/Zoltu/kotlin-gradle-plugin)

# _*Deprecated!*_
Jetbrain has released an official version of the Kotlin plugin on [plugins.gradle.org](https://plugins.gradle.org/search?term=org.jetbrains.kotlin).  The one in particular that replaces this plugin is [org.jetbrains.kotlin.jvm](https://plugins.gradle.org/plugin/org.jetbrains.kotlin.jvm).

I'm leaving this repo up for now to give people time to migrate, but I will no longer be updating this plugin to new versions of Kotlin and will eventually delete this repo and the Gradle Plugin.

# kotlin-gradle-plugin
An unofficial release of the official Kotlin Gradle Plugin on [plugins.gradle.org](https://plugins.gradle.org/plugin/com.zoltu.kotlin).  The only reason this exists is because JetBrains doesn't yet publish the kotlin plugin to [plugins.gradle.org](https://plugins.gradle.org).  Once https://youtrack.jetbrains.com/issue/KT-5756 is resolved, this plugin will no longer be necessary.

## Maintenance

### Syncing with Official Plugin Version

Change [this line](https://github.com/Zoltu/kotlin-gradle-plugin/blob/master/build.gradle#L8) to match the current release of the official kotlin plugin publised to [maven central](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.jetbrains.kotlin%22%20AND%20a%3A%22kotlin-gradle-plugin%22).

### Contributing

PRs welcome.  The only thing to really contribute is bumping the version number (see above).  If you submit a PR that updates the version to match the latest official version I'll likely accept pretty quickly and the CI server should get a new version out within a few minutes.
