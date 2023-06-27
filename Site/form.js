// document.getElementById('emailForm').addEventListener('submit', function(event) {
//   event.preventDefault();
//
//   var name = document.getElementById('Name').value;
//   var email = document.getElementById('Email').value;
//   var message = document.getElementById('Message').value;
//
//   var xhr = new XMLHttpRequest();
//   xhr.open('POST', '/sendEmail', true);
//   xhr.setRequestHeader('Content-Type', 'application/json');
//   xhr.onreadystatechange = function() {
//     if (xhr.readyState === 4 && xhr.status === 200) {
//       alert('The message has been sent');
//       // Дополнительные действия при успешной отправке
//     } else {
//       alert('An error occurred while sending the message');      // Дополнительные действия при ошибке отправки
//     }
//   };
//   var data = JSON.stringify({ name: name, email: email, message: message });
//   xhr.send(data);
// });
