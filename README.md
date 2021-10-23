We can package our Java application into a **JAR** file, but if the project contains some executable code *IntelliJ* unfortunately does not include the main class name in the JAR's manifest and for so, our JAR is not an executable one and we could not run the application with *java -jar* command.

For achieving this we have to add some lines to our ***POM.xml*** project file, more specifically into the **project·build·plugins** section: 

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-dependency-plugin</artifactId>
	<executions>
		<execution>
			<id>copy-dependencies</id>
			<phase>prepare-package</phase>
			<goals>
				<goal>copy-dependencies</goal>
			</goals>
			<configuration>
				<outputDirectory>${project.build.directory}/libs</outputDirectory>
			</configuration>
		</execution>
	</executions>
</plugin>

<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-jar-plugin</artifactId>
	<configuration>
		<archive>
			<manifest>
				<addClasspath>true</addClasspath>
				<classpathPrefix>libs/</classpathPrefix>
				<mainClass>FQN main class</mainClass>
			</manifest>
		</archive>
	</configuration>
</plugin>
```
The only thing you must change in your ***POM.xml*** is the **FQN main class** with the fully qualified name of your project's main class.

The solution has been obtained reading [this web page](https://www.baeldung.com/executable-jar-with-maven).