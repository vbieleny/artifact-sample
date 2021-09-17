To generate Maven artifact in `mavenLocal` on Linux/macOS, run Gradle command
```shell
./gradlew library:publishToMavenLocal
```
On Windows run
```shell
gradlew library:publishToMavenLocal
```

Generated artifact is stored in default location depending on OS
- Linux/macOS: `~/.m2/repository`
- Windows: `%USERPROFILE%\.m2\repository`

To run an app that uses this generated artifact, run on Linux
```shell
./gradlew app:run
```
and on Windows
```shell
gradlew app:run
```
