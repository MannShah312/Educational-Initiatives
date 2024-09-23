# Virtual Classroom Manager & Software Design Patterns

## Overview

This repository contains two exercises. Exercise 1 demonstrates the development of a terminal-based Virtual Classroom Manager, while Exercise 2 presents six creative use cases to demonstrate various software design patterns, all written in Java.

# Exercise : 1 Problem Statement on Design Patterns
This exercise demonstrates six different use cases to showcase the understanding of behavioral, creational, and structural design patterns using Java. Each use case implements a specific design pattern.
## Behavioral Design Patterns
1. Observer Pattern: 
Demonstrates how observers subscribe to an event in a subject and react when that event changes.

2. Strategy Pattern:
Illustrates dynamic swapping of algorithms to change the behavior of a class at runtime.

## Creational Design Patterns
1. Singleton Pattern: 
Ensures only one instance of a class is created, providing a global point of access.

2. Factory Method Pattern: 
Defines an interface for creating objects, allowing subclasses to determine which class to instantiate.

## Structural Design Patterns
1. Adapter Pattern:
Converts the interface of a class into another interface expected by the client.

2. Decorator Pattern: 
Dynamically adds behavior to objects without modifying their structure.
# Exercise 2: Virtual Classroom Manager
## Problem Statement
The Virtual Classroom Manager is a backend solution for an EdTech platform that manages virtual classrooms, student attendance, and assignment submissions via a terminal-based interface. It allows users to create classrooms, enroll students, schedule assignments, and submit them.

## Features
Classroom Management: Add, list, and remove virtual classrooms.

Student Management: Enroll students in classrooms and list students in each classroom.

Assignment Management: Schedule assignments for classrooms and allow students to submit them.

## User Commands
1. Add Classroom:
- Command: 
    `add_classroom [Class Name]`
- Output:
    `Classroom [Class Name] has been created.`
2. Add Student
- Command: 
    `add_student [Student ID] [Class Name]`
- Output:
    `Student [Student ID] has been enrolled in [Class Name].`
3. Schedule Assignment
- Command: 
    `schedule_assignment [Class Name] [Assignment Details]`
- Output:
    `Assignment for [Class Name] has been scheduled.`
4. Submit Assignment
- Command:
    `submit_assignment [Student ID] [Class Name] [Assignment Details]`
- Output:
    `Assignment submitted by Student [Student ID] in [Class Name].`
## Initial State
- Number of Classrooms : 0
- Number of Students : 0
- Number of assignments : 0
