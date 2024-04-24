// Get user input for the starting number
const userInput = parseInt(prompt("Please enter a beginning number:"));

// Initialize a counter for odd numbers
let oddNumber = userInput;

// Loop until reaching 100
while (oddNumber <= 100) {
    // Check if the current number is odd
    if (oddNumber % 2 !== 0) {
        console.log(oddNumber);
    }
    // Increment by 1
    oddNumber++;
}


/*
    let userInput = prompt("Please enter beginning number");
    for (let i = userInput; i <= 100; i++) {
      document.write(i + "</br>");

    }
*/
