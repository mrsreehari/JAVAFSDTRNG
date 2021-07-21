function addtext()
          {
             var fname = document.myform.first_name.value;
             var lname = document.myform.last_name.value;
             var email = document.myform.email.value;

             document.writeln("Thank you! You have just entered the following:");
             document.writeln("<pre>");
             document.writeln("First Name    : " + fname);
             document.writeln("Last Name     : " + lname);
             document.writeln("Email Address : " + email);
          }