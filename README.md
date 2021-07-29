# Code assignment Backend Chapter - Vei Sheng Ong
This project is about the code assignment of Singtel.


# Getting Started

This is an example of how you may give instructions on setting up your project locally. To get a local copy up and running follow these simple example steps.

### Reference Documentation
For further reference, please consider the following sections:
* [Getting Start with Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#using-boot-devtools)
* [Lombok](https://projectlombok.org/)

### Prerequisites
```
Eclipse / IntelliJ IDE
JAVA JDK 11
Spring Boot Application
JUnit 5
Maven
Lombok
```
### Installing
```
Eclipse IDE - import the Project as JAVA Project and add the dependencies(if required) 
```
### Running the tests

* Complete solution for the code assignment
<ol>
	<li>Click on <strong><i>src/test/java</i></strong> to expand</li>
	<li>Click on <strong><i>com.assignment.singtel</i></strong> to expand</li>
	<li>Select and right click <strong><i>SolutionTest.java</i></strong></li>
	<li>Run As Junit Test</li>
</ol>

### Opinionated solutions used to solved the code assignment

<ol>
	<li>By using Junit test to unit test each business logic created and check the unit test code coverage</li>
	<li>Created Animal.class as super class which consist of type boolean <i>walk</i>, <i>fly</i>, <i>sing</i>, and <i>swim</i></li>
	<li>Created Bird.class as extends of Animal.class, and using @Override to override <i>isWalk</i>, <i>isFly</i>, and <i>isSing</i></li>
	<li>Created Chicken.class as extends of Bird.class, and using @Override to override <i>isFly</i>, and <i>isSing</i></li>
	<li>Created Duck.class as extends of Bird.class, and using @Override to override <i>isSwim</i>, and <i>isSing</i></li>
	<li>Created Rooster.class as extends of Chicken.class, and using @Override to override <i>isFly</i>. Create a new method sing required language parameters to cater for different languages in the bonus question. Various languages for Rooster is handle by using HashMap.</li>
	<li>Parrot.class is created with livingWith() method which consist of switch case, and enum constant of sounds sing by various animals. Thus, if in future whenever there is other parrots living with others animal, we just required to add the switch case condition and enum constant of sounds and enum animal type.</li>
	<li>Created Fish.class as extends of Animal.class, and using @Override to override <i>isWalk</i>, <i>isSwim</i>, and <i>isSing</i></li>
	<li>Created Shark.class as extends of Fish.class, and using @Override to override <i>isSwim</i>, created FishCriteriaService.class as interface, and FishCriteriaServiceImpl.class implements the business logic of service class. In the FishCriteriaServiceImpl.class will consist of the logic set for the criteria of Shark, Clownfish, and Dolhpin.</li>
	<li>Created Clownfish.class, and Dolhpin.class as extends of Fish.class, and using @Override to override <i>isSwim</i>, use FishCriteriaService.class and FishCriteriaServiceImpl.class to handle the behaviour/criteria.</li>
	<li>Created Butterfly.class as extends of Animal.class, and using @Override to override <i>isFly</i>, <i>isSing</i>, and <i>isWalk</i>. In the method of <i>isFly</i>, <i>isWalk</i> handled the verification of isCaterpillar or not.</li>
	<li>Created the Animal[] consists of the list of various animals, and called the AnimalUtil.class as Utility class to count via for loop to get the result of total fly, swim, sing, and walk animal</li>
	<li>Created the HashMap to handle different native language of Rooster</li>
	<li>Created a AnimalsController.java as a rest controller for the RESTful API, created AnimalDetailsService.class as the interface class, and AnimalDetailsServiceImpl which consisted the implementation business logic.</li>
	<li>The RESTful api will be https://localhost:8080/animal/details?type=all which will display all type of animal behaviour/criteria whether is flyable, swimable, singable, or walkable. If only want to query one type animal behaviour/criteria also can just by change the parameter <strong>?type=bird</strong> for e.g bird behaviour/criteria will be returned.</li>
</ol>
		
### Eclipse

<ol>
  <li>From the <strong>File</strong> menu, select <strong>Import</strong>.<br></li>
  <li>Expand <strong>Maven</strong> and select <strong>Existing Maven Projects</strong>.<br></li>
  <li>Click <strong>Next</strong>.</li>
  <li>For <strong>Root Directory </strong>, click <strong>Browse</strong> and select the top-level project folder.<br></li>
  <li>Verify that the <strong>Projects</strong> list includes all subprojects and click <strong>Finish</strong>.</li>
  <li>If want to run the project:
    <ol>
      <li>Right-click the parent project folder.</li>
      <li>Select <strong>Run As</strong>, <strong>Spring Boot App</strong></li>
    </ol>
  </li>
</ol>

### Built With

* [Eclipse IDE ](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-win64.exe) - IDE for JAVA

### Author
[Vei Sheng Ong](mailto:veisheng1013@gmail.com?subject=[GitHub]%20Code%20Assignment%20of%20Singtel)
