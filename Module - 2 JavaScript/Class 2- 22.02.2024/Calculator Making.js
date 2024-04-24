
      function doSum() {
        let number1 = document.getElementById('number1').value;
        let number2 = document.getElementById('number2').value;

        let num1ToInt = parseFloat(number1);
        let num2ToInt = parseFloat(number2);

        let result = num1ToInt + num2ToInt;
        
        alert(result);
        //document.write(result);
    
      }
      function doSubstraction() {
        let number1 = document.getElementById('number1').value;
        let number2 = document.getElementById('number2').value;

        let num1ToInt = parseFloat(number1);
        let num2ToInt = parseFloat(number2);

        let result = num1ToInt - num2ToInt;

        alert(result);
        //document.write(result);
      }
      function doMultiplication() {
        let number1 = document.getElementById('number1').value;
        let number2 = document.getElementById('number2').value;

        let num1ToInt = parseFloat(number1);
        let num2ToInt = parseFloat(number2);

        let result = num1ToInt * num2ToInt;

        alert(result);
        //document.write(result);
      }
      function doDivison() {
        let number1 = document.getElementById('number1').value;
        let number2 = document.getElementById('number2').value;

        let num1ToInt = parseFloat(number1);
        let num2ToInt = parseFloat(number2);

        let result = num1ToInt / num2ToInt;

        alert(result);
        //document.write(result);
      }
      function doExponentiation() {
        let number1 = document.getElementById('number1').value;
        let number2 = document.getElementById('number2').value;

        let num1ToInt = parseFloat(number1);
        let num2ToInt = parseFloat(number2);

        let result = num1ToInt ** num2ToInt;

        alert(result);
        //document.write(result);
      }
      function doModulus() {
        let number1 = document.getElementById('number1').value;
        let number2 = document.getElementById('number2').value;

        let num1ToInt = parseFloat(number1);
        let num2ToInt = parseFloat(number2);

        let result = num1ToInt % num2ToInt;

        alert(result);
        //document.write(result);
      }