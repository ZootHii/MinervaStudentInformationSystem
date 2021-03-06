# MinervaStudentInformationSystem
School Project with 2 Teammates

* [Exmaple Video 1](ProjeMinerva1%20(1).mov)
* [Exmaple Video 2](ProjeMinerva1%20(2).mov)



This project contains two packages, one resource folder and a database. Folder named "Minerva" is the project file created by NetBeans, source folder is inside it and is named "src". Database was created by MySQL Workbench, folder named "Dump20191225" was generated by MySQL Workbench's export feature. It can be imported by using the import feature. Database schema name is "minerva" and this whole project uses a local database, thus connected to localhost.

Minerva is a simple information system with a main focus on taking attendance without traditional paper hand-out procedure. Traditionally, instructor hands out an attendance list of all the students. This takes time, causes confusion since the list can get stuck, miss out a group of people and of course people can sign in for their friends. What we've done, or attempted, takes care of all of these problems except for the last one. In Minerva, instructor can choose the class, create a random number, announce it to the classroom or write it down on the blackboard, start the attendance procedure and end it whenever they want. When they end it, code expires and people who haven't attended by entering the right code in their accounts get their absent hours increased. Instructor can also see which people attended and when. Although this method can't take care of absent people still signing in (in this case, they can get the code by a text or a photograph from their friends), it at least simplifies the procedure.

Students can view their classes, their absence and their grades. They can also request to join a class and cancel their requests.

Teachers can view their classes, their members (only the members of their classes, if the same class was taught by another teacher, they can't interfere with each other), set their grades. Also they can control the attendance through their account.

Admins are responsible for nearly every addition-removal operation. They add new students, teachers, admins and subjects to the system, they can also edit them. They accept or reject students' requests to join a class, they add/remove teachers to/from classes or they can kick students out of classes.
