# Introduction

Generally the best resource i've found for the AP CSA exam is [Runestones CSAwesome](https://runestone.academy/ns/books/published/csawesome/index.html).

This text is a compilation of my teaching material. I make several changes to the Runestone textbook that I believe are necessary for a more holistic learning experiences :

- I tend to replace the labs, sections about the turtle class, and GUI exercises with my own material that requires students to leave the sterile environment of Runestone and code on their personal computer.
- The course has 10 chapters, I usually teach chapter 5 twice. A superficial run before teaching Chapter 2, and an in depth run in its natural order. I also add a lesson about the Scanner class after chapter 2 to allow students to build code that accepts input.

A student that wishes to do well, should attempt to run each piece of code introduced here and in the Runestone textbook in their IDE (integrated development environment of choice). 
 

## The exam

The exam is made of two parts: 40 multiple choice questions each worth ~1 point, and 4 "Free Response" questions (writing code) each worth ~10 points . A few years ago I found  this scoring scale that might be useful for students. 

![AP Scoring Scale](Resources/AP_scoring_scale.JPG)



During the exam each student will get a quick reference sheet. From my experience understanding how to extract information from this sheet is enough for a 5 on the exam. A student learning for AP CSA should print a copy of this sheet when they start their journey and have it with them at all times:

https://apstudents.collegeboard.org/ap/pdf/ap-computer-science-a-java-quick-reference_0.pdf

## Programming and Java

The following are some thoughts about Java as the programming language of choice for AP CSA.
	Many of the ideas are inspired and/or paraphrased from the following resources:
		 - The Elements of Computing Systems: Building a Modern Computer from First Principles by Noam Nisan and Shimon Schocken
		 - The CPEN 221 Teaching team at UBC 
		 - Richard Stallman

### Computing Systems

Computing Systems are incredibly complex. The process of making a functional program from an idea or thought usually involves several layers of technologies:

High-Level Language (Java) & Operating System ──> Virtual Machine ──> Assembly Language ──> Machine Language ──> Hardware Platform ──> Chips and Logic Gates ──> Physics

Learning and understanding all the layers of computing systems is border line impossible. As such, software engineers and computer scientists rely heavily on the concept of abstractions.
### Abstractions

In computer science, abstraction is the business of focusing on ‘‘what an entity does’’ and ignoring the details of ‘‘how it does it.’’ This functional description must capture all that needs to be known in order to use the entity’s services, and nothing more. All the work, cleverness, information, and drama that went into the entity’s implementation are concealed from the client who is supposed to use it, since they are simply irrelevant. The articulation, use, and implementation of such abstractions are the bread and butter of our professional practice: Every hardware and software developer is routinely defining abstractions (also called ‘‘interfaces’’) and then implementing them, or asking other people to implement them. The abstractions are often built layer upon layer, resulting in higher and higher levels of capabilities. Designing good abstractions is a practical art, and one that is best acquired by seeing many examples. 

### Object Oriented Programming

Programming paradigms are different ways of thinking about and writing programs. The main ones are:

1. **Procedural Programming**: This approach focuses on writing sequences of instructions, or steps, to perform tasks. Think of it like following a recipe where you follow each step in order.

2. **Functional Programming**: This method is all about using functions (like in math) to process data. It avoids changing things directly, which can make the code easier to understand and test.

3. **Object-Oriented Programming (OOP)**: This style of programming organizes code into "objects." These objects encapsulate data and behavior, allowing for modular, reusable, and scalable code.

In essence the encapsulation of data is a form of abstraction. By encapsulating data and methods within objects, OOP allows developers to focus on higher-level functionality without needing to understand every underlying detail. This abstraction makes it easier to manage complexity, a crucial advantage as systems grow in size and intricacy.

Java is an object-oriented language, and that's one reason it's used in the AP Computer Science A course. Learning Java will help a student get comfortable with the idea of abstractions and how they can be used to solve problems. Understanding OOP in Java will make it easier to design, implement, and understand more complex systems in the future.

### Java

Java was one of the first big object-oriented languages, but its biggest claim to fame (and probably a big reason it was chosen for AP CSA) is the Java Virtual Machine (JVM).

Essentially, when you compile a Java program, it is not run directly by the CPU, but rather it is converted to Java byte code and run by the JVM. The benefit here is not only garbage collection (so no pesky memory leaks) but also how portable Java code is. Instead of having to rewrite your code for every type of computer (Windows, Linux, MacOS, Android, etc.) if it has a version of the JVM, you can just run it without major changes. Very convenient.


### Coding vs. Programming

