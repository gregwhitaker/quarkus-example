# quarkus-example
Simple example of a web service implemented with [Quarkus](http://quarkus.io).

This example shows you how to build and compile a simple "Hello World" RESTful webservice using Quarkus, GraalVM, and Gradle.

## Prerequisites
This example requires that you have the [GraalVM installed](https://www.graalvm.org/docs/getting-started/#install-graalvm) on your development machine.

## Building the Example
Run the following command to build example:

    ./gradlew clean build
        
This will build the example as both an executable JAR and a native image using GraalVM.

For more detailed information check out the [Building Quarkus Apps with Gradle](https://quarkus.io/guides/gradle-tooling) documentation on the Quarkus website.

## Running the Example
Follow the steps below to run the example application:

1. Run the following command to start the native image version of the application:

2. In a new terminal, run the following command to send an HTTP request to the service:

        curl http://localhost:8080/hello?name=Bob
    
    If successful, you will see the following response in the terminal:

## License
MIT License

Copyright (c) 2019 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.