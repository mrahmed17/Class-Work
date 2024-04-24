    let userInput = parseInt(prompt("Please Enter a number"));
    let factorial = 1;

    for (let i = userInput; i >= 1; i--) {
      factorial *= i;

      //factorial=factorial*i
    }
    document.write("Your input number is " + userInput + " and the factorial is " + factorial);