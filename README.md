
# Substitution Cipher in Java

This project is a simple **Substitution Cipher** implementation created in **Java**. It showcases the use of a fixed substitution key to encrypt messages using a straightforward character replacement technique.

## About the Project

A **Substitution Cipher** is a method of encryption where each letter (or character) in the plaintext is replaced by another letter or symbol according to a fixed key. In this project, I’ve created a program that replaces letters and digits from a user-provided message based on a **hardcoded 36-character key**.

### Key Details:
- The key is a **36-character string** consisting of **lowercase letters** (`a-z`) and **digits** (`0-9`).
- The substitution key used is:
  ```
  qwertyuiopasdfghjklzxcvbnm0123456789
  ```

Each character in the original message is mapped to a corresponding character in the key. For instance:
- `a` will become `q`
- `b` will become `w`
- `1` will become `2`
- and so on.

This method can be used to encrypt messages, but note that it is **not suitable for real-world security** due to its simplicity.

### Features:
- **Input**: The program asks the user to input the message they want to encrypt.
- **Encryption**: Using the substitution key, the program encrypts the message by replacing each character with its mapped counterpart.
- **Output**: The encrypted message is displayed in the terminal.

### Specifications:
- **Language**: Java
- **Key Length**: 36 characters (a-z, 0-9)
- **Case Handling**: Converts input to lowercase for simplicity (you can modify to handle both cases if necessary).

## How to Use

1. **Clone the Repository**:
   You can clone or download the repository to your local machine.

2. **Compile the Program**:
   In your terminal, navigate to the project directory and run:
   ```bash
   javac cipher.java
   ```

3. **Run the Program**:
   Once compiled, execute the program with:
   ```bash
   java cipher
   ```

4. **Enter the Message**:
   The program will prompt you to enter the message you wish to encrypt. It will then output the encrypted version using the substitution cipher.

### Example:

**Input**:
```
Enter the message to encrypt: nishit
```

**Output**:
```
Encrypted message: folioz
```

