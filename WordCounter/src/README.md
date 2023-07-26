WordCounter Project

The WordCounter project is a Java program that allows the user to count the number of words in a given input string or from a file. The program provides two options for the user to input text - through user input or by reading from a file. It also supports excluding common stop words from the word count.
Classes
WordCounter

The WordCounter class is the main class of the project. It provides a menu-driven user interface to let the user choose between inputting their own text or reading from a file. It also calculates the word count and handles the exclusion of stop words.
StringToArrayConverter

The StringToArrayConverter class is a utility class used by the WordCounter class to convert a given input string into an array of words. It uses a regular expression to split the input string into words. The class also contains a Set to store common stop words that are ignored during word counting.
InputStringHandler

The InputStringHandler class is a utility class that handles user input for the WordCounter program. It prompts the user to enter text and reads the input as a string using a Scanner.
InputFileHandler

The InputFileHandler class is a utility class used to read the content of a file located at a specific path. It reads the file line by line using a BufferedReader and returns the file's content as a single string.
Usage

    Run the WordCounter program.
    Choose one of the following options:
        1. User Input String: Enter your own text and press Enter. The program will calculate the word count, excluding stop words.
        2. File Input: The program will read the content of the specified file and calculate the word count, excluding stop words.
        0. Exit: Exit the program.

Dependencies

The WordCounter project does not have any external dependencies and can be executed on any Java-supported environment.
Sample Input/Output

markdown

*******************************
*   1. User Input String      *
*   2. File Input             *
*   0. Exit                   *
*******************************

Enter your choice: 1
Enter your text here:
This is a sample text. It will be used to demonstrate the WordCounter program.

Output:
Word Count: 10

*******************************
*   1. User Input String      *
*   2. File Input             *
*   0. Exit                   *
*******************************

Enter your choice: 2

Reading content from file: /Users/macBook/Desktop/CODSOFT/WordCounter/src/demo.txt

Output:
Word Count: 15

*******************************
*   1. User Input String      *
*   2. File Input             *
*   0. Exit                   *
*******************************

Enter your choice: 0

Please note that the sample input/output above is for illustrative purposes and may vary based on actual user input and the content of the file.

Feel free to customize the README.md according to your preferences and the specific details of the WordCounter project. If you have any further questions or need more assistance, feel free to ask!