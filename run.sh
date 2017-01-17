#!bin/bash
#run java code from command line

if [ $# -eq 0 ]
	then echo "Missing class file"
fi

echo "Compiling..." $1
javac $1.java && java $1
echo "Running..."
