Run the application, and open http://localhost:8080/ in a browser. (Alternatively, run the test.)

Look at the logs. There's a scary looking stack trace for a NoSuchMethodException.

SleuthAnnotationUtils#findAnnotation(...) will successfully find the NewSpan annotation for MyService#test(), 
but because it is not public, it will catch and log a NoSuchMethodException when it checks for @ContinueSpan.