# Spring-Programs
- This repository is a collection of Spring Core programs demonstrating key concepts of the Spring Framework. 

- Each folder contains an independent Java program that focuses on a particular Spring feature such as dependency injection, autowiring, bean scopes, property configuration and annotation-based configuration.

----------------------------------------------------------------

📂 Project Structure

The repository is organized into multiple directories, each representing a specific concept or demo:

Spring Core programs/

│

├─ AnnotationDemo/ # Basic annotation-based configuration

├─ AnnotationWithJavaDemo/ # Pure Java-based configuration

├─ AnnotationWithXMLDemo/ # Using XML + annotations

├─ Autowiring_using_XML/ (1,2,3...) # Autowiring examples with XML configs

├─ AutowiringUsingAnnotations1..4/ # Autowiring with annotations

├─ Circular_DI/ # Circular dependency injection demo

├─ Constructor_DI_using_JavaConfigFile # Constructor injection using Java config

├─ DI_In_Core_Java/ # Plain core Java DI (no Spring)

├─ DI_IN_Spring_setterMethods/ # Setter-based dependency injection

├─ DI_IN_Spring_using_constructor/ # Constructor-based DI in Spring

├─ JavaConfigDemo/ & JavaConfig_ScopeDemo/

│ # Java configuration and scope examples

├─ PropertyConfiguration* # Property injection via XML/Java/Constructor

├─ PrototypeBeanScope/ # Prototype vs singleton bean scope

├─ Setter_DI_using_JavaConfigFile/ # Setter DI using Java config

├─ Simple/ # Minimal Spring context demo

├─ SingletonBeanScope/ # Singleton bean scope example

├─ SpringProgram1/, SpringProgram2/ # General sample Spring applications

├─ p_namespace1

├─ p_namespace2

├─ c_namespace1

└─ c_namespace2

----------------------------------------------------------------

**Each folder is self-contained and includes:**
- Java source files
- Spring configuration files (`.xml` or JavaConfig classes)
- `lib/` (if any) with required jars or Maven dependencies

----------------------------------------------------------------

**🧩 Key Concepts Covered**

- **Dependency Injection (DI)**: Setter, constructor, and interface-based injection.
- **Autowiring**: XML-based and annotation-driven autowiring.
- **Bean Scopes**: Singleton vs Prototype.
- **Property Configuration**: Externalized configuration using properties files.
- **Annotations vs XML**: Migrating from XML config to Java-based annotations.
- **Namespaces**: `p` and `c` namespace usage for concise bean definitions.
- **Circular Dependency Handling**.

----------------------------------------------------------------

**🛠 Prerequisites**

- **Java**: JDK 8 or higher
- **Spring Framework**: Core container (version 5.x recommended)
- **Build tool:** Maven or you can add Spring JARs manually to classpath.

----------------------------------------------------------------

**🚀 How to Run Any Example**

1️⃣ Clone the Repository

Open a terminal (or Git Bash).

Choose a folder on your computer and run:
```bash

git clone https://github.com/shruti0731/Spring-Programs.git
```

After cloning, you’ll have a local folder named Spring-Programs that contains all the example projects.

2️⃣ Open in Eclipse

Launch Eclipse IDE and select any workspace.

Go to File ▸ Import… ▸ Existing Projects into Workspace.

In the dialog:

Choose Select root directory and browse to the cloned folder Spring-Programs.

Check the specific example folders you want to open (e.g., AnnotationDemo, DI_IN_Core_Java, etc.).

Click Finish.
Each selected folder will now appear as a separate project in the Package Explorer.


4️⃣ Run an Example

In Package Explorer, open the project and locate the class containing
```bash

public static void main(String[] args)

```
(for example, MainApp.java or App.java).

Right-click that class → Run As → Java Application.

Check the output in Eclipse’s Console view.

----------------------------------------------------------------

**🔁 Repeat for Other Folders**

Each folder inside Spring-Programs is an independent example.

Import and run any folder you like by repeating the steps above.

----------------------------------------------------------------


**Author**

**Shruti Chavan.**
