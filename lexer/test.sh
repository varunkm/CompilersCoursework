#!/bin/bash

lexfile=$1
textfile=$2

jflex $lexfile
javafile=$(ls -t *.java | head -n 1)
javac $javafile
classfile=${javafile/.java/}
java $classfile $textfile
