# Robolectric SDK Load Test PoC

Proof of concept illustrating OOM issue when loading many Robolectric SDKs.

## Steps to run

```sh
./gradlew test
```

On crash a `.hprof` file will be generated in `./app/`

## Results

Tests for SDK 21-27 pass, the remainder get OOM exceptions.
