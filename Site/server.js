// const express = require('express');
// const nodemailer = require('nodemailer');
// const app = express();
// const port = 3000;
//
// app.use(express.json());
// app.use(express.urlencoded({ extended: false }));
//
// const path = require('path');
// app.use(express.static(path.join(__dirname, 'public')));
// // app.use('/styles', express.static(path.join(__dirname, 'styles')));
// // app.use('/css', express.static(path.join(__dirname, 'public', 'css')));
// app.use('/css', express.static('../Site/css'));
// app.use('/img', express.static('../Site/img'));
// app.use('/js', express.static('../Site/js'));
// app.use('/img', express.static('C:/Users/holli/WebstormProjects/1/Site/img'));
// app.use(express.static(path.join(__dirname, 'img')));
//
// app.get('/', (req, res) => {
//   res.sendFile(path.join(__dirname, '', 'main_page.html'));
// });
// app.get('/contacts', (req, res) => {
//   res.sendFile(path.join(__dirname, '', 'contacts.html'));
// });
// app.get('/about', (req, res) => {
//   res.sendFile(path.join(__dirname, '', 'about.html'));
// });
//
// app.post('/sendEmail', function (req, res) {
//   var name = req.body.name;
//   var email = req.body.email;
//   var message = req.body.message;
//
//   var transporter = nodemailer.createTransport({
//     service: 'gmail',
//     auth: {
//       user: 'sh4rds.12112@gmail.com',
//       pass: 'Q6patfhennshe09f'
//     }
//   });
//
//   var mailOptions = {
//     from: email,
//     to: 'sh4rds.12112@gmail.com',
//     subject: 'New message from the form',
//     text: 'Name: ' + name + '\nEmail: ' + email + '\nMessage: ' + message
//   };
//
//   transporter.sendMail(mailOptions, function (error, info) {
//     if (error) {
//       console.error(error);
//       res.status(500).send('An error occurred while sending the message');
//     } else {
//       console.log('Email sent: ' + info.response);
//       res.sendStatus(200);
//     }
//   });
// });
//
// app.listen(port, () => {
//   console.log(`Server started on port ${port}`);
// });
