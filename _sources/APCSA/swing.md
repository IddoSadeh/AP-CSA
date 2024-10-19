# Lab: Introduction to Swing GUI and Building Cross-Platform Applications

In this lab, you will learn how to create a basic GUI application using the Java Swing library. After building the GUI, you will take it a step further by learning how to package your application into a standalone executable that users can run on their computers—without needing to interact with code or have a Java environment installed.

## Part 1: Building a Basic Swing Application

### What is Swing?

**Swing** is a part of Java’s standard library (`javax.swing` package). It provides a set of components (like buttons, labels, text fields) that allow developers to create **Graphical User Interfaces (GUIs)**. Swing is lightweight and platform-independent, meaning you can run the same Swing application on multiple operating systems like Windows, macOS, and Linux without changing your code.

### Key Components of Swing:
- **JFrame**: The window of the application where all GUI components will reside.
- **JPanel**: A container that can hold multiple GUI components (like buttons, labels, etc.).
- **JLabel**: A simple component that displays text.
- **JButton**: A button that the user can click, triggering an action.

### Step-by-Step Guide to Building a GUI

In this section, we will create a simple Swing application with a button and a label. When the button is clicked, the label’s text will change.

#### Step 1: Set Up Your Project

1. **Create a New Java Class**: Start by creating a new Java class, e.g., `SimpleApp.java`. This class will contain the code for our application.
2. **Import Swing Packages**: Add the necessary import statements for the Swing and AWT (Abstract Window Toolkit) components.

```java
import javax.swing.*;   // Swing components like JFrame, JPanel, JLabel, JButton
import java.awt.*;      // For layout management
import java.awt.event.*; // For handling button clicks
```

#### Step 2: Create the Main Window (JFrame)

We will create the **main window** of the app using the `JFrame` class. The `JFrame` will be the base window that holds all other components like buttons and labels.

```java
public class SimpleApp {
    // Create the main window (JFrame)
    private static void createAndShowGUI() {
        // Create a JFrame instance with a title
        JFrame frame = new JFrame("Simple Swing App");
        
        // Set the size of the window
        frame.setSize(300, 200);
        
        // Specify the action for the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the window visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread to create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
```

### Explanation:
- **JFrame**: The main window of the GUI.
- **setSize(300, 200)**: Defines the size of the window (300 pixels wide, 200 pixels tall).
- **setDefaultCloseOperation**: Ensures the application exits when the user closes the window.
- **SwingUtilities.invokeLater**: Ensures the GUI is created on the event-dispatching thread, which is necessary for thread safety in Java GUIs.

#### Step 3: Adding Components (Label and Button)

Next, we will add a **JLabel** (a simple text field) and a **JButton** (a clickable button) to the window. These components will reside inside a **JPanel**, which is used to manage the layout of components.

```java
public class SimpleApp {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Swing App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label and a button
        JLabel label = new JLabel("Click the button to change this text.");
        JButton button = new JButton("Click Me");

        // Create a panel to hold the components
        JPanel panel = new JPanel();

        // Add the label and button to the panel
        panel.add(label);
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        // Make the window visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
```

### Explanation:
- **JLabel**: Displays static text (which can later be changed).
- **JButton**: A clickable button that we will later attach an event handler to.
- **JPanel**: A container to which we can add multiple components (the label and button).

#### Step 4: Adding Event Handling (Button Click)

We want the button to perform an action when it is clicked—specifically, we will change the text of the label. To do this, we need to add an **ActionListener** to the button.

```java
public class SimpleApp {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Simple Swing App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click the button to change this text.");
        JButton button = new JButton("Click Me");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the label's text when the button is clicked
                label.setText("Button clicked! Text changed.");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
```

### Explanation:
- **ActionListener**: An interface used to handle events such as button clicks.
- **actionPerformed**: The method that will be executed when the button is clicked. In this case, it changes the text of the label.

#### Step 5: Cross-Platform Look and Feel

To ensure that the application looks consistent across different operating systems, we can use the **UIManager** to set the "look and feel" to match the native system's appearance.

```java
public class SimpleApp {
    private static void createAndShowGUI() {
        // Set cross-platform look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Simple Swing App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click the button to change this text.");
        JButton button = new JButton("Click Me");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        button.addActionListener(e -> label.setText("Button clicked! Text changed."));

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
}
```





## Part 2: Packaging and Distributing the Application

### What Does It Mean to Package Software?

