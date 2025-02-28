# 🎵 Music Console App

## 📌 Overview
The **Music Console App** is a Java-based command-line music playlist manager. It allows users to add, remove, update, and navigate through their music tracks using a doubly linked list data structure.

## ✨ Features
- Add songs to the playlist (at the beginning or end)
- Remove specific songs or clear the entire playlist
- Update existing songs in the playlist
- Navigate to the next or previous track
- Display the current playing song
- View the entire playlist

## 🚀 Installation & Setup
### Prerequisites:
- Java Development Kit (JDK) installed
- Eclipse or any preferred Java IDE
- Git for version control

### Steps to Run the Project:
1. **Clone the Repository:**
   ```sh
   git clone https://github.com/siddheshpagar/music-playlist-java.git
   cd music-playlist-java
   ```
2. **Open the project in Eclipse:**
   - Navigate to `File > Open Projects from File System > Import`.
   - Select the cloned project folder.
3. **Run the Project:**
   - Locate `ProjectMusic.java` in the `src/com/group6/Main` package.
   - Right-click and select `Run As > Java Application`.

## 🎮 Usage
After running the application, use the console menu to manage your playlist:
```
0. Exit
1. Add Music to the Playlist
2. Add your Favourite Song to TOP
3. Remove Music from the Playlist
4. Remove All Music from the Playlist
5. Update Music in the Playlist
6. Navigate to Next Music
7. Navigate to Previous Music
8. Display Current Music
9. Display the Music Playlist
```
Simply enter the corresponding number to execute a command.

## 🛠 Project Structure
```
music-playlist-java/
│-- src/
│   ├── com/group6/Main/
│   │   ├── ProjectMusic.java  # Main class with console-based menu
│   ├── com/group6/Cdac/
│   │   ├── MusicDoublyList.java  # Doubly linked list for managing playlist
│   │   ├── MusicTrack.java  # Song attributes & navigation
│-- .gitignore
│-- README.md
```

## 👥 Contributors
- **Your Name** (Project Creator)  
- **Team Group 6**

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).
