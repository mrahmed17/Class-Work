function submitForm(event) {
  event.preventDefault();

  let fNam = document.getElementById('name').value;
  let contact = document.getElementById('contact').value;
  let remarks = document.getElementById('remarks').value;
  let gender = document.querySelector('input[name="gender"]:checked');
  let location = document.getElementById('location').value;
  let course = document.querySelectorAll('input[name="course"]:checked');

  let courseValue = [];
  for (let index = 0; index < course.length; index++) {
    courseValue.push(course[index].value);
  }

  if (fNam == '') {
    alert('Name can not be empty');
    return;
  } else if (fNam <= 3) {
    alert('Name must have atleast 4 charecter');
    return;
  }

  if (contact == '') {
    alert('Please type your contact number');
    return;
  }

  if (remarks == '') {
    alert('Please type your remarks here');
    return;
  }

  if (gender == null) {
    alert('Gender must be select');
    return;
  }

  if (location == '') {
    alert("May be you forget to type 'Location'");
    return;
  }

  if (course.length == 0) {
    alert('Select any Course');
    return;
  }

  let output = 'Full Name: ' + fNam + '\n';
  output += 'Contact: ' + contact + '\n';
  output += 'Remarks: ' + remarks + '\n';
  output += 'Gender: ' + gender.value + '\n';
  output += 'Course: ' + courseValue + '\n';
  output += 'Location: ' + location + '\n';

  let newWindow = window.open('', '_blank');
  newWindow.document.write('<pre>' + output + '</pre>');
}

let myForm = document.getElementById('myForm');
myForm.addEventListener('submit', submitForm);
