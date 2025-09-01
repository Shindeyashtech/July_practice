<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Pass Filter</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #f9f9f9;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .container {
      background: white;
      padding: 20px;
      border-radius: 12px;
      box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
      width: 400px;
      text-align: center;
    }

    h2 {
      margin-bottom: 20px;
    }

    input {
      padding: 8px;
      margin: 5px;
      border: 1px solid #ccc;
      border-radius: 6px;
    }

    button {
      padding: 8px 14px;
      margin: 5px;
      border: none;
      border-radius: 6px;
      cursor: pointer;
      background-color: #007bff;
      color: white;
      font-weight: bold;
      transition: 0.3s;
    }

    button:hover {
      background-color: #0056b3;
    }

    .section-title {
      margin: 15px 0 10px;
      font-weight: bold;
    }

    ul {
      list-style: none;
      padding: 0;
    }

    li {
      padding: 6px;
      border-bottom: 1px solid #ddd;
    }
  </style>
</head>
<body>

  <div class="container">
    <h2>Student Pass Filter</h2>
    <input type="text" id="name" placeholder="Enter Name">
    <input type="number" id="rollNo" placeholder="Enter Roll No">
    <input type="number" id="marks" placeholder="Enter Marks">
    <button onclick="addStudent()">Add Student</button>

    <div class="section-title">All Students</div>
    <ul id="allStudents"></ul>

    <button onclick="showPassed()">Show Passed Students</button>

    <div class="section-title">Passed Students</div>
    <ul id="passedStudents"></ul>
  </div>

  <script>
    // Student Class
    class Student {
      constructor(name, rollNo, marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
      }

      isPassed() {
        return this.marks > 40;
      }
    }

    const students = [];

    function addStudent() {
      const name = document.getElementById("name").value;
      const rollNo = document.getElementById("rollNo").value;
      const marks = parseInt(document.getElementById("marks").value);

      if (name && rollNo && !isNaN(marks)) {
        const student = new Student(name, rollNo, marks);
        students.push(student);

        displayAllStudents();
        document.getElementById("name").value = "";
        document.getElementById("rollNo").value = "";
        document.getElementById("marks").value = "";
      } else {
        alert("Please fill all fields correctly!");
      }
    }

    function displayAllStudents() {
      const list = document.getElementById("allStudents");
      list.innerHTML = students.map(s => `<li>${s.rollNo} - ${s.name} (${s.marks} marks)</li>`).join("");
    }

    function showPassed() {
      const passed = students.filter(s => s.isPassed());
      const list = document.getElementById("passedStudents");
      list.innerHTML = passed.map(s => `<li>${s.rollNo} - ${s.name} (${s.marks} marks)</li>`).join("");
    }
  </script>

</body>
</html>
