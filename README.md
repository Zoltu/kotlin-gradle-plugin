[![Build Status](https://ci.appveyor.com/api/projects/status/qhrkr8hwohe1lsba?svg=true)](https://ci.appveyor.com/project/Zoltu/kotlin-gradle-plugin)

# kotlin-gradle-plugin
An unofficial release of the official Kotlin Gradle Plugin on [plugins.gradle.org](https://plugins.gradle.org/plugin/com.zoltu.kotlin).  The only reason this exists is because JetBrains doesn't yet publish the kotlin plugin to [plugins.gradle.org](https://plugins.gradle.org).  Once https://youtrack.jetbrains.com/issue/KT-5756 is resolved, this plugin will no longer be necessary.

## Maintenance

### Syncing with Official Plugin Version

Change [this line](https://github.com/Zoltu/kotlin-gradle-plugin/blob/master/build.gradle#L8) to match the current release of the official kotlin plugin publised to maven central.

### Contributing

PRs welcome.  The only thing to really contribute is bumping the version number (see above).  If you submit a PR that updates the version to match the latest official version I'll likely accept pretty quickly and the CI server should get a new version out within a few minutes.
