# Project Template

This is a Java Maven Project Template

-My name is Mingjia Gong. This is my homework1 of Met CS 665.

-This project simulates the process of a user buying a drink from a vending machine.
 User can choose different amount and different kinds of drink, then input 'Checkout' to buy drinks.
 User can input 'Cancel' to cancel a purchase.

-This implementation is real flexible. If you want to add a new kind of coffee or tea, 
 you only need to create a new class extends Coffee or Tea to set the base price, 
 and add this drink to VendingMachine, then users can buy it.
 If you want to remove some drink, just remove those I mentioned above.
 If you want to change the price of milk and sugar, only need to change them in the coffee class.

-My implementation is really easy to understand.
 I use Espresso, Americano, and LatteMacchiato to create a Coffee instance.
 I use BlackTea, GreenTee and YellowTea to create a Tes instance.
 All the Coffee can add sugar and milk, while Tea can not. 
 Different kinds of drink have different base price.
 Sugar and milk for an additional charge
 Finally I use VendingMachine claas to simulate the process of a user buying a drink.

-I use abstract class and functions to avoided duplicated code.

-Run the Main in machine folder, then input which drink do you want.
 If you order Coffee, input the sugar level and milk level.
 Finally, input 'Checkout' to buy drinks, or input 'Cancel' to cancel a purchase.




# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




