# Android Flavor Demo App

Welcome to the Android Flavor Demo App repository! This Android application is designed to demonstrate the use of build flavors and types. The app comes in four delicious flavors: chocolate, vanilla, strawberry, and butterscotch. Additionally, there are two build types: release and debug.

## Build Configurations

### Build Flavors

- **Chocolate Flavor**
  - Specific drawable resources are available in the `src/chocolate/res/drawable` folder.
  - Additional strings are configured in `build.gradle` using build config fields.
  - The build flavor name is accessible in the code via `BuildConfig.BuildFlavourName`.

- **Vanilla Flavor**
  - Specific drawable resources are available in the `src/vanilla/res/drawable` folder.
  - Additional strings are configured in `build.gradle` using build config fields.
  - The build flavor name is accessible in the code via `BuildConfig.BuildFlavourName`.

- **Strawberry Flavor**
  - Specific drawable resources are available in the `src/strawberry/res/drawable` folder.
  - Additional strings are configured in `build.gradle` using build config fields.
  - The build flavor name is accessible in the code via `BuildConfig.BuildFlavourName`.

- **Butterscotch Flavor**
  - Specific drawable resources are available in the `src/butterscotch/res/drawable` folder.
  - Additional strings are configured in `build.gradle` using build config fields.
  - The build flavor name is accessible in the code via `BuildConfig.BuildFlavourName`.

### Build Types

- **Release Build**
  - Optimized for release with minification, code shrinking, and other performance enhancements.

- **Debug Build**
  - Unoptimized build for debugging with additional logging and debugging information.

## How to Build

To build a specific flavor and type, use the following command:
Select a build type and rebuild the project.

