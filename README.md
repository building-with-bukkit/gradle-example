# Gradle Example
Simple example using Gradle

# Structure
The following files are generated by gradle:

```bash
├── LICENSE # The LICENSE file is optional, but you should include a license with your project!
├── README.md # This is the file you are reading right now!
├── build.gradle # This is where you can modify the build script.
├── gradle # This folder has the gradle wrapper files, don't modify it. It allows using gradle without installing it.
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew # Launches gradle wrapper on linux, don't modify it. It allows using gradle without installing it.
├── gradlew.bat # Launches gradle wrapper on windows, don't modify it. It allows using gradle without installing it.
├── settings.gradle # Gradle settings. Take a peek! 
└── src # Your main sources directory
    └── main
        ├── java # Put your main package and java code here.
        └── resources # Put files you want to be copied into the jar here (like plugin.yml).
 ```
 
# Importing into your IDE
 
After you download a copy of the project you will have to let your IDE know that it is a gradle project! 

## Eclipse

Go to File -> Import -> Gradle -> Existing Gradle Project
 
![](https://media.giphy.com/media/3ov9jUtH9W8mYowCc0/giphy.gif)

If you change the directory from `gradle-example` remember to update it in your `settings.gradle` file before you import!

## IntelliJ

You should also be able to import the project as a Gradle project. 

Instructions coming soon. 

