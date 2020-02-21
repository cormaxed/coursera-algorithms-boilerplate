# coursera-algorithms-boilerplate
A boiler plate project for the Princeton [algorithms](https://www.coursera.org/learn/algorithms-part1) Coursera. 

The project:
* Runs Checkstyle, PMD and FindBugs checks
* Includes JUnit 5 support
* Packages source code for submission using the maven assembly plugin 

Checkstyle and FindBugs checks were sourced from the following [repo](https://github.com/mkordas/algorithms-coursera/tree/master/config/findbugs).

## Running tests

```
mvn clean test
```

ExampleExerciseTest provides sample code to load the test text files typically used in the course.


## Building a grader submission 

```
mvn clean package
```

The build will create the following zip ```target.nosync/algorithms-ex-1-src.zip```. The outfile name is configured with the ```artifactId``` and ```version``` tags in ```pom.xml```

