 function checkOddEven() {
      let userInput = document.getElementById("number").value;

      if (userInput % 2 == 0) {
        document.getElementById("result").innerHTML = "WOW!! Thit is an Even";
      }

      else {
        document.getElementById("result").innerHTML = "WOW!! Thit is an Odd";
      }
    }

