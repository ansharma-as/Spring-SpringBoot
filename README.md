# Java Learning Repository

A comprehensive Java learning repository containing fundamental concepts, object-oriented programming examples, data structures & algorithms, and practical Spring Boot projects.

## 📁 Repository Structure

```
Java/
├── Basics/              # Java Fundamentals
├── OOPS/               # Object-Oriented Programming
├── DSA/                # Data Structures & Algorithms
└── Projects/           # Spring Boot Projects
    ├── LearningAPIs/   # REST API Learning Project
    └── first-project/  # First Spring Boot Application
```

## 📚 Contents

### 🔤 Basics
Contains fundamental Java programming concepts and basic examples:
- `hello.java` - Basic "Hello World" program
- Compiled class files for quick execution

### 🎯 OOPS (Object-Oriented Programming)
Object-oriented programming concepts and implementations:
- `main.java` - Main class demonstrations
- `Person.class` - Person class implementation
- Core OOP principles examples

### 🧮 DSA (Data Structures & Algorithms)
*Ready for future content*
- Data structure implementations
- Algorithm practice problems
- Coding challenge solutions

### 🚀 Projects

#### LearningAPIs
A Spring Boot REST API project for learning backend development:
- **Framework**: Spring Boot
- **Build Tool**: Gradle
- **Features**: 
  - Student management API
  - RESTful endpoints
  - DTOs and Controllers
- **Key Files**:
  - `StudentController.java` - REST endpoints
  - `StudentDto.java` - Data transfer objects

#### first-project
Initial Spring Boot application exploring core concepts:
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Features**:
  - Basic routing
  - Payment service interfaces
  - Service abstraction examples
- **Key Files**:
  - `GetRoute.java` - Basic routing
  - `PaymentService.java` - Payment interface
  - Implementation classes for Razorpay and Stripe

## 🛠️ Technologies Used

- **Java** - Core programming language
- **Spring Boot** - Web application framework
- **Gradle** - Build automation (LearningAPIs)
- **Maven** - Dependency management (first-project)

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- Gradle 7.0+ (for LearningAPIs)

### Running the Projects

#### LearningAPIs (Gradle)
```bash
cd Projects/LearningAPIs
./gradlew bootRun
```

#### first-project (Maven)
```bash
cd Projects/first-project
./mvnw spring-boot:run
```

### Running Basic Java Files
```bash
cd Basics
javac hello.java
java Hello
```

## 🎯 Learning Objectives

This repository covers:
- ✅ Java syntax and fundamentals
- ✅ Object-oriented programming principles
- 🔄 Data structures and algorithms (in progress)
- ✅ Spring Boot web development
- ✅ REST API development
- ✅ Build tools (Maven & Gradle)

## 📈 Progress Tracking

- [x] Basic Java concepts
- [x] OOP implementations
- [x] Spring Boot setup
- [x] REST API development
- [ ] Data structures implementation
- [ ] Algorithm practice
- [ ] Advanced Spring features
