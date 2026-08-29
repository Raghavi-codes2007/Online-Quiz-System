import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("================================");

System.out.println("       ONLINE QUIZ SYSTEM");

System.out.println("================================");

System.out.print("Enter your name: ");

String name = scanner.nextLine();

Question[] questions = {

Question(

"Which language is mainly used for Android development?"

new String[]{"Python" "Java" "C" "HTML"}

2

)

new Question(

"Which keyword is used to create a class in Java?"

new String[]{"class" "define" "struct" "new"}

1

)

new Question(

"Which method is the starting point of a Java program?"

new String[]{"start()" "run()" "main()" "execute()"}

3

)

};

int score = 0;

for (int i = 0; i < questions.length; i++) {

System.out.println("\nQuestion " + (i + 1) + ":");

System.out.println(questions[i].question);

for (int j = 0; j < questions[i].options.length;, j++) {

System.out.println((j + 1) + ". " + Questions[i].options[j]);

}

System.out.print("Enter your answer: ");

int answer = scanner.nextInt();

if (answer == questions[i].correctAnswer) {

System.out.println("Correct!");

score++;

}

System.out.println("Wrong!");

}

}

System.out.println("\n================================");

System.out.println("             RESULT");

System.out.println("================================");

System.out.println("Student: " + name);

System.out.println("Score: " + score + "/" + questions.length);

double percentage = (score * 100.0) / questions.length;

System.out.println("Percentage: " + percentage + "%");

scanner.close();

}

}
