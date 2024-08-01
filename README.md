<<<<<<< HEAD
# Welcome to Practical Course
## Classes. Encapsulation. Exceptions

You can start by cloning the repository to your computer using the following command:
```
git clone <url>
```
You can copy the url here

<img width="968" alt="Screenshot 2022-05-10 at 23 06 42" src="https://user-images.githubusercontent.com/61456363/167713268-c89a4125-9467-47a6-a2d8-eb6fcefcc1dd.png">

 
This sprint includes several tasks. Unit tests for these tasks are located in separate branches named **task1**, **task2**, **task3**, etc.

You can switch between branches using the following command:
```
 git checkout <branch name>
```
 e.g.
```
 git checkout task1
 ```
 > Don't forget to commit your code before switching to another branch
 
In the **main** folder first you need to complete your code with the solution of the tasks.
 
After this uncomment all tests in folder **test** and run the code:
```
mvn test
```
or (if you haven't installed Maven on your PC)
```
./mvnw test
```
or just use command `Run` from your IDE.
 
=======
# Classes. Encapsulation. Exceptions
## Task1

Suppose we have the following class:


![image](https://github.com/user-attachments/assets/e57611ef-f749-42b8-9d40-f986f368fabf)

Create a new version of the **Circle** class where the **draw** method will be overloaded four times:

1. The version without parameters.
2. Using the one parameter **color** of **String** type.
3. Using the one parameter **scale** of **float** type.
4. Using two parameters **color** and **scale** of **String** and **float** type.

> For correct passing of all tests don't use print and println methods in your code.
>>>>>>> task1
