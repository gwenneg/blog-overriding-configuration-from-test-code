## What is this repo?

Overriding the configuration of a Quarkus app from its test code is often required to achieve a good test coverage.
Whenever a config property determines how the app behaves, all possible config values need to be tested.

```java
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class MyService {

    @ConfigProperty(name = "new-feature-enabled", defaultValue = "false")
    boolean newFeatureEnabled;

    public void doSomething() {
        if (newFeatureEnabled) {
            // This branch needs to be tested.
        } else {
            // So does that branch.
        }
    }
}
```

In my Quarkus blog post entitled [Overriding the configuration of a Quarkus app from its test code](https://quarkus.io/blog/overriding-configuration-from-test-code/), you will find five ways to override the configuration from the test code.

This repository contains a Maven module dedicated to each of the approaches mentioned in the blog post.

## How do I use it?

This is a Maven multi-module project.

You can build and test everything with a single command: `./mvnw clean install -Pnative`.

Or you can only build the module you're interested in:

- `./mvnw clean install -pl :component-test`
- `./mvnw clean install -pl :constructor-injection`
- `./mvnw clean install -pl :inject-mock`
- `./mvnw clean install -pl :system-property`
- `./mvnw clean install -pl :test-profile`

If you're interested in building and testing in native mode, you just need to add `-Pnative` to the Maven command.
