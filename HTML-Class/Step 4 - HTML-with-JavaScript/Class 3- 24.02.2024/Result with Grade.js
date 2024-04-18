    function findResult() {
      let userInput = document.getElementById("mark").value;
      let grade = "";

      if (userInput <= 32) { grade = "F" };


      else if (userInput <= 39) { grade = "D" };

      else if (userInput <= 49) { grade = "C" };

      else if (userInput <= 59) { grade = "B" };
      else if (userInput <= 69) { grade = "A-" };
      else if (userInput <= 79) { grade = "A" };
      else if (userInput <= 100) { grade = "A+" };
      else { alert("Invalid Number") };

      document.getElementById("result").innerHTML = grade

};