#!bin/bash
#run java code from command line

src="src/"

if [ $# -eq 0 ]
	then echo "Missing class file"
fi

echo "Compiling..." $1
javac $src$1.java && java $src$1
echo "Running..."