After developing a Java application, you need to package it for distribution so that users can easily install and run it without having to know how to compile or run Java code. Packaging involves multiple steps:
1. **Compiling** the Java source code into bytecode (using the Java compiler).
2. **Bundling** that bytecode and other resources into a runnable format, such as a JAR file or a native executable.
3. **Creating an installer** to manage the installation, configuration, and uninstallation on different operating systems.



### Why Do We Need an Installer?

An **installer** simplifies the process of installing software for end-users by:
- **Setting up everything needed** to run the app, such as placing files in the correct locations (e.g., program files, user directories).
- **Handling dependencies**, like bundling the Java Runtime Environment (JRE) if the user doesn’t have it installed.
- **Creating shortcuts** for the app, such as desktop icons or Start menu entries.
- **Managing uninstallation**, allowing users to easily remove the program when they no longer need it.

Without an installer, users would have to manually place files in specific locations, ensure the correct version of Java is installed, and set up shortcuts or configuration files on their own. An installer automates this process, making your software more professional and user-friendly.



### Step 1: Compilation – What Is It?

**Compilation** is the process of converting human-readable source code (in this case, Java code) into **bytecode**, which can be executed by the Java Virtual Machine (JVM). Bytecode is an intermediate language between your Java code and the machine code that the operating system can understand.

When we talk about compiling a Java program, we are using the **Java Compiler (`javac`)** to convert `.java` source code files into `.class` bytecode files.

#### Compiling Your Program
1. **Open a terminal** (Command Prompt or Terminal) on your computer.
2. **Navigate** to the directory where your `SimpleApp.java` file is located.
3. **Run the following command** to compile the program:

   ```bash
   javac SimpleApp.java
   ```

   This command will generate a `SimpleApp.class` file, which contains the bytecode necessary to run the program using the JVM.



### Step 2: Creating a Runnable JAR File

A **JAR (Java ARchive)** file bundles together compiled `.class` files and any other resources (like images or configuration files) into a single, portable package that can be executed by the JVM. Users can run this JAR file on any machine that has Java installed.

#### Creating a JAR File

1. Once the `.class` file has been generated by the `javac` compiler, we can create the JAR file using the `jar` command.
   
2. **Run the following command** to bundle the `.class` file into a JAR file:

   ```bash
   jar cfe SimpleApp.jar SimpleApp SimpleApp.class
   ```

   Here’s what each part of the command does:
   - **cfe**: Creates a JAR file and specifies the entry point (the `SimpleApp` class that contains the `main()` method).
   - **SimpleApp.jar**: The name of the JAR file that will be created.
   - **SimpleApp**: The name of the main class that should be executed when the JAR file is run.
   - **SimpleApp.class**: The compiled bytecode file that will be included in the JAR file.

3. **Running the JAR File**

   To run the JAR file on your machine (or any machine with Java installed), use the following command:

   ```bash
   java -jar SimpleApp.jar
   ```

This method allows anyone with Java installed on their computer to run your application. However, users still need to run the program from the terminal, and Java must be installed on their system.



### Step 3: Converting to a Windows Executable (.exe)

To make your application easier for Windows users to run (without needing Java installed or using the terminal), you can convert the JAR file into an executable (`.exe` file). We’ll use a tool called **Launch4j** to accomplish this.

#### Using Launch4j for Windows

**Launch4j** is a free and widely-used tool that wraps a Java application (JAR file) into a Windows executable (`.exe` file). This allows users to double-click the `.exe` file and run your program like any other Windows application.

#### Step-by-Step Instructions:

