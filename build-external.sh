#!/bin/bash
ext_folder=ext/
ext_jar=${ext_folder}/spigot-1.12.2.jar
template_jar=templates/1_12_R1.jar
if [ ! -f ${template_jar} ]; then
  mkdir $ext_folder
  cd $ext_folder
  curl "https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar" -o BuildTools.jar
  java -jar BuildTools.jar --rev 1.12.2
  cd ..
  cp ${ext_jar} ${template_jar}
fi