[Richard Stallman](https://en.wikipedia.org/wiki/Richard_Stallman), the father of the GNU Project and founder of the Free Software Foundation, writes in his [blog](https://stallman.org/stallman-computing.html):

```
I find it bizarre that people now use the term "coding" to mean programming. For decades, we used the word "coding" for the work of low-level staff in a business programming team. The designer would write a detailed flow chart, then the "coders" would write code to implement the flow chart. This is quite different from what we did and do in the hacker community -- with us, one person designs the program and writes its code as a single activity. When I developed GNU programs, that was programming, but it was definitely not coding.
	Since I don't think the recent fad for "coding" is an improvement, I have decided not to adopt it. I don't use the term "coding", unless I am talking about a business programming team which has coders.
```
	

Writing code is a different art than programming. In essence, programming is like designing and building a puzzle, while coding is process of making the individual pieces of the puzzle. Writing code is often the least difficult part of programming, and it is a process which will probably soon be automated with the rise of AI technologies. Yet, because of a lack of better way to test your programming skills, you will still be required to write code in the AP exam.

However, please note that when marking your exams, the guidelines are set such that poor coding skills will not effect your grade. You will learn throughout this course the concept of "pseudocode" which is a method of informally describing your programs code. If at anytime you struggle with writing code to answer practice or exam questions, writing your thought process in English instead of Java will often give you full marks. With that said, I recommend you not neglect the coding aspects of this course, as often confidence in your knowledge of code will translate to a less stressful time during the exam.



## AP CSA timeline

A gifted and motivated student can get through the the textbook with around 40 hours of work. However, if your goal is to learn how to program, and not just do well on the exam, I recommend spacing out your studies and incorporating programming projects along the way. 

I tend to teach 1 unit per week in a 3 hour lesson, and expect students to spend the equal amount of time practicing at home. For some units you may find that you only need 1 hour of learning and practice, while others may require far more time. 

My students will usually get through the core text within 3 months, 1 month building programming projects, and an additional 3 months of test preparation by doing practice exams. 


## Tools and Installation

To get started with programming in Java, you'll need to set up a few tools on your computer. Below are the steps to install everything you'll need for this course.

### Installing Java

Java is the language we'll be using for this course, so the first step is to install the Java Development Kit (JDK). The JDK includes the tools you need to compile and run Java programs.

1. **Download the JDK**:
   - Visit the [Java JDK download page](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html).
   - Click on "JDK Download" under the latest version available.
   - You'll see options for different operating systems (Windows, macOS, Linux). Choose the installer that matches your operating system. For example:
     - **Windows**: Download the Windows x64 Installer.
     - **macOS**: Download the macOS Installer.
   - Once the installer is downloaded, run it and follow the on-screen instructions to complete the installation.

### Installing VS Code

Visual Studio Code (VS Code) is a lightweight, yet powerful code editor that supports Java development. It’s the tool we’ll use to write, debug, and manage our Java programs.

1. **Download VS Code**:
   - Visit the [VS Code download page](https://code.visualstudio.com/Download).
   - Download the version appropriate for your operating system.
   - Once the download is complete, install VS Code by following the installation prompts.

2. **Setting Up Java in VS Code**:
   - Open VS Code.
   - Go to the Extensions view by clicking on the Extensions icon in the Activity Bar on the side of the window.
   - Search for "Java Extension Pack" and install it. This will add all the essential tools for Java development in VS Code, including support for debugging, editing, and more.

### Installing Git and Git Bash

Git is a version control system that lets you keep track of changes in your code and collaborate with others. Git Bash is a command-line tool that lets you use Git on Windows.

1. **Download Git**:
   - Visit the [Git download page](https://git-scm.com/downloads).
   - Download the appropriate version for your operating system and run the installer.

2. **Install Git**:
   - Follow the installation prompts. For most options, the default settings will work fine.
   - After installation, you can use Git Bash on Windows to run Git commands.

3. **Create a GitHub Account**:
   - Go to [GitHub](https://github.com/) and sign up for a free account.
   - GitHub allows you to store your code online, share it with others, and manage your projects.

### Setting Up Your Environment

Once you have installed Java, VS Code, and Git, you're ready to start coding!

1. **Open VS Code**.
2. **Create a New Java Project**:
   - Open the Command Palette (you can press `Ctrl+Shift+P` on Windows or `Cmd+Shift+P` on macOS).
   - Type "Java: Create Java Project" and follow the prompts to set up your project.
3. **Link to GitHub** (Optional but recommended):
   - Use the built-in Git tools in VS Code to link your project to a GitHub repository. This will allow you to easily save your work online and collaborate with others.

