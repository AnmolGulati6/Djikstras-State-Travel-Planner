# State Travel Planner with Dijkstra's Shortest Path Algorithm

This program allows users to search through a database of 50 states and find the shortest path for traveling from a start state to an end state using Dijkstra's Shortest Path Algorithm. The program considers neighboring states as the only way to travel between states. 

## Features

- State database: The program uses a list to store information about 50 states, including their names, longitudes, latitudes, and neighboring states.
- Dijkstra's Shortest Path Algorithm: Given a start state and an end state, the program calculates the shortest path using Dijkstra's algorithm, considering neighboring states as edges and their distances as weights.
- Interactive search: Users can input their start and end states to find the shortest path and the total distance of the journey.

## Usage

1. Clone the repository to your local machine.
2. Import the project into your preferred Java IDE.
3. Run the `Main` class to start the program.
4. Follow the instructions displayed on the console to search for the shortest path between two states.
5. The program will display the shortest path and the total distance of the journey.

## State Class

The project includes a `State` class that represents a state. Each state object contains the following information:

- Name: The name of the state.
- Longitude: The longitude coordinate of the state.
- Latitude: The latitude coordinate of the state.
- Neighboring states: A list of neighboring states that can be traveled to from the current state.

You can modify the `State` class to include additional information or functionality as per your requirements.

## Dependencies

This project does not have any external dependencies. It uses only the Java standard library.

