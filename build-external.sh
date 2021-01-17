#!/bin/bash
target=spigot-1.12.2.jar
ext_folder=ext/
ext_jar=${ext}${target}
template_jar=templates/${target}
if [ ! -f ${template_jar} ]; then
  mkdir $ext_folder
  cd $ext_folder
  curl "https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar" -o BuildTools.jar
  java -jar BuildTools.jar --rev 1.12.2
  cd ..
  cp ${ext_jar} ${template_jar}
fi
