![Project Logo](https://github.com/NemethAndris/Elysium/blob/bd944be394a9bd26aac2ed19fe06e33b8f1842a3/elysium-logo.png)

# Elysium

Introducing Elysium, a job search tool built to assist individuals in finding their ideal career path. My aim is twofold: to offer a fresh approach to job hunting and to provide a platform for learning new technologies along the way. Join me as I simplify the job search process and embark on a journey of discovery and professional growth.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)

## Introduction

 While I have been actively searching for a developer job recently, an idea struck me to create an application that would not only simplify the process but also add a touch of entertainment. The concept revolves around a tool where individuals can swipe through job listings based on their descriptions. They would have the option to swipe right if the job interests them or left if it doesn't align with their preferences. By implementing this feature, the job search experience becomes more interactive and engaging.
 
 On the other hand, HR consultants will have the ability to view the profiles of individuals who have applied for their positions and swipe back on candidates with whom they share a mutual interest or connection. This two-way swiping feature enables HR consultants to easily identify potential candidates who resonate with their company's values and culture, fostering a more efficient and effective hiring process.
 
 By enabling users to apply for jobs seamlessly within the application and automatically upload their CVs upon registration, the process becomes incredibly efficient, eliminating the need to individually send applications to each employer. Additionally, the instant feedback received from HR consultants through mutual swiping creates a sense of connection and provides valuable insight into the candidate's compatibility with the company. This not only simplifies the job search journey but also fosters quicker and more meaningful interactions between job seekers and potential employers.

## Features

This project is currently in active development, with new features being added on a weekly basis. The project is designed to follow a layered architecture, including distinct components such as models, services, controllers, and views. Several foundational elements have already been implemented, including the database connection, entity classes, a basic frontend page, and a registration feature.

Codesnippet about registration feature on the frontend side  (not the final! under development):

![Screenshot](https://github.com/NemethAndris/Elysium/blob/941380063f3e50d97741fddb676c57fbb76f52e2/elysium-pictures/K%C3%A9perny%C5%91felv%C3%A9tel%20(10).png)

Codesnippet about the backend UserController  (not the final! under development):

![Screenshot](https://github.com/NemethAndris/Elysium/blob/f6e9d305705910e6eecd5b4153c1349b35823c3c/elysium-pictures/K%C3%A9perny%C5%91felv%C3%A9tel%20(6).png)

Codesnippet about the basic landing page in the browser  (not the final! under development):

![Screenshot](https://github.com/NemethAndris/Elysium/blob/2546f523b2d5575d51f72571a77530faaf86d8e4/elysium-pictures/K%C3%A9perny%C5%91felv%C3%A9tel%20(8).png)

Codesnippet about the registration page in the browser (not the final! under development):

![Screenshot](https://github.com/NemethAndris/Elysium/blob/63c1699665e49e1aad910fb827af93bb3b24c4e7/elysium-pictures/K%C3%A9perny%C5%91felv%C3%A9tel%20(9).png)

The ongoing focus is on developing the login and authentication functionality, but there is a comprehensive roadmap of exciting features outlined in the project description. The aim is to continually enhance the application by incorporating these planned features.

## Getting Started

### Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed
- [Node.js](https://nodejs.org/) installed
- [PostgreSQL](https://www.postgresql.org/) installed and running

- ### Backend Setup

1. Clone the repository:

   ```bash
   $ git clone https://github.com/NemethAndris/Elysium.git
   $ cd Elysium
   ```

 2. Navigate to the backend directory:
 
    ```bash
    $ cd elysium-backend
    ```

3. Open the application.properties file in the src/main/resources directory.
4. Configure the PostgreSQL database connection properties, including the database URL, username, and password.
5. Build and run the Spring Boot backend:
   ```bash
   $ ./mvnw spring-boot:run
   ```
   The backend server will start running on http://localhost:8080.

### Frontend Setup
1. Open a new terminal and navigate to the frontend directory:
    ```bash
    $ cd elysium-frontend
    ```

2. Install the required dependencies:
  
    ```bash
    $ npm install
    ```
 3.Start the React development server:
   
   ```bash
      $ npm start
   ```

The frontend development server will start running on http://localhost:3000.


## Usage

Coming soon! 

## Acknowledgments 

I would like to express my gratitude to the following individuals and projects that have inspired or provided valuable resources for the development of this project:

- Coming Soon!

## Contact Information
If you find this project interesting or would like to collaborate, feel free to reach out to me. I am open to collaboration opportunities and welcome your involvement. Please don't hesitate to contact me via the following methods:

Email: nthas13@gmail.com

GitHub: NemethAndris

I am excited about this project and look forward to hearing from you. Let's work together and make it even better!
