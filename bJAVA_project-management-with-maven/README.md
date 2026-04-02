sudo apt install maven

mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes \
                       -DarchetypeArtifactId=maven-archetype-quickstart \
                       -DarchetypeVersion=1.5 \
                       -DgroupId=com.example \
                       -DartifactId=bJAVA_project-management-with-maven \
                       -Dversion=1.0-SNAPSHOT \
                       -DinteractiveMode=false

+ Compile all   : mvn compile
+ Run Main      : java -cp target/classes com.example.App