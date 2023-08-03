Project Name: Hepsiburada App Automation with Appium 2.0.1

Description:
This project demonstrates automated testing of Hepsiburada mobile application using Java 20 and Appium 2.0.1. It uses Maven repositories to manage dependencies and build processes.

Contents:
1. src/ - Contains the Java source code for automated tests.
2. config/ - Contains the configuration properties files.
3. pom.xml - Maven Project Object Model file for managing dependencies.
4. README.md - Detailed project documentation.
5. Other project-related files.

Getting Started:
1. Clone this repository to your local machine.
2. Set up your Appium environment and ensure Appium server (2.0.1) is running.
3. Update device, device connection, and app information in the configuration.properties file located in the 'config/' directory.
4. Use Maven to build and run the tests using the command: `mvn clean test`.

Configuration:
Don't forget to update the following information in the 'config/configuration.properties' file:
- deviceName: Name of the target device or emulator.
- platformName: Mobile platform (e.g., Android, iOS).
- platformVersion: Version of the mobile platform.
- appPath: Path to the application (APK or IPA) to be tested.
- Other relevant configuration settings.

Dependencies:
- Java 20
- Appium 2.0.1
- Maven

NOTE:
- **This project has been created for Android mobile platforms only for now.** (Work is underway for iOS mobile platforms.)
- **Potential compatibility issues may arise due to different versions of Maven repositories. You can experiment by updating the versions.
  However, keep in mind that each new version contains bug fixes, improvements, and changes. 
  Choosing different versions may lead to errors in different parts of the project.**
- Make sure you have the necessary environment setup before running the tests.
- Keep your Appium server and devices/emulators ready.
- Update the 'configuration.properties' file with accurate information before running tests.

For any issues or questions, please contact [feyza.haktanir@hotmail.com].

Happy testing!
