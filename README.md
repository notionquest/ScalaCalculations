# ScalaCalculations

#####Functionalities:
1. Calculate the cube for an integer
2. Calculate the factorial for an integer
3. Count the number of each unique words in a text file

#####Assumptions:
1. Integer overflow condition need not be handled

#####To compile, package and run the tests of ScalaCalculations application:
	mvn clean package assembly:single
  
  **Unit Tests execution result**
  
  ![Image of unit test](https://github.com/notionquest/ProjectDocumentation/blob/master/Images/ScalaCalculationApp_UnitTests.JPG)
  
#####To execute the ScalaCalculations App:  
	scala target\ScalaCalculations-jar-with-dependencies.jar
  
#####Sample Outputs:
![Image of word count](https://github.com/notionquest/ProjectDocumentation/blob/master/Images/ScalaCalculationApp_sample_output.JPG)

#####Files:
1. CalcTest - Main application file
2. CalculateUtils - Has cube and factorial functions
  
#####Technology Stack:
1. Scala
2. Maven - Build
3. JUnit and ScalaTest - Unit Testing