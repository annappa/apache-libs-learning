## Some learnig LINKS
[Jornal Dev - Log4j Tutorial](https://www.journaldev.com/10718/log4j-xml-example-configurations)

[Accessing log4j.properties from outside a WAR](https://dennisegert.wordpress.com/2013/04/18/accessing-log4j-properties-from-outside-a-war/)

[Java Log4j tutorial](http://zetcode.com/java/log4j/)

[Few Tutorials](http://zetcode.com/all/#java)


## Log4j components
```
Log4j has three main components: loggers, appenders, and layouts. 

Loggers are named destinations that capture log messages and send them to appenders. 
Appenders deliver log messages to their destinations, such as files, sockets, or consoles. 
Layouts are used to define the formatting of log messages.
```

## Root logger

Log4j has a specific built-in logger called the root looger. It sits at the top of the hierarchy and is always present, even if not configured. It writes messages for all classes in the application. If we do not want messages from a specific logger to be passed to the root logger, we change the additivity attribute of the looger to false.

## Package specific logging
We may want to limit logging to some Java package. In case of XML configuration, we set the package specific logging with the name attribute.

<Logger name="com.zetcode.work" level="info" additivity="false" >
    <AppenderRef ref="MyFile" />
</Logger>

## Log4j event levels
Levels are used for identifying the severity of an event. Levels are organized from most to least specific:

OFF - most specific, no logging
FATAL - severe errors that will prevent the application from continuing; very specific, little data
ERROR - serious errors, possibly recoverable
WARN - potentionally harmful messages
INFO - informational messages
DEBUG - general debugging events
TRACE - fine-grained debug messages, typically capturing the flow through the application; little specific, a lot of data
ALL - least specific, all data

```
FATAL: shows messages at a FATAL level only  
ERROR: Shows messages classified as ERROR and FATAL  
WARNING: Shows messages classified as WARNING, ERROR, and FATAL  
INFO: Shows messages classified as INFO, WARNING, ERROR, and FATAL  
DEBUG: Shows messages classified as DEBUG, INFO, WARNING, ERROR, and FATAL  
TRACE : Shows messages classified as TRACE,DEBUG, INFO, WARNING, ERROR, and FATAL
ALL : Shows messages classified as TRACE,DEBUG, INFO, WARNING, ERROR, and FATAL 
OFF : No log messages display
```