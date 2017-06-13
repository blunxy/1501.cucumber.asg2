javac implementation/*.java
javac -cp "jars/*;." step_definitions/*.java 
java -cp "jars/*;." cucumber.api.cli.Main -p progress --snippets camelcase -g step_definitions features
