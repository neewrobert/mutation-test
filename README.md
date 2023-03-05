# Mutation Testing with Java and Pitest

This is a repository for a article that I wrote about the mutation test.

## Content 
This repository contains sample code and instructions for conducting mutation testing using Java and the Pitest mutation testing tool. The code includes a simple calculator application that performs basic arithmetic operations, and the instructions provide a step-by-step guide to setting up and running a mutation test using Pitest.


## Requirements
To use this repository, you'll need the following:

Java Development Kit (JDK) version 19 or higher
Apache Maven build tool
Pitest mutation testing tool

## Usage
To use this repository, follow these steps:


* Clone the repository to your local machine: `git clone https://github.com/neewrobert/mutation-test.git`
* Open a terminal or command prompt and navigate to the repository folder: `cd mutation-test`
* Build the application using Maven: mvn clean package
* Run the mutation test using Pitest: `mvn org.pitest:pitest-maven:mutationCoverage`
* The mutation test will generate a report in the `/target/pit-reports` folder that shows the results of the test, including the mutation score and a list of any mutations that were identified.

## Contributing
If you'd like to contribute to this repository, please fork the repository and submit a pull request.

## License
This repository is licensed under the MIT License.

## References
For more information on mutation testing and Pitest, see the following resources:

[Pitest Documentation](https://pitest.org/quickstart/basic_concepts/)

I hope you find this repository useful and informative. Happy mutation testing!
