// Get user input for the starting number
const userInput = parseInt(prompt("Please enter a beginning number:"));

// Initialize a counter for even numbers
let evenNumber = userInput;

// Loop until reaching 100
while (evenNumber <= 100) {
    // Check if the current number is even
    if (evenNumber % 2 === 0) {
        document.write(evenNumber + "</br>");
    }
    // Increment by 1
    evenNumber++;
}

 

 /*   let userInput = prompt("Please enter beginning number");
    for (let i = userInput; i <= 100; i++) {
      document.write(i + "</br>");

    }
    */