---
layout: default
course_number: CS330
title: "Programming Assignment: Three Letter Match"
---

## Three Letter Match
Modify _WebClient_ and _WebServer_ programs to play the word game: Three Letter Match. The basic idea is to select a three letter set and then see how many "legal" words you can think of that contain that three letter substring.

Here are the rules:

  - The client chooses a __three letter set__ (substring) which it sends to the server. Substrings should consist of letters only (no numbers, symbols, etc.) and case should not matter.
  - The server will access a dictionary of [words](words.txt), which it will use to determine if guesses made by clients are valid.
  - Clients will then send words that they believe contain the substring to the server. The server will verify two things: first, that it is a legal word (it is in the dictionary), and two, that the substring does exist in the word.
  - If the client sends a valid word that contains the substring, the client is awarded one point. If the substring does not exist in the word or the word is not in the dictionary (or both), the client loses one point.
  - When the client can no longer think of any words containing the substring, it can send a _list_ command so the server will send back a list of all words in the dictionary containing that substring.
  - Before terminating, the client's total score should be displayed.
  - Commands should be read from standard input and display results on standard output.
  - The server should not exit until it is explicitly told to do so.
  - This should be a menu-driven application with the commands __Set__ to pick the substring, __Submit__ to submit a word to the server to see if the word is in the dictionary and if the substring exists in that word, __List__ to get all words in the dictionary that contain the current set of letters as a substring, and __Quit__ to stop playing the game and print the client's current score.

### Notes
You will need to make some design decisions. (For example: How will you handle multiple clients? How will you keep the client score? Will you allow a client to continue making guesses after a List command has been given? What if a client sends a 2 or a 4-letter substring instead of a 3-letter one?). You should include in your documentation (see below) what these design decisions were and why you chose to handle them as you did. In addition, ALL code should be well documented -- you will lose points if it is not.

Include comments in your source code indicating where, why, and how the original source code was modified. Also, include a README file, with instructions as to how your code is to be used.

### References
- [ServerSocket](https://docs.oracle.com/javase/8/docs/api/java/net/ServerSocket.html)
- [Socket](https://docs.oracle.com/javase/8/docs/api/java/net/Socket.html)
- [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)

### Submit

Post your source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus. _I may ask you to demo your program to me.__
