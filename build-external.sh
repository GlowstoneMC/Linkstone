#!/bin/sh
mkdir ext
cd ext
curl "https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar" -o BuildTools.jar
java -jar BuildTools.jar --rev 1.12.2
cd ..
cp ext/spigot-1.12.2.jar templates/1_12_R1.jar
