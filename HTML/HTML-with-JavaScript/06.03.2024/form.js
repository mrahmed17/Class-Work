function submitForm(event) {

  event.preventDefault();

  let rName = document.getElementById('name').value;

  let idNumber = document.getElementById('idNumber').value;

  let email = document.getElementById('email').value;

  let password = document.getElementById('password').value;

  let gender = document.querySelector('input[name="gender"]:checked').value;

  let course = document.getElementById('course').value;

  let date = document.getElementById('date').value;


  let output = "Full Name: " + rName + "\n";
  output += "I'd Number: " + idNumber + "\n";
  output += "Email: " + email + "\n";
  output += "Password: " + password + "\n";
  output += "Gender: " + gender + "\n";
  output += "Course: " + course + "\n";
  output += "Date Of Birth: " + date + "\n";


  let newWindow = window.open("", '_blank');
  newWindow.document.write("<pre>" + output + "</pre>");

}


let myForm = document.getElementById('myForm');
myForm.addEventListener("submit", submitForm);