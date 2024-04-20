function submitForm(event) {
  event.preventDefault();

  let email = document.getElementById('mail').value;

  if (email == '') {
    alert("May be you forget to type 'Email'");
    return;
  }

  const regEx = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (regEx.test(email)) {
  } else {
    alert('Not a valid email address.');
    return;
  }

  let output = 'Email:' + email + '\n';

  let newWindow = window.open('', '_blank');
  newWindow.document.write('<pre>' + output + '</pre>');
}

let myForm = document.getElementById('myForm');
myForm.addEventListener('submit', submitForm);
