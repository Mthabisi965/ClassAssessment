# ClassAssessment

A Java 21 Maven project containing a starter `Main` program and a Selenium browser factory.

## Requirements

- JDK 21
- Apache Maven
- A supported browser (Chrome, Firefox, or Microsoft Edge) to use `BrowserFactory`

## Build and run

Compile the main application:

```bash
mvn compile
```

Run the starter program from your IDE by launching `org.example.Main`, or from the project root after compiling:

```bash
java -cp target/classes org.example.Main
```

## Browser factory

`utils.BrowserFactory.startBrowser(browserChoice, url)` creates and maximizes a browser window, navigates to the supplied URL, and returns its Selenium `WebDriver`. It selects Chrome or Firefox for those browser names and Edge otherwise.

The factory imports Selenium, but Selenium is not currently declared as a dependency in `pom.xml`. Add the Selenium Java dependency before compiling or running the factory. The matching browser and driver must also be available in the environment.
