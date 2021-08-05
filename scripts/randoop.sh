#!/usr/bin/env bash

JAVA_CP=$1
JAVA_CLASS=$2


echo "INPUTS:"
echo "======="
echo "  RANDOOP_PATH set to: $RANDOOP_PATH"
echo "  RANDOOP_JAR  set to: $RANDOOP_JAR"
echo "  JAVA CP set to: $JAVA_CP"
echo "  JAVA Class set to: $JAVA_CLASS"

java -cp "$RANDOOP_JAR:$JAVA_CP" randoop.main.Main gentests --testclass=$JAVA_CLASS --time-limit=10