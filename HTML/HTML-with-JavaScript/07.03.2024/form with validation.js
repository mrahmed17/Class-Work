function submitForm(event) {

  event.preventDefault();

  let rName = document.getElementById('name').value;
  let idNumber = document.getElementById('idNumber').value;
  let email = document.getElementById('email').value;
  let password = document.getElementById('password').value;
  let confirmPassword = document.getElementById('confirmPassword').value;
  let checkConfirm = document.getElementById('checkConfirm').value;
  let gender = document.querySelector('input[name="gender"]:checked');
  let course = document.getElementById('course').value;
  let date = document.getElementById('date').value;
  let address = document.getElementById("address").value;
  let education = document.querySelectorAll('input[name="education"]:checked');
  let hobby = document.querySelectorAll('input[name="hobby"]:checked');


// nobe/method 1: (for education)
  let educationValue = [];
  for (let index = 0; index < education.length; index++) {
    educationValue.push(education[index].value);

  }


// nobe/method 2: (for education)

  // let educationValue = [];
  // education.forEach(
  //   function (education) {
  //     educationValue.push(education.value);
  //   }
  // );


// nobe/method 1: (for hobby)

  let hobbyValue = [];
  for (let index = 0; index < hobby.length; index++) {
    hobbyValue.push(hobby[index].value);
  }


  // nobe/method 2: (for hobby)

  // let hobbyValue = [];
  // hobby.forEach(
  //   function (hobby) {
  //     hobbyValue.push(hobby.value);
  //   }
  // );


  // Start Validation
  // name validation
  if (rName == "") {
    alert("Name can not be empty");
    return;
  }

  else if (rName <= 3) {
    alert("Name must have atleast 4 charecter");
    return;
  };

  // email validation  (note: regEx means regular express) 
  const regEx = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (regEx.test(email)) {
  }

  else {
    alert("Not a valid email address.");
    return;
  };

  // password validation 
  if (password.length < 6 || password.length >= 20) {
    alert("Password length must be between 6 to 20 character");
    return;
  };
  if (confirmPassword.length < 6 || confirmPassword.length >= 20) {
    alert("Password does not match");
    return;
  };

  // gender validation 
  if (gender == null) {
    alert("Gender must be selected");
    return;
  };

  // hobby validation 
  if (hobby.length == 0) {
    alert("Select atleast one Hobby");
    return;
  };

  // Education validation 
  if (education.length == 0) {
    alert("Select atleast one Hobby");
    return;
  };

  // course validation 
  if (course === "Select Any") {
    alert("Select any Course");
    return;
  }
  // Date of Birth validation 
  if (date == "") {
    alert("Date of Birth Must be Select");
    return;
  };

  // End Validation




  let output = "Full Name: " + rName + "\n";
  output += "I'd Number: " + idNumber + "\n";
  output += "Date Of Birth: " + date + "\n";
  output += "Gender: " + gender.value + "\n";
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