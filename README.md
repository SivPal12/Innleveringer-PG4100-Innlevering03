PG4100-Innlevering03
====================
Setup

==

Eclipse

--

This readme is written for Eclipse Kepler (eclipse-standard-kepler-SR2-win32-x86_64). Other versions might work as well.


- Install maven (3.2.1)

- Add plugin "Maven Integration for Eclipse WTP (Juno) 1.0.1" to eclipse

- Point eclipse to external maven (Prefs->Maven->Installations)

- Import Maven project in Eclipse

- Edit Eclipse build path for current project to use Java 1.7


If you whant to run the app inside Eclipse you need to change your execution environment to a JDK, otherwise you will get an error like "PWC6345: There is an error in invoking javac" when compiling '.jsp's:

 - Eclipse -> Preferenses
 - Java-Installed JREs -> Add a JDK (1.7). No need to toggle it.
 - Java-Installed JREs-Execution Environments -> Select Java 1.7 and enable the JDK in 'Compatible JREs'


Sources
==
http://kielczewski.eu/2013/11/using-embedded-jetty-spring-mvc/
