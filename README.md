# Java Morse Code Converter

A robust Java application that converts morse code into English text, featuring a custom-engineered Binary Tree data structure and conversion engine, integrated into a provided JavaFX GUI framework.

## Key Engineering Features (Written by me)
* **Custom Binary Tree Engine:** Independently developed the `MorseCodeTree` to manage alphanumeric data, utilizing a dot-and-dash hierarchy to facilitate efficient $O(\log n)$ character lookups.
* **Recursive Logic Implementation:** Engineered complex recursive algorithms for tree population (`addNode`), character retrieval (`fetchNode`), and Inorder traversals.
* **Robust String Parsing:** Built a parsing engine capable of handling multi-layered delimiters (spaces for characters, slashes for words) to transform Morse code strings into clean English output.
* **Validation & Testing Suite:** Authored a dedicated unit testing suite to verify the structural integrity of the binary tree and the accuracy of the translation logic.

## Technical Engineering Highlights
* **Data Structure Design:** Implemented a generic `TreeNode<T>` class, ensuring modularity and support for deep-copy operations.
* **Interface Implementation:** Successfully implemented the `LinkedConverterTreeInterface` to ensure the custom tree met all required conversion and traversal specifications.
* **Traversal Verification:** Developed Inorder traversal logic to export tree contents into an `ArrayList`, providing a diagnostic tool for verifying the dot-and-dash mapping.
* **File-Based Conversion:** Engineered the static logic required to process external `.txt` files, converting entire documents of Morse code into English text.

## Project Structure
* **`MorseCodeTree.java`**: Core data structure logic and recursive operations.
* **`MorseCodeConverter.java`**: Primary logic engine for parsing and translation.
* **`TreeNode.java`**: Generic node definition with support for deep copies.
* **`MorseCodeTreeTest.java`**: Internal testing suite for data structure validation.
* **`MorseCodeMain.java / DriverFX.java`**: Provided JavaFX application framework for user interaction.

***

**Note:** This project was developed as part of the **Computer Science II** curriculum at **Montgomery College**. While the core binary tree engine and conversion logic were independently written by me, the graphical user interface and specific interface definitions were provided as part of the coursework framework.