1. **Download Launch4j**: 
   - Visit the [Launch4j website](http://launch4j.sourceforge.net/) and download the tool.
   - Install it on your Windows machine.

2. **Open Launch4j** and configure your project:
   - **Output File**: Set the output file to `SimpleApp.exe`, which will be the executable generated by Launch4j.
   - **Jar**: Set this to the path of your `SimpleApp.jar` file.
   - **Bundling the JRE** (Optional): If you want to ensure your application runs even if the user does not have Java installed, you can bundle a specific JRE with your application. Set the path to the bundled JRE in the configuration.

3. **Build the Executable**:
   - Click on "Build Wrapper" in Launch4j. This will generate the `SimpleApp.exe` file, which is your Windows executable.

4. **Test the Executable**:
   - Double-click the generated `.exe` file. If everything is configured correctly, your GUI application should launch as expected.



### Step 4: Creating macOS and Linux Installers with jpackage

Starting from **JDK 14**, Java includes a built-in tool called **jpackage**, which can generate native platform-specific installers for **Windows, macOS, and Linux**. This makes it easier to distribute applications that don’t require users to manually install Java.

#### Why Use jpackage?
- jpackage creates self-contained applications that include a Java runtime (JRE), so users do not need to install Java separately.
- It generates native installers for different platforms, making your app easy to distribute.

#### Example: Creating an Installer for Windows, macOS, or Linux

1. **For Windows**: Use the following command to package your JAR into a Windows `.exe` installer.

   ```bash
   jpackage --input . --name SimpleApp --main-jar SimpleApp.jar --type exe
   ```

2. **For macOS**: Use this command to create a `.pkg` file (the standard macOS installer format).

   ```bash
   jpackage --input . --name SimpleApp --main-jar SimpleApp.jar --type pkg
   ```

3. **For Linux**: Use the following command to create a `.deb` installer for Linux distributions.

   ```bash
   jpackage --input . --name SimpleApp --main-jar SimpleApp.jar --type deb
   ```

#### Explanation:
- **--input**: Specifies the directory where the JAR file is located.
- **--name**: The name of the application.
- **--main-jar**: The JAR file that should be executed when the user runs the app.
- **--type**: Specifies the type of installer to create (`exe` for Windows, `pkg` for macOS, `deb` for Linux).

#### Bundling the JRE with jpackage
To make the app truly self-contained (so users don’t need to install Java separately), you can bundle the JRE with the application using the `--runtime-image` option:

```bash
jpackage --input . --name SimpleApp --main-jar SimpleApp.jar --type exe --runtime-image path_to_jre
```

This creates an executable that includes the JRE, ensuring the application runs on machines that don’t have Java installed.



### Step 5: Creating an Installer – Why Do You Need One?

When distributing software to users, an installer does much more than simply copy files. It provides a professional, user-friendly way for people to install and uninstall the application, taking care of setup tasks such as:
- **Setting up directories** where the application files are stored.
- **Adding shortcuts** to the desktop, Start menu, or application folder.
- **Bundling dependencies**, such as the JRE or additional libraries.
- **Creating an uninstaller** that lets users remove the software completely if they no longer need it.

By creating an installer, you ensure that your application can be installed and used by a wide audience without the need for technical knowledge or manual setup.

#### Using Inno Setup to Create a Windows Installer

1. **Download and Install Inno Setup**: 
   - Visit [Inno Setup’s website](https://jrsoftware.org/isinfo.php) and download the tool.
   - Install it on your Windows machine.

2. **Configure Inno Setup**:
   - When you launch Inno Setup, select "Create a new script file using the script wizard."
   - Follow the wizard to specify:
     - **Application name**: "SimpleApp"
     - **Version**: "1.0"
     - **Publisher**: Your name or company.
     - **Main executable**: Point this to your `SimpleApp.exe` file generated by Launch4j or jpackage.
   - Add any supporting files (such as the JRE

 if you plan to bundle it).

3. **Customize the Installer**:
   - Add options like **desktop shortcuts** or **Start menu entries**.
   - Configure the uninstallation options.

4. **Compile the Installer**:
   - After setting up the script, Inno Setup will compile the installer and generate an `.exe` file (e.g., `SimpleAppInstaller.exe`).
   - Users can now double-click this installer to install the app on their system.



### Conclusion

By the end of this part of the lab, you’ve learned how to:
- Compile your Java Swing application into a runnable JAR file.
- Convert the JAR into platform-specific executables (`.exe`, `.pkg`, or `.deb`).
- Package your application into a professional, user-friendly installer using **Launch4j**, **jpackage**, or **Inno Setup**.
- Understand the importance of installers in providing a smooth, polished experience for users.



## Exercises

1. **Improve the Installer**: Add a custom icon and splash screen to your installer using Inno Setup or jpackage.
2. **Cross-Platform Distribution**: Create installers for Windows, macOS, and Linux, ensuring that users on all platforms can easily install and run your app.
3. **Custom Uninstallation**: Modify the installer to handle custom tasks during uninstallation, such as removing configuration files or user data.
4. **Bundling the JRE**: Ensure your installer works on machines that don’t have Java by bundling the JRE with your application.

4. **Pong**: Follow the following tutorial and make a game yourselves: https://kevinsguides.com/guides/code/java/javaprojs/simple-2d-pong/