# 📝 Logging with AOP in Java

This is a simple Java project that demonstrates how to use Aspect-Oriented Programming (AOP) to implement logging in a Java application. The project provides a sample implementation of a logging aspect that can be applied to methods in your code to log their execution time.

## 🚀 Getting Started

To get started with this project, simply clone the repository to your local machine and import the project into your favorite Java IDE. Once the project is imported, you can run the Main class to see the logging aspect in action.

```bash
git clone https://github.com/firattamur/aop-annotations-java
```

## 💻 Implementation Details

The logging aspect in this project is implemented using the AspectJ library. Specifically, the `logExecutionTime()` method in the `LoggingAspect` class is annotated with the `@Around` annotation, which allows it to intercept the execution of methods in your code.

The `logExecutionTime()` method calculates the execution time of the intercepted method and logs it using a simple logger that writes to the console. To apply the logging aspect to a method in your code, you simply need to annotate the method with the `@LogMethod` annotation.

## 📝 Example Usage

To apply the logging aspect to a method in your code, simply annotate the method with the `@LogMethod` annotation. You can also specify a custom message to be logged along with the execution time by setting the message attribute of the annotation. For example:

```java
@LogMethod(message = "Executing myMethod")
public void myMethod() {
    // ... method implementation ...
}
```

When you run your application, the logExecutionTime() method in the LoggingAspect class will intercept the execution of myMethod() and log the execution time along with the custom message "Executing myMethod".

## 📄 License

This project is licensed under the MIT License.
