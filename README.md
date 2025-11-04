# Student Grade Tracker

## Overview
The **Student Grade Tracker** is a console-based Java application designed to efficiently manage student grades. The program allows users to input, track, and summarize grades for a fixed number of assessments per student. It automatically generates a professional report file with individual and class-wide statistics.

This project helps reinforce **core programming concepts**, procedural development, and attention to detail — essential skills for any software developer.

---

## Features
- Add multiple students with a **fixed number of grades** per student.
- Grades support **floating-point numbers**, rounded to **two decimal places**.
- Compute **average, highest, and lowest grades** for each student.
- Compute **class-wide average, highest, and lowest grades**.
- Generate a **detailed report file** named with the current date (`report_YYYY-MM-DD.txt`) in the `src` folder.
- Console interface is **user-friendly and professional**.

---

## Requirements
- Java 14+ (supports modern switch expressions with `->`)
- No external libraries required

---

## Project Structure
StudentGradeTracker/
├── src/
│ ├── Main.java
│ ├── Student.java
│ ├── GradeTracker.java
├── outputScreenshots/
│ ├── add_student.png
│ ├── view_summary.png
│ └── report_example.png
├── README.md
|── report_YYYY-MM-DD.txt


---

## Installation
1. Clone the repository:

```bash
git clone https://github.com/Ireme-Nyawe/codealpha_tasks.git

```

1. Navigate to the src folder:

```bash 
cd codealpha_tasks/src
````

2. Compile the project:

```bash 
javac Main.java Student.java GradeTracker.java 
```


3. Run the program:

```bash 
java Main
```

---------------
### Execution screnshots

![img.png](outputScreenshots/img.png)
![img_1.png](outputScreenshots/img_1.png)
![img_2.png](outputScreenshots/img_2.png)
![img_3.png](outputScreenshots/img_3.png)