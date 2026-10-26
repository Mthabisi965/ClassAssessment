# ClassAssessment

A Java 21 Maven project containing a starter `Main` program and a Selenium browser factory.

## Dependencies and requirements

- JDK 21 and Apache Maven
- Selenium Java for browser automation
- TestNG for tests
- Apache POI OOXML for working with Excel `.xlsx` files
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

`utils.BrowserFactory.startBrowser(browserChoice, url)` creates and maximizes a browser window, navigates to the supplied URL, and returns its Selenium `WebDriver`. It selects Chrome or Firefox for those browser names and Edge otherwise. The matching browser and driver must be available in the environment.
