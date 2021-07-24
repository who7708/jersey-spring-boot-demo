# jersey 项目创建

https://eclipse-ee4j.github.io/jersey/download.html

* For instance, to create a Jersey 3.0.2 application using the Grizzly 3 HTTP server container, use

> mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes \
-DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeVersion=3.0.2

* If you want to create a Servlet container deployable Jersey 3.0.2 web application instead, use

> mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes \
-DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=3.0.2

* For instance, to create a Jersey 2.34 application using the Grizzly 2 HTTP server container, use

> mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes \
-DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeVersion=2.34

* If you want to create a Servlet container deployable Jersey 2.34 web application instead, use

> mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes \
-DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=2.34

