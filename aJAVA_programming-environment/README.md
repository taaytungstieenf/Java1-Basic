aJAVA_programming-environment
|
|_______bin
|		|_______com
|				|_______example
|						|_______partAjavaBaisc
|						|		|_______basic.class
|						|_______partBjavaIntermediate
|						|		|_______intermediate.class
|						|_______partCjavaAdvanced
|								|_______advanced.class
|
|_______src
|		|_______com
|		|		|_______example
|		|				|_______partAjavaBaisc
|		|				|		|_______basic.java
|		|				|_______partBjavaIntermediate
|		|				|		|_______intermediate.java
|		|				|_______partCjavaAdvanced
|		|						|_______advanced.java
|		|
|		|_______Main.java
|
|_______README.md


+ Compile all	: 	javac -d bin src/com/example/Main.java 
			  		javac -d bin src/com/example/partAjavaBasic/basic.java 
			  		javac -d bin src/com/example/partBjavaIntermediate/intermediate.java
			  		javac -d bin src/com/example/partCjavaAdvanced/advanced.java

+ Run Main		: 	java -cp bin com.example.Main