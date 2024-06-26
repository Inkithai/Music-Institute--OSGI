# Music Institute OSGi Microservices Project

## Overview

This project implements a producer-consumer plugin system for a music academy using the Eclipse Equinox OSGi Framework. The academy offers various music education courses and provides a platform for students to evaluate their skills, enroll in courses, and participate in events. The system supports multiple roles, including administrators, music teachers, students, and event organizers, each with specific functionalities.

## Project Structure

The project consists of four consumer bundles and five publisher bundles, each serving different purposes:

### Consumer Bundles

1. **Administrator Consumer**
2. **Music Teacher Consumer**
3. **Student Consumer**
4. **Event Organizer Consumer**

### Publisher Bundles

1. **Course Publisher**
2. **Quiz Publisher**
3. **Event Publisher**
4. **Music Resource Publisher**
5. **Middle Service Publisher**

## Features

### For Students

- **Course Enrollment**: Browse and enroll in various music courses across different genres (Western, Eastern, etc.).
- **Skill Evaluation**: Take quizzes to evaluate knowledge in the chosen course category (Beginner, Intermediate, Advanced).
- **Event Information**: View and sort upcoming musical events such as concerts, operas, and competitions.
- **Instrument Information**: Access details about musical instruments used in the institute, including availability and purchasing options.

### For Music Teachers

- **Quiz Management**: Create, edit, or remove quizzes and questions to evaluate student skills.
- **Event Management**: Oversee the creation, modification, and cancellation of musical events.

### For Administrators

- **Resource Management**: Add, update, or remove information about musical instruments and other resources.

### For Event Organizers

- **Event Scheduling**: Manage the schedule of events, including adding new events and canceling existing ones if necessary.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Eclipse IDE with the Eclipse Equinox OSGi Framework installed

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Inkithai/Music-Institute--OSGI.git
    cd Music-Institute--OSGI
    ```

2. Import the project into Eclipse:
    - Open Eclipse and select `File > Import`.
    - Choose `Existing Projects into Workspace` and select the cloned repository.

3. Run the OSGi Framework:
    - Right-click on the project and select `Run As > OSGi Framework`.

### Usage

Once the framework is running, you can interact with the different services through the OSGi console or by integrating with a front-end application.

## Contributors

- **Inkithai** - [GitHub Profile](https://github.com/Inkithai)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project uses the Eclipse Equinox OSGi Framework.
- Special thanks to all contributors and the open-source community.

