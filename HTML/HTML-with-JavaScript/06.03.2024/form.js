function submitForm(event) {

  event.preventDefault();

  let rName = document.getElementById('name').value;
  let idNumber = document.getElementById('idNumber').value;
  let email = document.getElementById('email').value;
  let password = document.getElementById('password').value;
  let confirmPassword = document.getElementById('confirmPassword').value;
  let checkConfirm = document.getElementById('checkConfirm').value;
  let gender = document.querySelector('input[name="gender"]:checked').value;
  let course = document.getElementById('course').value;
  let date = document.getElementById('date').value;
  let address = document.getElementById("address").value;
  let education = document.querySelectorAll('input[name="education"]:checked');
  let hobby = document.querySelectorAll('input[name="hobby"]:checked');


  let educationValue = [];
  for (let index = 0; index < education.length; index++) {
    educationValue.push(education[index].value);

  }
  // let educationValue = [];
  // education.forEach(
  //   function (education) {
  //     educationValue.push(education.value);
  //   }
  // );

  let hobbyValue = [];
  for (let index = 0; index < hobby.length; index++) {
    hobbyValue.push(hobby[index].value);
  }


  // evabeo hobby er kaj kora jay

  // let hobbyValue = [];
  // hobby.forEach(
  //   function (hobby) {
  //     hobbyValue.push(hobby.value);
  //   }
  // );


  let output = "Full Name: " + rName + "\n";
  output += "I'd Number: " + idNumber + "\n";
  output += "Date Of Birth: " + date + "\n";
  output += "Gender: " + gender + "\n";
  output += "Address: " + address + "\n";
  output += "Education: " + educationValue + "\n";
  output += "Hobby: " + hobbyValue + "\n";
  output += "Course: " + course + "\n";
  output += "Email: " + email + "\n";
  output += "Password: " + password + "\n";
  output += "Confirm Password: " + confirmPassword + "\n";
  output += "Check Me Out: " + checkConfirm + "\n";


  let newWindow = window.open("", '_blank');
  newWindow.document.write("<pre>" + output + "</pre>");
}


let myForm = document.getElementById('myForm');
myForm.addEventListener("submit", submitForm);